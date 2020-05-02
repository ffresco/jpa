package com.eduit.hibernate.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 */
public class EntityManagerProvider {

    private static EntityManagerProvider instance;
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;


    private EntityManagerProvider() {
        //Este metodo el createEntity.. es equivalente al configuration de hibernate
        //Eso va al archivo persistance.xml que eta dentro de meta-inf del proyecto
        //y me devuelve un entitymanager que tiene todo lo que me devolvia el configuration de hibernate
        entityManagerFactory = Persistence.createEntityManagerFactory("pu");
    }


    public static EntityManagerProvider getInstance() {
        if(instance == null){
            instance = new EntityManagerProvider();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }

    public void close(){
        entityManager.close();
        entityManagerFactory.close();
    }

}
