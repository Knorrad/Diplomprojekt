package at.spengergasse.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Card")
@NoArgsConstructor
@RequiredArgsConstructor

//This is the class for our CueCards filled with lists of wrong and right answers
public class Card extends BaseDomain<Card>{

    @NonNull
    @NotNull
    @Column(name = "question")
    private String question;

    @ElementCollection
    @NonNull
    @NotNull
    @Column(name = "correctAnswers")
    List<String> correctAnswers = new ArrayList<>();

    @ElementCollection
    @NonNull
    @NotNull
    @Column(name = "wrongAnswers")
    List<String> wrongAnswers = new ArrayList<>();


    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
