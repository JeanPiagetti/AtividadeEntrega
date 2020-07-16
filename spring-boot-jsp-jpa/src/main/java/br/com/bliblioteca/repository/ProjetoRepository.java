package br.com.bliblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.biblioteca.model.ProjetoModel;

public interface ProjetoRepository  extends JpaRepository<ProjetoModel, Long>{

}
