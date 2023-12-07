package com.sevicodb.util;

import java.sql.SQLException;
import java.util.List;

import com.sevicodb.DAO.EnderecoDAO;
import com.sevicodb.model.Endereco;

public class EnderecoTeste {
    static EnderecoDAO enderecoDAO = new EnderecoDAO();

    public static void main(String[] args) throws SQLException {

        System.out.println("count");
        System.out.println(enderecoDAO.count());

        System.out.println("salvar");
        Endereco endereco = new Endereco("Tv. Gris", "Guaianases", "08430-880", 1);
        enderecoDAO.insertEndereco(endereco);

        System.out.println("busca por ID");
        endereco = enderecoDAO.selectEndereco(1);
        System.out.println(endereco);

        System.out.println("update");
        endereco.setNumero("3");
        enderecoDAO.updateEndereco(endereco);
        endereco = enderecoDAO.selectEndereco(1);
        System.out.println(endereco);

        System.out.println("select all");
        List<Endereco> enderecos = enderecoDAO.selectAllEnderecos();
        enderecos.forEach(System.out::println);

        System.out.println("delete");
        enderecoDAO.deleteEndereco(1);
        enderecoDAO.selectAllEnderecos().forEach(System.out::println);
    }
}
