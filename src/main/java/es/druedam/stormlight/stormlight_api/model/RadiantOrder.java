package es.druedam.stormlight.stormlight_api.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(name = "radian_order_powers",
                       joinColumns = @JoinColumn(name = "id_radiant_order"),
                        inverseJoinColumns = @JoinColumn(name = "id_powers"))
    private Set<Powers> powers;

    @OneToMany(mappedBy = "radiant_order")
    private List<Character> characters;
}
