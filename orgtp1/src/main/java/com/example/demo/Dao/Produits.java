package com.example.demo.Dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
@Entity
public class Produits {
	
	@Id
	@GeneratedValue
	private Long id;
	private String designation;
	private double prix;
	
	
	public Produits () {}
	
	public Produits (  String designation) {
		
		this.designation=designation;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}
