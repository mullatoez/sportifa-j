package entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "teams")
public class Team implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String shorthand;

    @OneToOne()
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @OneToOne()
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

    @ManyToOne
    @JoinColumn(name = "league_id")
    private League league;

    @OneToMany(mappedBy = "team")
    private List<Player> players;

    private int homeWins;

    private int homeDraws;

    private int homeDefeats;

    private int homeFor;

    private int homeAgainst;

    private int awayWins;

    private int awayDraws;

    private int awayDefeats;

    private int awayFor;

    private int awayAgainst;

}
