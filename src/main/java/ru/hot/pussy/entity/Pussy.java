package ru.hot.pussy.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * id serial PRIMARY KEY,
 * name VARCHAR (50) NOT NULL,
 * deep INT
 */
@Entity
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


    @ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinTable(
            name = "DICK_PUSSY",
            joinColumns = @JoinColumn(name = "pussy_id"),
            inverseJoinColumns = @JoinColumn(name = "dick_id"))
    private Set<Dick> dicks;

    public Pussy() {
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getDeep() {
        return this.deep;
    }

    public Set<Dick> getDicks() {
        return this.dicks;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }

    public void setDicks(Set<Dick> dicks) {
        this.dicks = dicks;
    }

}