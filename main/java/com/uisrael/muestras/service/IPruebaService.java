package com.uisrael.muestras.service;

import java.util.List;

import com.uisrael.muestras.model.Prueba;

public interface IPruebaService {
	public void insertarPrueba(Prueba nuevoPrueba);
	public void actualizarPrueba(Prueba actualizaPrueba);
	public List<Prueba> listarPrueba();
	

}
