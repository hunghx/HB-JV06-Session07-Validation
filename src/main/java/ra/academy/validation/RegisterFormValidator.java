package ra.academy.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ra.academy.model.RegisterForm;
@Component
public class RegisterFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(RegisterForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // ép kểu về Register form
        RegisterForm request = (RegisterForm) target;
        // kiểm tra tính đúng đắn theo yêu câu
        if (request.getFirstName().isEmpty()){
            // nem ra thông báo lỗi
            errors.rejectValue("firstName",null,"Không đc để trống!");
        } else if (request.getFirstName().matches("\\s")) {
            errors.rejectValue("firstName",null,"Không đc chứa kí tự khoảng trắng!");
        }

        if(!request.getEmail().matches("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$")){
            errors.rejectValue("email",null,"Không đúng định dạng email!");
        }

        if(!request.getPassword().equals(request.getConfirmPassword())){
            errors.rejectValue("confirmPassword",null,"Mật khẩu không khơp!");
        }

    }
}
