package br.com.fiap.syminate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.syminate.model.Psicologo;

import java.util.List;

public interface PsicologoRepository extends JpaRepository<Psicologo, Integer> {

    //Pesquisar por parte do nome ignorando case sensitive
    List<Psicologo> findByNomeContainsIgnoreCase(String nome);

    //Pesquisar os psicologos de uma clinica
    List<Psicologo> findByClinica_Codigo(int codigo);

}
