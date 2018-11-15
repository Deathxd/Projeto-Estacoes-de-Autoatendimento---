package trabalho_2_poo;

public class CD extends Produto {

	private String autor;

	public CD(int preco, int codigo, String nome, String autor) {
		super(preco, codigo, nome);
		this.autor = autor;
		this.index = 1;
	}

	@Override
	public void mostrarProduto() {
		super.mostrarProduto();
		System.out.println(autor);
	}

	@Override
	public int getIndex() {
		return index;
	}

}
