package br.edu.insper.desagil.vaimalte;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	public Pedido(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
	}
	
	public void addQuantidade() {
		this.quantidade+=1;
	}
	
	public double precoTotalPedido() {
		double preco = this.produto.getPreco();
		double total = preco * this.getQuantidade();
		return total;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
}
