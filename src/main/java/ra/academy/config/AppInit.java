package ra.academy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration // chỉ định lơ này dùng đe cấu hình
@EnableWebMvc // sử cấu hình MVC
@ComponentScan(basePackages = "ra.academy") // quét các packages và tự đọng phát hiện component(@Controller,@Service, @Repository,@Component )
public class AppInit {
    // điịnh nghĩa bean
    // cấu hình view : jsp
    @Bean
    public ViewResolver resolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
