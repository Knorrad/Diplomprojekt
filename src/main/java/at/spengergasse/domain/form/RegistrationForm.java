package at.spengergasse.domain.form;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@ToString
public class RegistrationForm {

    @NotNull
    @NotEmpty
    String username;

    @NotNull
    @NotEmpty
    String password;

    @NotNull
    @NonNull
    String firstname;

    @NotNull
    @NonNull
    String lastname;

    @NotNull
    @NonNull
    String email;

    //@AssertTrue
    //Boolean conditions;
}
