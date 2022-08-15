package com.ids.microservice.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.ids.microservice.model.Datos;


public interface IproductService {
	public List<Datos>listar();
	public Optional<Datos>listarCode(String barcode);
	public String save(Datos d);
	public void delete(String barcode);
	
	
	

}
