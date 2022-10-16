package br.com.fiap.syminate.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@SequenceGenerator(name="psicologo",sequenceName = "SQ_T_psicologo",allocationSize = 1)
public class Psicologo {

    @Id
    @GeneratedValue(generator = "psicologo", strategy = GenerationType.SEQUENCE)
    private int codigo;

    private String nome;

    private LocalDate dataNascimento;

    @ManyToOne
    private Clinica clinica;

    private String crm;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Clinica getclinica() {
        return clinica;
    }

    public void setclinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
   
}
