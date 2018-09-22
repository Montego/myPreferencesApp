package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
public class Genre extends AbstractEntity {
    @Column(nullable = false)
    private String name;
    @ManyToOne                      //TODO ?
    private Category category;
}
