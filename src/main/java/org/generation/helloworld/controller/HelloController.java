package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica para o spring que essa é uma classe controladora
@RestController

//indica um endpoint para nossa aplicação.
@RequestMapping


public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<h3>Lista de BSM’s:</h3>"
				+ "Persistência <br/>"
				+ "Mentalidade de Crescimento<br/>"
				+ "Orientação ao Futuro<br/>"
				+ "Responsabilidade Pessoal<br/>"
				+ "Trabalho em Equipe<br/>"
				+ "Comunicação<br/>"
				+ "Comunicação Não Violenta<br/>"
				+ "Atenção para Detalhes<br/>"
				+ "Proatividade";
	}
	
	@GetMapping("/lista")
	public String lista() {
		return "<h3>Lista de aprendizagem desta semana</h3>"
				+ "- Aprender Spring <br/>"
				+ "- Aprender comunicação<br/>"
				+ "- Aprender API";
	}
	
	
}


