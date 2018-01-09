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
@Table(name = "Group")
@NoArgsConstructor
@RequiredArgsConstructor

//This class is here in order to form Groups like in whatsapp so the users cann later share the Cardsets
public class Group extends BaseDomain<Group> {


    @NonNull
    @NotNull
    @Column(name = "userlist")
    List<User> userList = new ArrayList<>();


    @NonNull
    @NotNull
    @Column(name = "cardsetlist")
    List<Cardset> cardsetList = new ArrayList<>();


    @Override
    public int compareTo(Group o) {
        return 0;
    }
}
