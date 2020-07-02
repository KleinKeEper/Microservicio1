package com.pruebas.springboot.microservicios.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.springboot.microservicios.app.models.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
