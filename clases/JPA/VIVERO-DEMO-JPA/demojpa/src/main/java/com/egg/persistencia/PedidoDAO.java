package com.egg.persistencia;


import com.egg.entidades.Pedido;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class PedidoDAO {


    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("ViveroPU");
    private final EntityManager em = emf.createEntityManager();


    public void guardaPago(Pedido pedido) throws Exception {
        em.getTransaction().begin();
        em.persist(pedido);
        em.getTransaction().commit();
    }


}