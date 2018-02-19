package at.spengergasse.service;

import at.spengergasse.domain.Card;
import at.spengergasse.persistance.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    public Card save(Card card){
        cardRepository.save(card);
        return card;
    }
}
