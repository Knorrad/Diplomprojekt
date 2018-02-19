package at.spengergasse.persistance;


import at.spengergasse.domain.Card;
import at.spengergasse.domain.Cardset;
import at.spengergasse.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardsetRepository  extends CrudRepository<Cardset, Integer> {

    List<Cardset> findByCreator(User creator);

    List<Cardset> findBySharedUserlistContains(User user);
}
