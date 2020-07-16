package br.com.bliblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.biblioteca.model.Pessoa;

public interface PessoaController extends JpaRepository<Pessoa, Long> {

}
