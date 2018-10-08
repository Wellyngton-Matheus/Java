package agendaspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContatoController {

	@RequestMapping("/contatos/form")
	public String form() {
		System.out.println("Chamou o form de contato");
		return "contatos/form";
	}
	
	@RequestMapping("/contatos")
	public String adicionar(String nome) {
		
		return "contatos/ok";
	}
	
}
