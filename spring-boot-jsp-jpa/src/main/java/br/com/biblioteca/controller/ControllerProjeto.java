package br.com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.biblioteca.model.Classificacao;
import br.com.biblioteca.model.ProjetoModel;
import br.com.biblioteca.model.Status;
import br.com.bliblioteca.repository.ProjetoRepository;

@Controller
@RequestMapping(value = "/projeto")
public class ControllerProjeto {
	Classificacao classificacao;
	Status status;
	@Autowired
	public ProjetoRepository repositorio;

	@RequestMapping(value = "index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/post_projeto", method = RequestMethod.POST)
	public String cadastro(ProjetoModel projeto) {
		repositorio.save(projeto);
		return "redirect:/projeto";
	}

	@RequestMapping(value = "/listarTodos", method = RequestMethod.GET)
	public String lista() {
		repositorio.findAll();
		return "redirect/listagem";
	}

	@RequestMapping()
	public String deleteProjeto(@PathVariable Long id) {
		ProjetoModel projetoModel = repositorio.findOne(id);
		switch (projetoModel.getStatus()) {
		case "EM_ANDAMENTO":
			projetoModel.getStatus();
			break;
		case "ENCERRADO":
			
			break;
		case "INICIADO":
			
			break;
		default:
			repositorio.delete(id);
			break;
		}
		return "redirect:/";
	}

	public void setRisco(ProjetoModel projeto) {
		projeto.setRisco(classificacao.name());
		repositorio.save(projeto);
	}

	public void setClassificacao(ProjetoModel projeto) {
		projeto.setStatus(status.name());
	}

}
