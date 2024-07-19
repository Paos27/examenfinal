package com.uisrael.muestras.service;

import java.util.List;

import com.uisrael.muestras.model.Departamento;

public interface IDepartamentoService {
	public void insertarDepartamento(Departamento nuevoDepartamento);
	public void actualizarDepartamento(Departamento actualizaDepartamento);
	public List<Departamento> listarDepartamentos();


}
