package com.sevicodb.DAO;

import com.sevicodb.model.OrdemServico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;

public class OrdemServicoDAO extends ConexaoDB {

    private static final String INSERT_ORDEM_SERVICO_SQL = "INSERT INTO ordem_servico (observacao, dt_abertura, dt_saida, username_responsavel, id_cliente, id_empresa) VALUES (?, ?, ?, ?, ?, ?);";
    private static final String SELECT_ORDEM_SERVICO_BY_ID = "SELECT id, observacao, dt_abertura, dt_saida, username_responsavel, id_cliente, id_empresa FROM ordem_servico WHERE id = ?";
    private static final String SELECT_ALL_ORDEM_SERVICO = "SELECT * FROM ordem_servico;";
    private static final String DELETE_ORDEM_SERVICO_SQL = "DELETE FROM ordem_servico WHERE id = ?;";
    private static final String UPDATE_ORDEM_SERVICO_SQL = "UPDATE ordem_servico SET observacao = ?, dt_abertura = ?, dt_saida = ?, username_responsavel = ?, id_cliente = ?, id_empresa = ? WHERE id = ?;";
    private static final String TOTAL = "SELECT count(1) FROM ordem_servico;";

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

    public void insertOrdemServico(OrdemServico entidade) {
        try (PreparedStatement preparedStatement = prapararSQL(INSERT_ORDEM_SERVICO_SQL)) {
            preparedStatement.setString(1, entidade.getObservacao());
            preparedStatement.setTimestamp(2, entidade.getDt_abertura());
            preparedStatement.setTimestamp(3, entidade.getDt_saida());
            preparedStatement.setString(4, entidade.getUsername_responsavel());
            preparedStatement.setInt(5, entidade.getId_cliente());
            preparedStatement.setInt(6, entidade.getId_empresa());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public OrdemServico selectOrdemServico(int id) {
        OrdemServico entidade = null;
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ORDEM_SERVICO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String observacao = rs.getString("observacao");
                Timestamp dt_abertura = rs.getTimestamp("dt_abertura");
                Timestamp dt_saida = rs.getTimestamp("dt_saida");
                String username_responsavel = rs.getString("username_responsavel");
                Integer id_cliente = rs.getInt("id_cliente");
                Integer id_empresa = rs.getInt("id_empresa");
                entidade = new OrdemServico(id, observacao, dt_abertura, dt_saida, username_responsavel, id_cliente, id_empresa);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<OrdemServico> selectAllOrdemServicos() {
        List<OrdemServico> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prapararSQL(SELECT_ALL_ORDEM_SERVICO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String observacao = rs.getString("observacao");
                Timestamp dt_abertura = rs.getTimestamp("dt_abertura");
                Timestamp dt_saida = rs.getTimestamp("dt_saida");
                String username_responsavel = rs.getString("username_responsavel");
                Integer id_cliente = rs.getInt("id_cliente");
                Integer id_empresa = rs.getInt("id_empresa");
                entidades.add(new OrdemServico(id, observacao, dt_abertura, dt_saida, username_responsavel, id_cliente, id_empresa));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteOrdemServico(int id) throws SQLException {
        try (PreparedStatement statement = prapararSQL(DELETE_ORDEM_SERVICO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateOrdemServico(OrdemServico entidade) throws SQLException {
        try (PreparedStatement statement = prapararSQL(UPDATE_ORDEM_SERVICO_SQL)) {
            statement.setString(1, entidade.getObservacao());
            statement.setTimestamp(2, entidade.getDt_abertura());
            statement.setTimestamp(3, entidade.getDt_saida());
            statement.setString(4, entidade.getUsername_responsavel());
            statement.setInt(5, entidade.getId_cliente());
            statement.setInt(6, entidade.getId_empresa());
            statement.setInt(7, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
