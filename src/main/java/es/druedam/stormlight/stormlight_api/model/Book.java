package es.druedam.stormlight.stormlight_api.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "num_pages")
    private int numPages;

    @Column(name = "release_age")
    private Date releaseAge;
}
