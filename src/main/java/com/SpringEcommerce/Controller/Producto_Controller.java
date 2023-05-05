package com.SpringEcommerce.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringEcommerce.Service.Producto_Service;
import com.SpringEcommerce.model.Producto;
import com.SpringEcommerce.model.Usuario;

 

@Controller
@RequestMapping("/producto")
public class Producto_Controller {
	
	private final Logger LOGGER=LoggerFactory.getLogger(Producto_Controller.class);
	///metodos para crud
	@Autowired
	private Producto_Service producto_service;
	
	
	@GetMapping("")
public String show() {
	return "producto/show";
}
	@GetMapping("/create")
	public String create () {
		return "producto/create";
	}
	
	@PostMapping("/save")
	public String save(Producto producto) {
		LOGGER.info("este objeto es producto{}",producto);
		Usuario u=new Usuario(1 ,"","","","","","",""); 
		producto.setUsuario(u);
		producto_service.save(producto);
		return "redirect:/producto";
	}
	
}
 