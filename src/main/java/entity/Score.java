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
public class Score extends AbstractEntity{

    @Column
    private int value;
    @OneToOne
    private Item item;
}
