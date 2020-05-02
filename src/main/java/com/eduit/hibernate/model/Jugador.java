package com.eduit.hibernate.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 
 */
@Entity
@Table(name = "juagadores")
public class Jugador implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "j_id")
    private Long id;
    @Column(name = "j_alias")
    private String alias;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_juagador")
    private List<Equipo> equipos;

    public Jugador() {
    }

    public Jugador(String alias) {
        this.alias = alias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                ", equipos=" + equipos +
                '}';
    }
}
