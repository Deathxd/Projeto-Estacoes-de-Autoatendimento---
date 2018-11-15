package trabalho_2_poo;

public abstract class Produto {

	static int index;
	protected int codigo;
	protected double preco;
	protected String nome;

	public Produto(double preco, int codigo, String nome) {
		this.preco = preco;
		this.codigo = codigo;
		this.nome = nome;
	}

	public void mostrarProduto() {
		System.out.println("Codigo: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: R$" + this.preco);
	}
	
	public abstract int getIndex();
}
