package com.hackmonkey.farmer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hackmonkey.farmer.entity.Departamento;
import com.hackmonkey.farmer.service.interfaces.DepartamentoService;

@Controller
@RequestMapping("/departamento")
public class DepartamentoController {

	
	@Autowired
	private DepartamentoService departamentoService;
	
	@GetMapping("/listado")
	public String listar(Model model)
	{
		List<Departamento> lstDepartamentos = departamentoService.listar(); 
		model.addAttribute("lstDepartamentos",lstDepartamentos);
		return "departamento";
		
	}
	
}
