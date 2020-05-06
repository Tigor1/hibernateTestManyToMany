package ru.hot.pussy.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * CREATE TABLE DICK  (
 *     id serial PRIMARY KEY,
 *     name VARCHAR (50) NOT NULL,
 *     owner_name VARCHAR (50) NOT NULL,
 *     length INT
 * );
 */
@Entity
public class Dick {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "owner_name", nullable = false)
    private String ownerName;

    @Column()
    private int length;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "DICK_PUSSY",
            joinColumns = @JoinColumn(name = "dick_id"),
            inverseJoinColumns = @JoinColumn(name = "pussy_id"))
    private Set<Pussy> pussies;

    public Dick() {
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

    public int getLength() {
        return this.length;
    }

    public Set<Pussy> getPussies() {
        return this.pussies;
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

    public void setLength(int length) {
        this.length = length;
    }

    public void setPussies(Set<Pussy> pussies) {
        this.pussies = pussies;
    }

}
