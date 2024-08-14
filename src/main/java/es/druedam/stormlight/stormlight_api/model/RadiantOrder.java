package es.druedam.stormlight.stormlight_api.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class RadiantOrder
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_radiant_order")
    private int idRadiantOrder;

    private String name;

    private String words;

    @ManyToOne
    @JoinColumn(name = "id_powers")
    private Powers powers;

    @OneToMany(mappedBy = "radiant_order")
    private List<Character> characters;
}
