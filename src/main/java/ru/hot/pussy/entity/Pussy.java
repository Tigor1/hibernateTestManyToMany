package ru.hot.pussy.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * id serial PRIMARY KEY,
 * name VARCHAR (50) NOT NULL,
 * deep INT
 */
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
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

    @Override
    public String toString() {
        return "[Egor (id = 1, name = Egor)]";
    }


    //    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "DICK_PUSSY",
//            joinColumns = @JoinColumn(name = "pussy_id"),
//            inverseJoinColumns = @JoinColumn(name = "dick_id"))
//    private Set<Dick> dicks;
}
