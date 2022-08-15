package com.ids.microservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ids.microservice.interfaceServices.IproductService;
import com.ids.microservice.interfaces.Iproducts;
import com.ids.microservice.model.Datos;

public class ProductService implements IproductService {
	
	@Autowired
	private Iproducts data;
	
	

	@Override
	public List<Datos> listar() {
		// TODO Auto-generated method stub
		return (List<Datos>)data.findAll();
	}

	@Override
	public Optional<Datos> listarCode(String barcode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(Datos d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String barcode) {
		// TODO Auto-generated method stub
		
	}

	
}
