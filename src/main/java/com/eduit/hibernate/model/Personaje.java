package com.eduit.hibernate.model;

import javax.persistence.*;

/**
 * 
 */
@Entity
@Table(name = "personajes")
@Inheritance(strategy = InheritanceType.JOINED)
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "p_id")
    private Long id;
    @Column(name = "p_vida")
    private Integer vida;
    @Column(name = "p_nombre")
    private String nombre;

    public Personaje() {
    }

    public Personaje(Integer vida, String nombre) {
        this.vida = vida;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", vida=" + vida +
                '}';
    }
}
