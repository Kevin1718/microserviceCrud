package com.ids.microservice.interfaces;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ids.microservice.model.Datos;

@Repository
public interface Iproducts extends CrudRepository <Datos, Integer>{

}
