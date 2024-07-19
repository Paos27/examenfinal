package com.uisrael.muestras.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.muestras.model.Departamento;
import com.uisrael.muestras.repository.IDepartamentoRepository;
import com.uisrael.muestras.service.IDepartamentoService;

@Service
@Component
public class DepartamentoServiceImpl implements IDepartamentoService {
	
	@Autowired
	private IDepartamentoRepository repo;

	@Override
	public void insertarDepartamento(Departamento nuevoDepartamento) {
		repo.save(nuevoDepartamento);
	}

	@Override
	public void actualizarDepartamento(Departamento actualizaDepartamento) {
		repo.save(actualizaDepartamento);		
	}

	@Override
	public List<Departamento> listarDepartamentos() {
		return repo.findAll();
	}

}
