package com.eduit.hibernate.dao;

import com.eduit.hibernate.model.Jugador;

import javax.persistence.EntityManager;

/**
 * 
 */
public class JugadorDao extends GenericDao<Jugador,Long> {

    public JugadorDao(EntityManager entityManager) {
        super(entityManager);
    }

}
