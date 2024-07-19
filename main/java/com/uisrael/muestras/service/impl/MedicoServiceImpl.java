package com.uisrael.muestras.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.muestras.model.Medico;
import com.uisrael.muestras.repository.IMedicoRepository;
import com.uisrael.muestras.service.IMedicoService;

@Service
@Component
public class MedicoServiceImpl implements IMedicoService {

	@Autowired
	private IMedicoRepository repo;

	@Override
	public void insertarMedico(Medico nuevoMedico) {
		repo.save(nuevoMedico);
	}

	@Override
	public void actualizarMedico(Medico actualizaMedico) {
		repo.save(actualizaMedico);

	}

	@Override
	public List<Medico> listarMedico() {
		return repo.findAll();
	}

	@Override
	public Medico buscarPorId(int id) {
		try {
			return repo.findById(id).get();
		} catch (Exception e) {
			System.out.println("Error en busqueda");
		}
		return null;
	}

	@Override
	public void eliminar(int id) {
		try {
			repo.deleteById(id);
		} catch (Exception e) {
			System.out.println("Error al eliminar");
		}
	}

}
