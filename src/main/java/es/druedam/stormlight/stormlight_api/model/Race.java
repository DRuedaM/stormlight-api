package es.druedam.stormlight.stormlight_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "race")
@Getter
@Setter
@Data
public class Race
{
    @Id
    @Column(name = "id_race")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRace;

    @Column(name = "race_name")
    private String raceName;

    @Column(name = "race_description")
    private String race_description;

    @OneToMany(mappedBy = "race")
    @JsonIgnore
    private List<Character> characters;
}
