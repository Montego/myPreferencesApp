package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;


@Getter
@Setter
@Entity
@Table
public class User extends AbstractEntity {
    @Column(nullable = false,unique = true)
    private String nickname;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @ManyToOne
    private Authority authority;
    @Column
    private Timestamp registrated;
    @Column                                //TODO ?
    private byte photo;


 //*********************************************************************************************************************
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_FRIENDS",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "FRIENDS_ID")
    )
    private Collection <Friends> friendsToUsers;
    //*********************************************************************************************************************
    //*********************************************************************************************************************
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ITEM",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
    )
    private Collection<Item> itemsToUsers;
    //*********************************************************************************************************************


    public User(String nickname,String email, String password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public User() {
    }
}
