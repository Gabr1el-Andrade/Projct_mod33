package com.tgabriel.project_marca.dao;

import com.tgabriel.project_marca.Acessorio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AcessorioDao implements IAcessorio{
    @Override
    public Acessorio cadastrar(Acessorio ac) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("RESOURCE_LOCAL");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist((ac));
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return ac;
    }
}
