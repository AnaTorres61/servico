package com.sevicodb.util;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import com.sevicodb.DAO.OrdemServicoDAO;
import com.sevicodb.model.OrdemServico;

public class OrdemServicoTeste {
    static OrdemServicoDAO ordem_servicoDAO = new OrdemServicoDAO();

    public static void main(String[] args) throws SQLException {

        System.out.println("count");
        System.out.println(ordem_servicoDAO.count());

        System.out.println("salvar");
        OrdemServico ordem_servico = new OrdemServico(new Timestamp(System.currentTimeMillis()), "Davi", 1, 1);
        ordem_servicoDAO.insertOrdemServico(ordem_servico);

        System.out.println("busca por ID");
        ordem_servico = ordem_servicoDAO.selectOrdemServico(1);
        System.out.println(ordem_servico);

        System.out.println("update");
        ordem_servico.setObservacao("Observacao");
        ordem_servicoDAO.updateOrdemServico(ordem_servico);
        ordem_servico = ordem_servicoDAO.selectOrdemServico(1);
        System.out.println(ordem_servico);

        System.out.println("select all");
        List<OrdemServico> ordem_servicos = ordem_servicoDAO.selectAllOrdemServicos();
        ordem_servicos.forEach(System.out::println);

        System.out.println("delete");
        ordem_servicoDAO.deleteOrdemServico(1);
        ordem_servicoDAO.selectAllOrdemServicos().forEach(System.out::println);
    }
}
