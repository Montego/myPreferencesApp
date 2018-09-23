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
public class Rate extends AbstractEntity {
    @Column
    private Float rateOwn;
    @Column
    private Float rateKinogo;
    @Column
    private Float rateOMDb;
    @OneToOne
    private Item item;

}
