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
}
