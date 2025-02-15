package br.com.fiap.syminate.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="clinica",sequenceName = "SQ_T_clinica",allocationSize = 1)
public class Clinica {

    @Id
    @GeneratedValue(generator = "clinica", strategy = GenerationType.SEQUENCE)
    private int codigo;

    private String nome;

    private String descricao;

    private String endereco;

    private String telefone;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}

