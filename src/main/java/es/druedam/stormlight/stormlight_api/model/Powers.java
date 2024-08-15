package es.druedam.stormlight.stormlight_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "powers")
@Getter
@Setter
@Data
public class Powers
{

    @Id
    @Column(name = "id_powers")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPowers;

    @Column
    private String name;
    @Column
    private String resume;
    @Column
    private String rules;
    @Column
    private String effects;

    @ManyToMany(mappedBy = "powers")
    @JsonIgnore
    private List<RadiantOrder> radiantOrders;
}
