package com.sevicodb.model;

public class Empresa extends GenericModel {
    private String nome_fantasia;
    private String cnpj;
    private String slogan;
    private Integer id_endereco;

    public Empresa(String nome_fantasia, String cnpj, Integer id_endereco) {
        this.nome_fantasia = nome_fantasia;
        this.cnpj = cnpj;
        this.id_endereco = id_endereco;
    }

    public Empresa(String nome_fantasia, String cnpj, String slogan, Integer id_endereco) {
        this.nome_fantasia = nome_fantasia;
        this.cnpj = cnpj;
        this.slogan = slogan;
        this.id_endereco = id_endereco;
    }

    public Empresa(Integer id, String nome_fantasia, String cnpj, String slogan, Integer id_endereco) {
        this.nome_fantasia = nome_fantasia;
        this.cnpj = cnpj;
        this.slogan = slogan;
        this.id_endereco = id_endereco;
        super.setId(id_endereco);
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Integer getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Integer id_endereco) {
        this.id_endereco = id_endereco;
    }

    @Override
    public String toString() {
        return "Empresa [id=" + this.getId() + ", nome_fantasia=" + nome_fantasia + ", cnpj=" + cnpj + ", slogan=" + slogan + ", id_endereco="
                + id_endereco + "]";
    }
}
