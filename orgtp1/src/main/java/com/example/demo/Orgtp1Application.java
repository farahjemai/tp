package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Dao.ProduitRepository;
import com.example.demo.Dao.Produits;

@SpringBootApplication
public class Orgtp1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Orgtp1Application.class, args);
		
		ProduitRepository produitrepository=ctx.getBean(ProduitRepository.class);
		Stream.of("A","B","C").forEach(s->produitrepository.save(new Produits(s)));
	
		produitrepository.findAll().forEach(s->System.out.println(s.getDesignation()));
	}
}
