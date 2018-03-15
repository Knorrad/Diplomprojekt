package at.spengergasse.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Collection;


@Data
@Entity
@Table(name ="User")
@NoArgsConstructor
@RequiredArgsConstructor

//Obviously the User class is here in order to form a account system (login)
public class User extends BaseDomain<User> implements UserDetails{

    @NotNull
    @NonNull
    @Size(min = 3, max = 35)
    @Column(name="username")
    private String username;


    @NotNull
    @NonNull
    @Column(name = "password")
    //Minimum eight characters, at least one uppercase letter, one lowercase letter and one number
   // @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$")
    private String password;


    @NotNull
    @NonNull
    @Column(name = "firstname")
    private String firstname;

    @NotNull
    @NonNull
    @Column(name = "lastname")
    private String lastname;

    @NotNull
    @NonNull
    @Column(unique = true,name = "email")
    private String email;

    @Override
    public int compareTo(User o) {
        return getUsername().compareTo(o.getUsername());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
