package com.pruebas.springboot.microservicios.app.dao;

import java.util.List;

import com.pruebas.springboot.microservicios.app.models.entity.Alumno;

public interface AlumnoDao {
	public List<Alumno> readAll();
	public Alumno readById(Long id);
	
}
