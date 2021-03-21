package br.edu.insper.desagil.vaimalte;

public class Testador {
	public boolean testeA() {
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		
		double total;
		total = caixa.precoTotal(carrinho);
		
		if (total != 0.0) {
			return false;
		}
		
	    return true;
	}

	public boolean testeB() {
		Carrinho carrinho = new Carrinho();
		Produto produto = new Produto(100, "Chocolate", 3.0);
		Caixa caixa = new Caixa();
		
		carrinho.addPedido(produto);
		
		double total;
		total = caixa.precoTotal(carrinho);
		total = Math.round(total * 100.0) / 100.0;
		
		double valorEsperado = 3.0;
		
		if (total != valorEsperado) {
			return false;
		}
		
	    return true;
	}

	public boolean testeC() {
		Carrinho carrinho = new Carrinho();
		Produto produto = new Produto(20, "Suco", 12.0);
		Caixa caixa = new Caixa();
		
		carrinho.addPedido(produto);
		caixa.addDesconto(produto, 10);
		
		double total;
		total = caixa.precoTotal(carrinho);
		total = Math.round(total * 100.0) / 100.0;
		
		double valorEsperado = 10.8; // (12.0 * 0.9)
		
		if (total != valorEsperado) {
			return false;
		}
		
	    return true;
	}

	public boolean testeD() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto(70, "Arroz", 81.49);
		Produto produto2 = new Produto(20, "Suco", 12.0);
		Caixa caixa = new Caixa();
		
		carrinho.addPedido(produto1);
		carrinho.addPedido(produto2);
		carrinho.addPedido(produto2);
		caixa.addDesconto(produto1, 20);
		
		double total;
		total = caixa.precoTotal(carrinho);
		total = Math.round(total * 100.0) / 100.0;
		
		double valorEsperado = 89.19; // (81.49 * 0.8) + (12.0 * 2)
		
		if (total != valorEsperado) {
			return false;
		}
		
	    return true;
	}

	public boolean testeE() {
		Carrinho carrinho = new Carrinho();
		Produto produto1 = new Produto(70, "Arroz", 81.49);
		Produto produto2 = new Produto(20, "Suco", 12.0);
		Caixa caixa = new Caixa();
		
		carrinho.addPedido(produto1);
		carrinho.addPedido(produto1);
		carrinho.addPedido(produto2);
		caixa.addDesconto(produto1, 15);
		
		double total;
		total = caixa.precoTotal(carrinho);
		total = Math.round(total * 100.0) / 100.0;

		double valorEsperado = 150.53; // (81.49 * 0.85 * 2) + (12.0)
		
		if (total != valorEsperado) {
			return false;
		}
		
	    return true;
	}
}
