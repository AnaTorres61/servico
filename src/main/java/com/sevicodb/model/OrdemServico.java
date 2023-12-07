package com.sevicodb.model;

import java.sql.Timestamp;

public class OrdemServico extends GenericModel{
    private String observacao;
    private Timestamp dt_abertura;
    private Timestamp dt_saida;
    private String username_responsavel;
    private Integer id_cliente;
    private Integer id_empresa;

    public OrdemServico(Timestamp dt_abertura, String username_responsavel, Integer id_cliente, Integer id_empresa) {
        this.dt_abertura = dt_abertura;
        this.username_responsavel = username_responsavel;
        this.id_cliente = id_cliente;
        this.id_empresa = id_empresa;
    }

    public OrdemServico(String observacao, Timestamp dt_abertura, String username_responsavel,
            Integer id_cliente, Integer id_empresa) {
        this.observacao = observacao;
        this.dt_abertura = dt_abertura;
        this.username_responsavel = username_responsavel;
        this.id_cliente = id_cliente;
        this.id_empresa = id_empresa;
    }

    public OrdemServico(Timestamp dt_abertura, Timestamp dt_saida, String username_responsavel,
            Integer id_cliente, Integer id_empresa) {
        this.dt_abertura = dt_abertura;
        this.dt_saida = dt_saida;
        this.username_responsavel = username_responsavel;
        this.id_cliente = id_cliente;
        this.id_empresa = id_empresa;
    }

    public OrdemServico(String observacao, Timestamp dt_abertura, Timestamp dt_saida, String username_responsavel,
            Integer id_cliente, Integer id_empresa) {
        this.observacao = observacao;
        this.dt_abertura = dt_abertura;
        this.dt_saida = dt_saida;
        this.username_responsavel = username_responsavel;
        this.id_cliente = id_cliente;
        this.id_empresa = id_empresa;
    }

    public OrdemServico(Integer id, String observacao, Timestamp dt_abertura, Timestamp dt_saida, String username_responsavel,
            Integer id_cliente, Integer id_empresa) {
        this.observacao = observacao;
        this.dt_abertura = dt_abertura;
        this.dt_saida = dt_saida;
        this.username_responsavel = username_responsavel;
        this.id_cliente = id_cliente;
        this.id_empresa = id_empresa;
        super.setId(id_empresa);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Timestamp getDt_abertura() {
        return dt_abertura;
    }

    public void setDt_abertura(Timestamp dt_abertura) {
        this.dt_abertura = dt_abertura;
    }

    public Timestamp getDt_saida() {
        return dt_saida;
    }

    public void setDt_saida(Timestamp dt_saida) {
        this.dt_saida = dt_saida;
    }

    public String getUsername_responsavel() {
        return username_responsavel;
    }

    public void setUsername_responsavel(String username_responsavel) {
        this.username_responsavel = username_responsavel;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }

    @Override
    public String toString() {
        return "OrdemServico [id=" + this.getId() + "observacao=" + observacao + ", dt_abertura=" + dt_abertura + ", dt_saida=" + dt_saida
                + ", username_responsavel=" + username_responsavel + ", id_cliente=" + id_cliente + ", id_empresa="
                + id_empresa + "]";
    }
}
