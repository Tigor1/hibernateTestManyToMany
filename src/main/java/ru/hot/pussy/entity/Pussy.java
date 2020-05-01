package ru.hot.pussy.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 *  id serial PRIMARY KEY,
 *     name VARCHAR (50) NOT NULL,
 *     deep INT
 */
@Entity
@Data
public class Pussy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "owner_name", nullable = false)
    private String ownerName;

    @Column(nullable = false)
    private int deep;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "DICK_PUSSY",
            joinColumns = @JoinColumn(name = "pussy_id"),
            inverseJoinColumns = @JoinColumn(name = "dick_id"))
    private Set<Dick> dicks;
}
