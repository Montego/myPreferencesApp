package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Authority extends AbstractEntity{
    @Column(nullable = false)
    private String role;
}
