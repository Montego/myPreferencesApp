package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table
public class Country extends AbstractEntity {
    @Column(nullable = false,unique = true)
    private String name;


}
