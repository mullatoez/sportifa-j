package entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "leagues")
public class League implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int capacity;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "league",cascade = CascadeType.ALL)
    private List<Team> teams;

}
