package com.vendas.models;

public class ItemPedido {

	private Integer idTemPedido;
	private Pedido pedido;
    private Produto produto;
	private int quantidade;
	
	public ItemPedido(Integer idTemPedido, Pedido pedido, Produto produto, int quantidade) {
		this.idTemPedido = idTemPedido;
		this.pedido = pedido;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public ItemPedido(Pedido pedido, Produto produto, int quantidade) {
		this.pedido = pedido;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public ItemPedido() {
	}
	
	public Integer getIdTemPedido() {
		return idTemPedido;
	}
	public void setIdTemPedido(Integer idTemPedido) {
		this.idTemPedido = idTemPedido;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
