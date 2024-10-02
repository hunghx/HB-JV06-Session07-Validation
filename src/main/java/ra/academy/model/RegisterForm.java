package ra.academy.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegisterForm {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;
}
