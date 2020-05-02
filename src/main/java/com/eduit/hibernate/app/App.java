package com.eduit.hibernate.app;

import com.eduit.hibernate.dao.JugadorDao;
import com.eduit.hibernate.model.*;
import com.eduit.hibernate.util.EntityManagerProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App{


    public static void main(String[] args) 
        
    
  {


        Jugador coco = new Jugador("coco");


        Equipo equipoCoco = new Equipo("equipo_coco");
        List<Equipo> equipos = new ArrayList<>();
        equipos.add(equipoCoco);
        coco.setEquipos(equipos);



        Personaje mago = new Mago(100,"mago",100);
        Personaje guerrero =new Guerrero(100,"guerrero",100);
        Personaje guerrero2 =new Guerrero(80,"guerrero2",90);

        List<Personaje> personajes = new ArrayList<>();
        personajes.add(mago);
        personajes.add(guerrero);
        personajes.add(guerrero2);

        equipoCoco.setPersonajes(personajes);



        JugadorDao jugadorDao = new JugadorDao(EntityManagerProvider.getInstance().getEntityManager());


        jugadorDao.persist(coco);


        EntityManagerProvider.getInstance().close();




    }
}
