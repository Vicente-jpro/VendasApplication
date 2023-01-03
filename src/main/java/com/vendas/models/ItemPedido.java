package com.vendas.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemPedido {

	private Integer id_tem_pedido;
	private Pedido pedido;
    private Produto produto;
	private int quantidade;

}
