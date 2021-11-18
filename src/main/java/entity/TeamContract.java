package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "team_contracts")
public class TeamContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "start")
    private Date startContract;

    @Column(name = "end")
    private Date endContract;

    @OneToOne(mappedBy = "teamContract")
    private Manager manager;

}
