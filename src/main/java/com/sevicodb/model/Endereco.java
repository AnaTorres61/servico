package com.sevicodb.model;

public class Endereco extends GenericModel {
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private Integer id_cidade;

    public Endereco(String rua, String bairro, String cep, Integer id_cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.id_cidade = id_cidade;
    }

    public Endereco(String rua, String numero, String bairro, String cep, Integer id_cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.id_cidade = id_cidade;
    }

    public Endereco(Integer id, String rua, String numero, String bairro, String cep, Integer id_cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.id_cidade = id_cidade;
        super.setId(id_cidade);
    }

    @Override
    public String toString() {
        return "Endereco [id=" + this.getId() + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep + ", id_cidade="
                + id_cidade + "]";
    }
}
