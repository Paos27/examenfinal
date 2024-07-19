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
@Table(name = "tb_medico")
public class Medico implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMedico;
	private String nombreMedico;
	private String apellidoMedico;
	private String cedulaMedico;
	private String telefonoMedico;
	private boolean estado;

	
	@ManyToOne
	@JoinColumn (name = "fk_idDepartamento")
	private Departamento fkDepartamento;
	
	@OneToMany (mappedBy = "fkMedico")
	private List<Solicitud> listaSolicitud=new ArrayList<>();
}
