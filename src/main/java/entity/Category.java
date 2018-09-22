package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
public class Category extends  AbstractEntity {
    @Column(nullable = false)
    private String name;
    @OneToOne
    private Type type;
}
