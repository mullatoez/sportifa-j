package entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "manager")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne()
    @JoinColumn(name = "team_contract_id")
    private TeamContract teamContract;
}
