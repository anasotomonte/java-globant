package com.egg.persistencia;


import com.egg.entidades.DetallePedido;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class DetallePedidoDAO {


    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
    private final EntityManager em = emf.createEntityManager();


    public void guardaDetallePedido(DetallePedido detallePedido) throws Exception {
        em.getTransaction().begin();
        em.persist(detallePedido);
        em.getTransaction().commit();
    }


}