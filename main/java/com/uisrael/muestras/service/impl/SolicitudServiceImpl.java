package com.uisrael.muestras.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.muestras.model.Solicitud;
import com.uisrael.muestras.repository.ISolicitudRepository;
import com.uisrael.muestras.service.ISolicitudService;

@Service
@Component
public class SolicitudServiceImpl implements ISolicitudService {

	private ISolicitudRepository repo;

	@Override
	public void insertarSolicitud(Solicitud nuevoSolicitud) {
		repo.save(nuevoSolicitud);
	}

	@Override
	public void actualizarSolicitud(Solicitud actualizaSolicitud) {
		repo.save(actualizaSolicitud);
	}

	@Override
	public List<Solicitud> listarSolicitud() {
		return repo.findAll();
	}

}
