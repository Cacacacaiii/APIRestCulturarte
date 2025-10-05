package com.apiRest.gestorPropuestas.repositorios;

import com.apiRest.gestorPropuestas.entities.Colaboracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColabRepo extends JpaRepository<Colaboracion, Integer> {
}

