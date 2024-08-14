package es.druedam.stormlight.stormlight_api.model;

import jakarta.persistence.*;

@Entity
@Table
public class Powers
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_powers")
    private int idPowers;

    private String name;

    private String resume;

    private String rules;

    private String effects;
}
