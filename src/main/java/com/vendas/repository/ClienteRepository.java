package com.vendas.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.vendas.models.Cliente;

@Repository
public class ClienteRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Cliente create(Cliente cliente) {
		String sql = "INSERT INTO CLIENTES (nome) VALUES(?)";
		
		jdbcTemplate.update(sql, new Object[] {cliente.getNome()});
		return cliente;
	}
	
	public Cliente update(Cliente cliente) {
		String sql = "UPDATE CLIENTES SET nome = ? where id_cliente = ?";
		jdbcTemplate.update(sql, new Object[] {cliente.getNome(), cliente.getIdCliente()});
		return cliente;
	}
	
	public List<Cliente> getAll(){
		String sql = "SELECT * FROM CLIENTES";
		return jdbcTemplate.query(sql, new RowMapper<Cliente>() {

			@Override
			public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Cliente(rs.getInt("ID_CLIENTE"),  rs.getString("nome"));
			}
			
		});
	}
	
	
}
