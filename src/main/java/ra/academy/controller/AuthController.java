package ra.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.academy.model.RegisterForm;
import ra.academy.validation.RegisterFormValidator;

import javax.validation.Valid;

@Controller
public class AuthController {
    @Autowired
    private RegisterFormValidator validator;
    // Điều hướng tới form đăng kí
    @GetMapping("/sign-up")
    public String formRegister(Model model){
        // gửi modelAttribute
        model.addAttribute("formRegister",new RegisterForm());
        return "register";
    }
    @PostMapping("/sign-up")
    public String signUp(@Valid @ModelAttribute("formRegister") RegisterForm request, BindingResult result, Model model) {
        model.addAttribute("formRegister",request);
//        validator.validate(request,result);
        // xử lí dữ liệu
        if(result.hasErrors()) { // kiemr tra xem co lỗi nào hay ko
            // trả về giao diên cũ va hiện thị lỗi
            return "register";
        }else {
            // thành công - đổ thông tin ra trang mới
            return "info";
        }
    }
}
