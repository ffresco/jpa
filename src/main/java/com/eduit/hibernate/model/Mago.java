package com.eduit.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * 
 */
@Entity
@PrimaryKeyJoinColumn(name = "m_id")
public class Mago extends Personaje{

    @Column(name = "m_magia")
    private Integer magia;

    public Mago() {

    }

    public Mago(Integer vida, String nombre, Integer magia) {
        super(vida, nombre);
        this.magia = magia;
    }

    public Integer getMagia() {
        return magia;
    }

    public void setMagia(Integer magia) {
        this.magia = magia;
    }
}
