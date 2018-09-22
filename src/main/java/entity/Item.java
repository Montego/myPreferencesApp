package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table
public class Item extends AbstractEntity {
    @ManyToMany
    private User user;
    @Column(nullable = false,unique = true)
    private String name;
    @Column(nullable = false)
    private LocalDate date;   // TODO ?
    @ManyToOne
    private Country country;
    @ManyToOne                  //TODO ?
    private Type type;
    @ManyToOne
    private Category category;
    @ManyToMany
    private Genre genre;
    @Column
    private String comment;

    private Rate rate;  //TODO ?
    @OneToOne
    private Score score;
    @Column(nullable = false)
    private boolean isPrivate;
    @Column(nullable = false)
    private boolean isWathced;
    @Column(nullable = false)
    private boolean isImportant;
}
