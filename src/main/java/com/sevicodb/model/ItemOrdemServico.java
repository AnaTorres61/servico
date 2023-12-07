package com.sevicodb.model;

import java.math.BigInteger;

public class ItemOrdemServico extends GenericModel {
    private String descricao;
    private BigInteger preco;
    private Integer id_ordem_servico;
    
    public ItemOrdemServico(String descricao, BigInteger preco, Integer id_ordem_servico) {
        this.descricao = descricao;
        this.preco = preco;
        this.id_ordem_servico = id_ordem_servico;
    }

    public ItemOrdemServico(Integer id, String descricao, BigInteger preco, Integer id_ordem_servico) {
        this.descricao = descricao;
        this.preco = preco;
        this.id_ordem_servico = id_ordem_servico;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigInteger getPreco() {
        return preco;
    }

    public void setPreco(BigInteger preco) {
        this.preco = preco;
    }

    public Integer getId_ordem_servico() {
        return id_ordem_servico;
    }

    public void setId_ordem_servico(Integer id_ordem_servico) {
        this.id_ordem_servico = id_ordem_servico;
    }

    @Override
    public String toString() {
        return "ItemOrdemServico [id=" + this.getId() + ", descricao=" + descricao + ", preco=" + preco + ", id_ordem_servico="
                + id_ordem_servico + "]";
    }
}
