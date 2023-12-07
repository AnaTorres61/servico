package com.sevicodb.util;

import java.sql.SQLException;
import java.util.List;

import com.sevicodb.DAO.CidadeDAO;
import com.sevicodb.model.Cidade;

public class CidadeTeste {
    static CidadeDAO cidadeDAO = new CidadeDAO();

    public static void main(String[] args) throws SQLException {

        System.out.println("count");
        System.out.println(cidadeDAO.count());

        System.out.println("salvar");
        Cidade cidade = new Cidade("Fortaleza", 85, 1);
        cidadeDAO.insertCidade(cidade);

        System.out.println("busca por ID");
        cidade = cidadeDAO.selectCidade(1);
        System.out.println(cidade);

        System.out.println("update");
        cidade.setDescricao("Sao Paulo");
        cidadeDAO.updateCidade(cidade);
        cidade = cidadeDAO.selectCidade(1);
        System.out.println(cidade);

        System.out.println("select all");
        List<Cidade> cidades = cidadeDAO.selectAllCidades();
        cidades.forEach(System.out::println);

        System.out.println("delete");
        cidadeDAO.deleteCidade(1);
        cidadeDAO.selectAllCidades().forEach(System.out::println);
    }
}
