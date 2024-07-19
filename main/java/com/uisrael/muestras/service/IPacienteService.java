package com.uisrael.muestras.service;

import java.util.List;

import com.uisrael.muestras.model.Paciente;

public interface IPacienteService {
	public void insertarPaciente(Paciente nuevoPaciente);
	public void actualizarPaciente(Paciente actualizaPaciente);
	public List<Paciente> listarPaciente();

}
