package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table
public class Genre extends AbstractEntity {
    @Column(nullable = false)
    private String name;
    @ManyToOne                      //TODO ?
    private Category category;

    @ManyToMany(mappedBy = "genresToItems")
    private Collection<Item> itemsToGenres;

}
