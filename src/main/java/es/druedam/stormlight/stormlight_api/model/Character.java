package es.druedam.stormlight.stormlight_api.model;

import jakarta.persistence.*;

@Entity
@Table
public class Character
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_character")
    private int idCharacter;

    private String name;

    @Column(name = "other_name")
    private String otherName;


    private String profession;

    private String race;

    @ManyToOne
    @JoinColumn(name = "id_location")
    private Location birthplace;

    @ManyToOne
    @JoinColumn(name = "id_radiant_order")
    private RadiantOrder radiant_order;
}
