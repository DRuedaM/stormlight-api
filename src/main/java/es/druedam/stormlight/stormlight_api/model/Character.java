package es.druedam.stormlight.stormlight_api.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "character_")
@Getter
@Setter
@Data
public class Character
{
    @Id
    @Column(name = "id_character")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCharacter;

    @Column
    private String name;

    @Column(name = "other_name")
    private String otherName;

    @Column
    private String profession;

    @ManyToOne
    @JoinColumn(name = "id_race")
    private Race race;

    @ManyToOne
    @JoinColumn(name = "id_location")
    private Location birthplace;

    @ManyToOne
    @JoinColumn(name = "id_radiant_order")
    private RadiantOrder radiant_order;
}
