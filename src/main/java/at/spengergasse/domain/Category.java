package at.spengergasse.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "Category")
@NoArgsConstructor
@RequiredArgsConstructor

//This is our class for the Category with a Table filled with subjects(zb. Geschichte, Deutsch, Geografie,..)
public class Category extends BaseDomain<Category>{

    @NonNull
    @NotNull
    @Column(name = "name")
    private String name;


    @Override
    public int compareTo(Category o) {
        return 0;
    }
}
