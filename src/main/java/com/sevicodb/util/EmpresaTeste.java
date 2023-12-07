package com.sevicodb.util;

import java.sql.SQLException;
import java.util.List;

import com.sevicodb.DAO.EmpresaDAO;
import com.sevicodb.model.Empresa;

public class EmpresaTeste {
    static EmpresaDAO empresaDAO = new EmpresaDAO();

    public static void main(String[] args) throws SQLException {

        System.out.println("count");
        System.out.println(empresaDAO.count());

        System.out.println("salvar");
        Empresa empresa = new Empresa("Brastemp", "59.105.999/0047-66", 1);
        empresaDAO.insertEmpresa(empresa);

        System.out.println("busca por ID");
        empresa = empresaDAO.selectEmpresa(1);
        System.out.println(empresa);

        System.out.println("update");
        empresa.setCnpj("59.105.999/0047-69");
        empresaDAO.updateEmpresa(empresa);
        empresa = empresaDAO.selectEmpresa(1);
        System.out.println(empresa);

        System.out.println("select all");
        List<Empresa> empresas = empresaDAO.selectAllEmpresas();
        empresas.forEach(System.out::println);

        System.out.println("delete");
        empresaDAO.deleteEmpresa(1);
        empresaDAO.selectAllEmpresas().forEach(System.out::println);
    }
}
