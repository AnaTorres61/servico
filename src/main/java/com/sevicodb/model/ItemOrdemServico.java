package com.sevicodb.model;

public class ItemOrdemServico extends GenericModel {
    private String descricao;
    private Long preco;
    private Integer id_ordem_servico;
    
    public ItemOrdemServico(String descricao, Long preco, Integer id_ordem_servico) {
        this.descricao = descricao;
        this.preco = preco;
        this.id_ordem_servico = id_ordem_servico;
    }

    public ItemOrdemServico(Integer id, String descricao, Long preco, Integer id_ordem_servico) {
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

    public Long getPreco() {
        return preco;
    }

    public void setPreco(Long preco) {
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
