package at.spengergasse.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Cardset")
@NoArgsConstructor
@RequiredArgsConstructor

//This is the class for our Cardsets for subjects (zb. Geschichte, Deutsch, Geografie,..) with a list filled with cards
//The difference between Category and Cardset is that Category is a Table filled with subject and Cardset is a set of Cards of an specific subject
public class Cardset extends BaseDomain<Cardset> {

    @NonNull
    @NotNull
    @Column(name = "category")
    private Category category;


    @NonNull
    @NotNull
    @Column(name = "name")
    private String name;


    @NonNull
    @NotNull
    @Column(name = "creator")
    private User creator;

    @OneToMany
    @NonNull
    @NotNull
    @Column (name = "cardlist")
    List<Card> cardList = new ArrayList<>();


    //This list is there in order to share cardlists between users, cant come up with a convenient name for it lol
    @OneToMany
    @NonNull
    @NotNull
    @Column (name ="sharedUserlist")
    List<User> sharedUserlist = new ArrayList<>();








    @Override
    public int compareTo(Cardset o) {
        return 0;
    }
}
