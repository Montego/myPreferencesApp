package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
public class Type extends AbstractEntity{
    @Column
    private String name;
    @OneToMany
    private Item item;
}
