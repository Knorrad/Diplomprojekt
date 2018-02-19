package at.spengergasse.persistance;


import at.spengergasse.domain.Cardset;
import at.spengergasse.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByUsername(String username);


}
