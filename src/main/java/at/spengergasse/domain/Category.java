package at.spengergasse.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Category")
@NoArgsConstructor
@RequiredArgsConstructor
public class Category extends BaseDomain<Category>{



    @Override
    public int compareTo(Category o) {
        return 0;
    }
}
