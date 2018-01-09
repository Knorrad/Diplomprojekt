package at.spengergasse.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Cardset")
@NoArgsConstructor
@RequiredArgsConstructor
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


    @NonNull
    @NotNull
    @Column (name = "cardlist")
    List<Card> cardList = new ArrayList<>();









    @Override
    public int compareTo(Cardset o) {
        return 0;
    }
}
