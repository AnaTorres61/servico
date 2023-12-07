package com.sevicodb.model;

import java.sql.Date;

public class Cliente extends GenericModel {
    private String nome;
    private Date dt_nascimento;
    private String cpf;
    private String email;
    private Integer id_endereco;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, Date dt_nascimento, String cpf) {
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Cliente(String nome, String cpf, Integer id_endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.id_endereco = id_endereco;
    }

    public Cliente(String nome, Date dt_nascimento, String cpf, String email) {
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
        this.cpf = cpf;
        this.email = email;
    }

    public Cliente(String nome, Date dt_nascimento, String cpf, Integer id_endereco) {
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
        this.cpf = cpf;
        this.id_endereco = id_endereco;
    }

    public Cliente(String nome, String cpf, String email, Integer id_endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.id_endereco = id_endereco;
    }

    public Cliente(String nome, Date dt_nascimento, String cpf, String email, Integer id_endereco) {
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
        this.cpf = cpf;
        this.email = email;
        this.id_endereco = id_endereco;
    }

    public Cliente(Integer id, String nome, Date dt_nascimento, String cpf, String email, Integer id_endereco) {
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
        this.cpf = cpf;
        this.email = email;
        this.id_endereco = id_endereco;
        super.setId(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Integer id_endereco) {
        this.id_endereco = id_endereco;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + this.getId() + ", nome=" + nome + ", dt_nascimento=" + dt_nascimento + ", cpf=" + cpf + ", email=" + email
                + ", id_endereco=" + id_endereco + "]";
    }

}
