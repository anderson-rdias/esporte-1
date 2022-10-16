package br.com.fiap.syminate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.syminate.model.Clinica;

public interface ClinicaRepository extends JpaRepository<Clinica,Integer> {
}
