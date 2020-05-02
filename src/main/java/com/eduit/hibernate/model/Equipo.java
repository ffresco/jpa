package com.eduit.hibernate.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 
 */
@Entity
@Table(name = "equipo")
public class Equipo implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "e_id")
    private Long id;

    @Column(name = "e_nombre_equipo")
    private String nombreEquipo;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "equipos_personajes",
               joinColumns = @JoinColumn(name = "fk_equipo"),
               inverseJoinColumns = @JoinColumn(name = "fk_personaje"))
    private List<Personaje> personajes;


    public Equipo() {
    }

    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", personajes=" + personajes +
                '}';
    }
}
