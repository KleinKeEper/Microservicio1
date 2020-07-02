package com.pruebas.springboot.microservicios.app.services.Imp;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pruebas.springboot.microservicios.app.dao.AlumnoDao;
import com.pruebas.springboot.microservicios.app.models.entity.Alumno;
import com.pruebas.springboot.microservicios.app.repository.AlumnoRepository;

@Service
public class AlumnoServiceImp implements AlumnoDao {

	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

	@Override
	public Alumno readById(Long id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id).orElse(null);
	}
}
