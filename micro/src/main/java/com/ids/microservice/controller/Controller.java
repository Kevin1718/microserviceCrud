package com.ids.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ids.microservice.model.Datos;
import com.ids.microservice.interfaceServices.IproductService;

@RestController
public class Controller {
	
	private final RestTemplate restTemplate;
	
	@Autowired
	public Controller(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	
	//Metodo para consumir el end point asignado
	@PostMapping("/microservice")
	public Object postApi() {
		String url="https://hello-world-rest-api-master.azurewebsites.net/dws";
		return restTemplate.postForObject(url, Object.class,Object.class);
		
	}
	
	
	//Metodo para listar los datos de la db
//	@GetMapping("/listar")
//	public String listar(Model model) {
//	List<Datos>datos=service.listar();
//	model.addAttribute(null, datos);
//	}
	
	
	
	

}

