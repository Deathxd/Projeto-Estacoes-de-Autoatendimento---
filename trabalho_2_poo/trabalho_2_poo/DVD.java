package trabalho_2_poo;

public class DVD extends trabalho_2_poo.Produto {
	
	public DVD(int preco, int codigo, String nome) {
		super(preco, codigo, nome);
		this.index = 3;

	}

	@Override
	public int getIndex() {
		return trabalho_2_poo.Produto.index;
	}
}
