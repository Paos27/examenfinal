package com.uisrael.muestras.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity

@Table(name = "tb_solicitud")
public class Solicitud implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSolicitud;
	private String numeroSolicitud;
	private boolean estado;
	
	@OneToMany (mappedBy = "fkSolicitud")
	private List<Prueba> listaPrueba=new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "fk_idMedico")
	private Medico fkMedico;
	
	
	@ManyToOne
	@JoinColumn(name = "fk_idPaciente")
	private Paciente fkPaciente;
	
	
	


}
