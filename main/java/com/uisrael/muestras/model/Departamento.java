package com.uisrael.muestras.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_departamento")
public class Departamento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDepartamento;
	private String nombreDepartamento;
	private String areaDepartamento;
	private boolean estado;

	@OneToMany  (mappedBy = "fkDepartamento")
	private List<Medico> listaMedico=new ArrayList<>();	
}
