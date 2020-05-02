package com.eduit.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * 
 */
@Entity
@PrimaryKeyJoinColumn(name = "g_id")
public class Guerrero extends Personaje {

    @Column(name = "g_fuerza")
    private Integer fuerza;

    public Guerrero() {
    }

    public Guerrero(Integer vida, String nombre, Integer fuerza) {
        super(vida, nombre);
        this.fuerza = fuerza;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }
}
