package com.apiRest.gestorPropuestas.repositorios;

import com.apiRest.gestorPropuestas.entities.Propuesta;
import org.springframework.data.jpa.repository.JpaRepository;

//hacen la comunicacion con la base de datos, vienen con los metodos ya listos para
//poder comunicarnos mas facil
public interface PropuestaRepo extends JpaRepository<Propuesta, String> {
}
