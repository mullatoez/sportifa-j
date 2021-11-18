package entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "matches")
public class Match {

    @Id
    private int id;

    @Column
    private Date date_time;

    private int attendance;

    private String homeTeam;

    private String awayTeam;

    private String status;

    @ManyToMany
    @JoinColumn(name = "id_league")
    private List<League> league;

    @ManyToOne
    @JoinColumn(name = "id_stadium")
    private Stadium stadium;

    @OneToOne
    @JoinColumn(name = "id_score")
    private Score score;

    public void matchForfeited(){
        this.status = "SUSPENDED";
    }
}
