package com.vendas.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
}
