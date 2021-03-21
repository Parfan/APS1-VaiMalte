package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;

	public Carrinho() {
		this.pedidos = new ArrayList<>();
	}
	
	public void addPedido(Produto produto) {
		for (Pedido pedido: getPedidos()) {
			if (pedido.getProduto().getCodigo() == produto.getCodigo()) {
				pedido.addQuantidade();
				return;
			}
		}
		Pedido novoPedido = new Pedido(produto);
		this.pedidos.add(novoPedido);
	}
	
	public List<Pedido> getPedidos() {
		return this.pedidos;
	}
}
