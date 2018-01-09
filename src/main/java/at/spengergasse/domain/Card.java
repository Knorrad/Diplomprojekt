package at.spengergasse.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Card")
@NoArgsConstructor
@RequiredArgsConstructor
public class Card extends BaseDomain<Card>{

    @NonNull
    @NotNull
    @Column(name = "question")
    private String question;


    @NonNull
    @NotNull
    @Column(name = "correctAnswers")
    List<String> correctAnswers = new ArrayList<>();


    @NonNull
    @NotNull
    @Column(name = "wrongAnswers")
    List<String> wrongAnswers = new ArrayList<>();


    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
