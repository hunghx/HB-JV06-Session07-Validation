package ra.academy.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // cấu hình gốc : ko liên quan tới MVC
        return new Class[0];
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        // cau hình lien quan tới MVC
        return new Class[]{AppInit.class};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    // xử lí utf-8
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter("utf-8", true);
        return new Filter[]{filter};
    }
}
