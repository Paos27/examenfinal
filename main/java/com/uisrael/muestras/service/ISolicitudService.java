package com.uisrael.muestras.service;

import java.util.List;

import com.uisrael.muestras.model.Solicitud;

public interface ISolicitudService {
	public void insertarSolicitud(Solicitud nuevoSolicitud);
	public void actualizarSolicitud(Solicitud actualizaSolicitud);
	public List<Solicitud> listarSolicitud();

}
