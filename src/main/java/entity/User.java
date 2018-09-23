package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;


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
    @OneToMany                       //TODO ?
    private Authority authority;
    @OneToMany
    private Friends friends;
    @Column
    private Timestamp registrated;
                                    //TODO ?
    private byte photo;
    @ManyToMany
    private Item item;

    public User(String nickname,String email, String password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public User() {
    }
}
