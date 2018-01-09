package at.spengergasse.domain;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

@Data
@MappedSuperclass
@EqualsAndHashCode(callSuper = true)
public abstract class BaseDomain<T> extends AbstractPersistable<Integer> implements Comparable<T>, Cloneable, Serializable {

    @Version
    private int version;

}
