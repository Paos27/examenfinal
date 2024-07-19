package com.uisrael.muestras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.uisrael.muestras.model.Medico;
import com.uisrael.muestras.service.IMedicoService;

@Controller
public class MedicoController {

	@Autowired
	IMedicoService servicioMedico;
	
	//Nuevo
		@GetMapping ("/nuevomedico")
		public String crear(Model model) {
			model.addAttribute("nuevo", new Medico());
			return "/plantilla/plantilla";
		}
		
		
	//Listar
		@GetMapping ("/listarmedico")
		public String listar(Model model) {
			List<Medico> listar= servicioMedico.listarMedico();
			model.addAttribute("list", listar );
			return "/kardex/listarkardex";
		}
		
			
	//guardar
		@PostMapping("/insertarmedico")
		public String guardar(@ModelAttribute("nuevo")Medico nuevo) {
			servicioMedico.insertarMedico(nuevo);
			return "redirect:/listarkardex";
		}
			
	//editar
		@GetMapping("/editarMedico/{idmedico}")
		public String editar(@PathVariable(value="idmedico") int id, Model model) {
			Medico medicorecuperado=servicioMedico.buscarPorId(id);
			model.addAttribute("nuevo", medicorecuperado);
			return "/kardex/kardex";
			
		}
			
	//eliminar
		@GetMapping("/eliminarmedico/{idmedico}")
		public String eliminar(@PathVariable(value="idmedico")int id, Model model) {
			servicioMedico.eliminar(id);
			return "redirect:/listarkardex";
		}
		
		
}
