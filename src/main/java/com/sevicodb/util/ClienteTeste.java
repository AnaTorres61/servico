package com.sevicodb.util;

import java.sql.SQLException;
import java.util.List;

import com.sevicodb.DAO.ClienteDAO;
import com.sevicodb.model.Cliente;

public class ClienteTeste {
    static ClienteDAO clienteDAO = new ClienteDAO();

    public static void main(String[] args) throws SQLException {

        System.out.println("count");
        System.out.println(clienteDAO.count());

        System.out.println("salvar");
        Cliente cliente = new Cliente("Ana", "111.222.333-22");
        clienteDAO.insertCliente(cliente);

        System.out.println("busca por ID");
        cliente = clienteDAO.selectCliente(1);
        System.out.println(cliente);

        System.out.println("update");
        cliente.setCpf("111.222.333-44");
        clienteDAO.updateCliente(cliente);
        cliente = clienteDAO.selectCliente(1);
        System.out.println(cliente);

        System.out.println("select all");
        List<Cliente> clientes = clienteDAO.selectAllClientes();
        clientes.forEach(System.out::println);

        System.out.println("delete");
        clienteDAO.deleteCliente(1);
        clienteDAO.selectAllClientes().forEach(System.out::println);
    }
}
