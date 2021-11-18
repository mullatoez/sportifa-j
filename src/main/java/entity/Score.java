package entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "scores")
public class Score {

    @Id
    private int id;

    @Column
    private int homeTeamGoals;

    @Column
    private int awayTeamGoals;

    @OneToOne(mappedBy = "score")
    private Match match;

}
