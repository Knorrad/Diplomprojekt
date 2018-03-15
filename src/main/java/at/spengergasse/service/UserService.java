package at.spengergasse.service;


import at.spengergasse.domain.User;
import at.spengergasse.persistance.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetails user = userRepository.findByUsername(s);
        if (user == null){
            throw new UsernameNotFoundException("Falsche Anmeldeinformationen");
        }
        return user;
    }


    public User saveUser(User user){
        userRepository.save(user);
        return user;
    }

}
