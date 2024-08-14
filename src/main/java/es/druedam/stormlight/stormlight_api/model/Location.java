package es.druedam.stormlight.stormlight_api.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Location
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_location")
    private int id;

    @Column(name = "place_name")
    private String placeName;

    @OneToMany(mappedBy = "birthplace")
    private List<Character> characters;


}
