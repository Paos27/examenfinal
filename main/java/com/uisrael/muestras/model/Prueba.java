package com.uisrael.muestras.model;

import java.io.Serializable;
import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_prueba")
public class Prueba implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPrueba;
	private String nombrePrueba;
	private String tipoPrueba;
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	private boolean estado;
	
	@ManyToOne
	@JoinColumn (name = "fkSolicitud")
	private Solicitud fkSolicitud;
	
	

}
