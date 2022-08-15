package com.ids.microservice.model;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="products")
public class Datos {
	private String barcode;
	private String weight;
	private String lenght;
	private String width;
	private String height;
	
	public Datos() {
		
	}
	
	public Datos(String barcode,String weight, String lenght, String widht, String height) {
		super();
		this.barcode=barcode;
		this.weight=weight;
		this.lenght=lenght;
		this.width=widht;
		this.height=height;
		
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getLenght() {
		return lenght;
	}
	public void setLenght(String lenght) {
		this.lenght = lenght;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	

}
