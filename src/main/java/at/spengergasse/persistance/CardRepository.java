package at.spengergasse.persistance;


import at.spengergasse.domain.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Integer> {



}
