package es.druedam.stormlight.stormlight_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
@Getter
@Setter
@Data
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

    @Column(name = "num_pages")
    private int numPages;

    @Column(name = "release_age")
    private Date releaseAge;
}
