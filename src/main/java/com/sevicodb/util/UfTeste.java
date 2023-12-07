package com.sevicodb.util;

import java.sql.SQLException;
import java.util.List;

import com.sevicodb.DAO.UfDAO;
import com.sevicodb.model.Uf;

public class UfTeste {
    static UfDAO ufDAO = new UfDAO();

    public static void main(String[] args) throws SQLException {

        System.out.println("cout");
        System.out.println(ufDAO.count());

        System.out.println("salvar");
        Uf uf = new Uf("Ceara", 8);
        ufDAO.insertUf(uf);

        System.out.println("busca por ID");
        uf = ufDAO.selectUf(1);
        System.out.println(uf);

        System.out.println("update");
        uf.setDescricao("Sao Paulo");
        ufDAO.updateUf(uf);
        uf = ufDAO.selectUf(1);
        System.out.println(uf);

        System.out.println("select all");
        List<Uf> ufs = ufDAO.selectAllUfs();
        ufs.forEach(System.out::println);

        System.out.println("delete");
        ufDAO.deleteUf(1);
        ufDAO.selectAllUfs().forEach(System.out::println);
    }
}
