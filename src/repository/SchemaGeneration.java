/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Cliente;

/**
 *
 * @author mpisching
 */
public class SchemaGeneration {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ClientesPU");

        EntityManager em = emf.createEntityManager();

        List<Cliente> lista = em.createQuery("from Cliente", Cliente.class)
                .getResultList();

        System.out.println(lista);

        em.close();
        emf.close();
    }

}
