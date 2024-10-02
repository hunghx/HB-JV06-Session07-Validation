package ra.academy.model;

import lombok.*;

import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegisterForm {
    @NotBlank(message = "Không đc đc trôngs")
    @Size(min = 2, max = 10,message = "Phải từ 2-> 10 kí tu")
    private String firstName;
    @NotBlank
    @Size(min = 4, max = 20)
    private String lastName;
//  @Email
    @Pattern(regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$")
    private String email;
    @NotNull(message = "ko đc mang gia trị null")
    private String password;
    @NotEmpty(message = "độ dài chuỗi pha > 0")
    private String confirmPassword;
}
