package at.spengergasse.domain.form;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class LoginForm {

    String username;
    String password;
}