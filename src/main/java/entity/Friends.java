package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table
public class Friends extends AbstractEntity {
    @OneToMany(mappedBy = "friendsToUsers")
    private Collection<User> usersToFriends;

}
