package com.uisrael.muestras;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.muestras.model.Departamento;
import com.uisrael.muestras.model.Medico;
import com.uisrael.muestras.model.Paciente;
import com.uisrael.muestras.service.IDepartamentoService;
import com.uisrael.muestras.service.IMedicoService;
import com.uisrael.muestras.service.IPacienteService;

@SpringBootTest
class MuestrasApplicationTests {

	@Autowired
	IDepartamentoService servicioDepartamento;
	@Autowired
	IPacienteService servicioPaciente;
	@Autowired
	IMedicoService servicioMedico;


	@Test
	void contextLoads() {

		

		
		
		// NUEVOS PACIENTES
		Paciente nuevoP = new Paciente();
		nuevoP.setApellidoPaciente("Perez");
		nuevoP.setCedulaPaciente("123456678890");
		nuevoP.setDireccionPaciente("Mena 2");
		nuevoP.setHistoriaPaciente("1234567789");
		nuevoP.setNombrePaciente("Juan");
		nuevoP.setEstado(true);
		servicioPaciente.insertarPaciente(nuevoP);
		
		Paciente nuevoP2 = new Paciente();
		nuevoP2.setApellidoPaciente("Alvarez");
		nuevoP2.setCedulaPaciente("0987654321");
		nuevoP2.setDireccionPaciente("Mena 2");
		nuevoP2.setHistoriaPaciente("0987654321");
		nuevoP2.setNombrePaciente("Diego");
		nuevoP2.setEstado(true);
		servicioPaciente.insertarPaciente(nuevoP);
		
		List<Paciente> listaP2 = servicioPaciente.listarPaciente();
		for (Paciente paciente : listaP2) {
			System.out.println(paciente.getApellidoPaciente());
		}
		
		
		
		// NUEVO MEDICO
				Medico nuevoM = new Medico();
				nuevoM.setApellidoMedico("Lopez");
				nuevoM.setCedulaMedico("123456678890");
				nuevoM.setNombreMedico("Pablo");
				nuevoM.setTelefonoMedico("09898765");
				nuevoM.setEstado(true);
				servicioMedico.insertarMedico(nuevoM);
				
				Medico nuevoM1 = new Medico();
				nuevoM.setApellidoMedico("Galindez");
				nuevoM.setCedulaMedico("1212123345");
				nuevoM.setNombreMedico("Byron");
				nuevoM.setTelefonoMedico("09999898");
				nuevoM.setEstado(true);
				servicioMedico.insertarMedico(nuevoM1);
				
				List<Medico> listaM = servicioMedico.listarMedico();
				for (Medico medico : listaM) {
					System.out.println(medico.getApellidoMedico());
				}
		
				
				//NUEVAS SOLICITUDES
				
		
				// NUEVOS DEPARTAMENTOS
				Departamento nuevo = new Departamento();
				nuevo.setNombreDepartamento("hematología");
				nuevo.setAreaDepartamento("hematología");
				nuevo.setEstado(true);
				servicioDepartamento.insertarDepartamento(nuevo);
				
				
				Departamento nuevo1 = new Departamento();
				nuevo1.setNombreDepartamento("microbiología");
				nuevo1.setAreaDepartamento("microbiología");
				nuevo1.setEstado(true);
				servicioDepartamento.insertarDepartamento(nuevo1);

				Departamento nuevo2 = new Departamento();
				nuevo2.setNombreDepartamento("química clínica");
				nuevo2.setAreaDepartamento("química clínica");
				nuevo2.setEstado(true);
				servicioDepartamento.insertarDepartamento(nuevo2);
				
				List<Departamento> lista = servicioDepartamento.listarDepartamentos();
				for (Departamento departamento : lista) {
					System.out.println(departamento.getAreaDepartamento());
				}
		
	}

}
