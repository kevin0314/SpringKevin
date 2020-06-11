package com.kevin.holamundo.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Controlador {

	@GetMapping("/")
	public String Inicio(Model modelo) {
		String msj = "Hola desde el controlador";
		modelo.addAttribute("saludo", msj);
		return "Index";
	}
           
}
