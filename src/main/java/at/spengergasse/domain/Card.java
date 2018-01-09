package at.spengergasse.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Card")
@NoArgsConstructor
@RequiredArgsConstructor
public class Card extends BaseDomain<Card>{


    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
