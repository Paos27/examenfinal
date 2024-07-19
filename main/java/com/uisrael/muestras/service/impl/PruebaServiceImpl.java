package com.uisrael.muestras.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.muestras.model.Prueba;
import com.uisrael.muestras.repository.IPruebaRepository;
import com.uisrael.muestras.service.IPruebaService;

@Service
@Component
public class PruebaServiceImpl implements IPruebaService {

	@Autowired
	private IPruebaRepository repo;

	@Override
	public void insertarPrueba(Prueba nuevoPrueba) {
		repo.save(nuevoPrueba);
	}

	@Override
	public void actualizarPrueba(Prueba actualizaPrueba) {
		repo.save(actualizaPrueba);
	}

	@Override
	public List<Prueba> listarPrueba() {
		return repo.findAll();
	}

}
