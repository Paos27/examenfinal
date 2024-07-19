package com.uisrael.muestras.service;

import java.util.List;


import com.uisrael.muestras.model.Medico;

public interface IMedicoService {
	
	public void insertarMedico(Medico nuevoMedico);
	public void actualizarMedico(Medico actualizaMedico);
	public List<Medico> listarMedico();
	public Medico buscarPorId(int id);
	public void eliminar (int id);


}
