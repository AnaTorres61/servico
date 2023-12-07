package com.sevicodb.util;

import java.sql.SQLException;
import java.util.List;

import com.sevicodb.DAO.ItemOrdemServicoDAO;
import com.sevicodb.model.ItemOrdemServico;

public class ItemOrdemServicoTeste {
    static ItemOrdemServicoDAO item_ordem_sevicoDAO = new ItemOrdemServicoDAO();

    public static void main(String[] args) throws SQLException {

        System.out.println("count");
        System.out.println(item_ordem_sevicoDAO.count());

        System.out.println("salvar");
        ItemOrdemServico item_ordem_sevico = new ItemOrdemServico("Item1", 20l, 1);
        item_ordem_sevicoDAO.insertItemOrdemServico(item_ordem_sevico);

        System.out.println("busca por ID");
        item_ordem_sevico = item_ordem_sevicoDAO.selectItemOrdemServico(1);
        System.out.println(item_ordem_sevico);

        System.out.println("update");
        item_ordem_sevico.setDescricao("Item2");
        item_ordem_sevicoDAO.updateItemOrdemServico(item_ordem_sevico);
        item_ordem_sevico = item_ordem_sevicoDAO.selectItemOrdemServico(1);
        System.out.println(item_ordem_sevico);

        System.out.println("select all");
        List<ItemOrdemServico> item_ordem_sevicos = item_ordem_sevicoDAO.selectAllItemOrdemServicos();
        item_ordem_sevicos.forEach(System.out::println);

        System.out.println("delete");
        item_ordem_sevicoDAO.deleteItemOrdemServico(1);
        item_ordem_sevicoDAO.selectAllItemOrdemServicos().forEach(System.out::println);
    }
}
