package es.druedam.stormlight.stormlight_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "location")
@Data
public class Location
{
    @Id
    @Column(name = "id_location")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "place_name")
    private String placeName;

    @OneToMany(mappedBy = "birthplace")
    @JsonIgnore
    private List<Character> characters;


}
