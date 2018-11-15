package trabalho_2_poo;

import java.util.List;

public class Carrinho {
	  static final int limite=10;
	  List<Produto>[] produtos;
	  int qtdTotal;
	  double preco_total;

	  public void adicionarAoCarrinho(Produto p, int qtd) {
		  produtos[p.getIndex()].add(p);
	  }
}
