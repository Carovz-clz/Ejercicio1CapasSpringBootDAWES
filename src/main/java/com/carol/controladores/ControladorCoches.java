package com.carol.controladores;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.carol.negocio.ILogicaNegocio;

@Controller
public class ControladorCoches {
	@Autowired
	ILogicaNegocio n;
	
	@RequestMapping("cuentacoches")
	public String calculaNombreCoches(@RequestParam("nombre") String nombreRecibido, ModelMap model) throws IOException {
		
		Integer numCoches = n.cuantosCoches(nombreRecibido);
		
		model.addAttribute("d", numCoches);
		
		return "vista";
		
	}

}
