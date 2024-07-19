package com.uisrael.muestras.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.muestras.model.Paciente;
import com.uisrael.muestras.repository.IPacienteRepository;
import com.uisrael.muestras.service.IPacienteService;

@Service
@Component
public class PacienteServiceImpl implements IPacienteService {

	@Autowired
	private IPacienteRepository repo;

	@Override
	public void insertarPaciente(Paciente nuevoPaciente) {
		repo.save(nuevoPaciente);
	}

	@Override
	public void actualizarPaciente(Paciente actualizaPaciente) {
		repo.save(actualizaPaciente);
	}

	@Override
	public List<Paciente> listarPaciente() {
		return repo.findAll();
	}

}
