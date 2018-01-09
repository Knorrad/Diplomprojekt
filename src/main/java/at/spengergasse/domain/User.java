package at.spengergasse.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Data
@Entity
@Table(name ="User")
@NoArgsConstructor
@RequiredArgsConstructor

//Obviously the User class is here in order to form a account system (login)
public class User extends BaseDomain<User>{

    @NotNull
    @NonNull
    @Size(min = 3, max = 35)
    @Column(name="username")
    private String username;


    @NotNull
    @NonNull
    @Column(name = "password")
    //Minimum eight characters, at least one uppercase letter, one lowercase letter and one number
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")
    private String password;

    @Override
    public int compareTo(User o) {
        return getUsername().compareTo(o.getUsername());
    }
}
