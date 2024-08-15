package es.druedam.stormlight.stormlight_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "radiant_orders")
@Getter
@Setter
@Data
public class RadiantOrder
{
    @Id
    @Column(name = "id_radiant_order")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRadiantOrder;
    @Column
    private String name;
    @Column
    private String words;

    @ManyToMany
    @JoinTable(name = "radian_order_powers",
                       joinColumns = @JoinColumn(name = "id_radiant_order"),
                        inverseJoinColumns = @JoinColumn(name = "id_powers"))
    private Set<Powers> powers;

    @OneToMany(mappedBy = "radiant_order")
    @JsonIgnore
    private List<Character> characters;
}
