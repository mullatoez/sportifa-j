package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "kit")
    private int kitNumber;

    @Column(name = "position")
    private String position;

    @Column(name = "country")
    private String country;

    @Column(name = "dob")
    private Date dateOfBirth;

    @ManyToOne()
    @JoinColumn(name = "id_team")
    private Team team;
}
