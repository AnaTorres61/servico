package com.sevicodb.model;

public class Cidade extends GenericModel {
    private String descricao;
    private Integer codigo;
    private Integer id_uf;


    public Cidade(String descricao, Integer codigo, Integer id_uf) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.id_uf = id_uf;
    }

    public Cidade(Integer id, String descricao, Integer codigo, Integer id_uf) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.id_uf = id_uf;
        super.setId(id_uf);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getId_uf() {
        return id_uf;
    }

    public void setId_uf(Integer id_uf) {
        this.id_uf = id_uf;
    }

    @Override
    public String toString() {
        return "Cidade [id=" + this.getId() + ", descricao=" + descricao + ", codigo=" + codigo + ", id_uf=" + id_uf + "]";
    }

    
}
