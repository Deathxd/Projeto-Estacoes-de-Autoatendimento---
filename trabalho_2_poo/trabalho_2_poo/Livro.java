package trabalho_2_poo;

public class Livro extends trabalho_2_poo.Produto {

	public Livro(int preco, int codigo, String nome) {
		super(preco, codigo, nome);
		this.index = 2;
	}

	@Override
	public int getIndex() {
		return index;
	}
}
