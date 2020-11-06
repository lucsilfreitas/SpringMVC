package com.mballen.curso.boot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mballen.curso.boot.domain.Cargo;
import com.mballen.curso.boot.domain.Departamento;
import com.mballen.curso.boot.service.CargoService;
import com.mballen.curso.boot.service.DepartamentoService;

@Controller
@RequestMapping("/cargos")
public class CargoController {

	@Autowired
	private CargoService cargoService;
	
	@Autowired
	private DepartamentoService departamentoService;
	
	
	@GetMapping("/cadastrar")
	public String cadastrar( Cargo cargo) {
		return "/cargo/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/cargo/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Cargo cargo, RedirectAttributes attr) {
		cargoService.salvar(cargo);
		attr.addFlashAttribute("success", "Cargo incluso com sucesso!");
		return "redirect:/cargos/cadastrar";
	}
	
	@ModelAttribute("departamentos")
	public List<Departamento> listaDepartamentos(){
		return departamentoService.buscarTodos();
	}
	
	
}
