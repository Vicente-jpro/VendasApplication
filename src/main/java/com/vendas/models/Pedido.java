package com.vendas.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {	
	private int id_pedido;
    private Cliente cliente;
    private int total;
	private LocalDate dataPedido;

}
