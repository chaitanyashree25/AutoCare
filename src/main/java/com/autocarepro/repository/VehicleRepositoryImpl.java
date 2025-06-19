package com.autocarepro.repository;

import com.autocarepro.model.Vehicle;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VehicleRepositoryImpl implements VehicleRepositoryCustom{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Vehicle> findByModelIgnoreCase(String model){
        String jpql = "SELECT v FROM Vehicle v WHERE LOWER(v.model) = LOWER(:model)";
        TypedQuery<Vehicle> query = entityManager.createQuery(jpql, Vehicle.class);
        query.setParameter("model",model);
        return query.getResultList();
    }
}
