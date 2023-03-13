package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica para o spring que essa é uma classe controladora
//@RestController

//indica um endpoint para nossa aplicação.
//@RequestMapping


@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "BSMs: "
				+ "\r\n- Persistência\r\n"
				+ "- Mentalidade de Crescimento\r\n"
				+ "- Orientação ao Futuro\r\n"
				+ "- Responsabilidade Pessoal\r\n"
				+ "- Trabalho em Equipe\r\n"
				+ "- Comunicação\r\n"
				+ "- Comunicação Não Violenta\r\n"
				+ "- Atenção ao Detalhe\r\n"
				+ "- Proatividade";
	}
	
	@GetMapping("/lista")
	public String lista() {
		return "Apredisagem: "
				+ "\r\n- Comunicação\r\n"
				+ "- Spring\r\n"
				+ "- SQL\r\n"
				+ "- Monitoria";
	}
	
}

