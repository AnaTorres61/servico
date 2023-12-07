package com.sevicodb.DAO;

import com.sevicodb.model.ItemOrdemServico;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemOrdemServicoDAO extends ConexaoDB {

    private static final String INSERT_ITEM_ORDEM_SERVICO_SQL = "INSERT INTO item_ordem_servico (descricao, preco, id_ordem_servico) VALUES (?, ?, ?);";
    private static final String SELECT_ITEM_ORDEM_SERVICO_BY_ID = "SELECT id, descricao, preco, id_ordem_servico FROM item_ordem_servico WHERE id = ?";
    private static final String SELECT_ALL_ITEM_ORDEM_SERVICO = "SELECT * FROM item_ordem_servico;";
    private static final String DELETE_ITEM_ORDEM_SERVICO_SQL = "DELETE FROM item_ordem_servico WHERE id = ?;";
    private static final String UPDATE_ITEM_ORDEM_SERVICO_SQL = "UPDATE item_ordem_servico SET descricao = ?, preco = ?, id_ordem_servico = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM item_ordem_servico;";

    public Integer count() {
        Integer count = 0;
        try (PreparedStatement preparedStatement = prapararSQL(TOTAL)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    public void insertItemOrdemServico(ItemOrdemServico entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_ITEM_ORDEM_SERVICO_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());
            preparedStatement.setBigDecimal(2, new BigDecimal(entidade.getPreco()));
            preparedStatement.setInt(3, entidade.getId_ordem_servico());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ItemOrdemServico selectItemOrdemServico(int id) {
        ItemOrdemServico entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ITEM_ORDEM_SERVICO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                BigInteger preco = rs.getBigDecimal("preco").toBigInteger();
                Integer id_ordem_servico = rs.getInt("id_ordem_servico");
                entidade = new ItemOrdemServico(id, descricao, preco, id_ordem_servico);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<ItemOrdemServico> selectAllItemOrdemServicos() {
        List<ItemOrdemServico> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_ITEM_ORDEM_SERVICO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                BigInteger preco = rs.getBigDecimal("preco").toBigInteger();
                Integer id_ordem_servico = rs.getInt("id_ordem_servico");
                entidades.add(new ItemOrdemServico(id, descricao, preco, id_ordem_servico));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteItemOrdemServico(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_ITEM_ORDEM_SERVICO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateItemOrdemServico(ItemOrdemServico entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_ITEM_ORDEM_SERVICO_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setBigDecimal(2, new BigDecimal(entidade.getPreco()));
            statement.setInt(3, entidade.getId_ordem_servico());
            statement.setInt(4, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
