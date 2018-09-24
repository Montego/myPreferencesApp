package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table
public class Item extends AbstractEntity {

    @ManyToMany(mappedBy = "itemsToUsers")
    private Collection<User> usersToItems;

    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private LocalDate year;   // TODO ?
    @ManyToOne
    private Country country;
    @ManyToOne                  //TODO ?
    private Type type;
    @ManyToOne
    private Category category;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "ITEM_GENRE",
            joinColumns = @JoinColumn(name = "ITEM_ID"),
            inverseJoinColumns = @JoinColumn(name = "GENRE_ID")
    )
    private Collection<Genre> genresToItems;

    @Column
    private String comment;
    @OneToOne
    private Rate rate;  //TODO ?
    @OneToOne
    private Score score;
    @Column(nullable = false)
    private boolean privateBoolean;
    @Column(nullable = false)
    private boolean watchedBoolean;
    @Column(nullable = false)
    private boolean importantBoolean;
}
