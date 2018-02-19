package at.spengergasse.service;

import at.spengergasse.domain.Cardset;
import at.spengergasse.domain.User;
import at.spengergasse.persistance.CardsetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardsetService {

    @Autowired
    CardsetRepository cardsetRepository;

    public Cardset save(Cardset cardset){
        cardsetRepository.save(cardset);
        return cardset;
    }

    public void delete(Cardset cardset){
        cardsetRepository.delete(cardset);
    }

    public List<Cardset> getCreatedCardsetsByLoggedInUser(){
        //TODO: get logged in user
        User loggedin = null;
        return cardsetRepository.findByCreator(loggedin);
    }

    public List<Cardset> getSharedCardsetsByLoggedInUser() {
        //TODO: get logged in user
        User loggedin = null;
        return cardsetRepository.findBySharedUserlistContains(loggedin);
    }
}
