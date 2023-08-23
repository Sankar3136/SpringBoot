package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="medicine_Details")
public class medicineEntity {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String medicinename;
	 private int price;
	 private int quantity;
	public medicineEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public medicineEntity(int id, String medicinename, int price, int quantity) {
		super();
		this.id = id;
		this.medicinename = medicinename;
		this.price = price;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedicinename() {
		return medicinename;
	}
	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	 
	 
	

}
