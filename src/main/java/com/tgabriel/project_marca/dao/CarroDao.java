package com.tgabriel.project_marca.dao;

import com.tgabriel.project_marca.Carro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarroDao implements ICarroDao{
    @Override
    public Carro cadastrar(Carro carro) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("RESOURCE_LOCAL");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist((carro));
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return null;
    }
}
