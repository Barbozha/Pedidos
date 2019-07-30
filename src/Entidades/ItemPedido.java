package Entidades;

public class ItemPedido {
	private Integer qtde;
	private Double preco;
	private Produto produto;
	
	public ItemPedido() {
		
	}

	public ItemPedido(Integer qtde, Double preco, Produto produto) {
		this.qtde = qtde;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double subtotal() {
		return qtde * preco;
	}
	
	@Override
	public String toString() {
		return produto.getNome() 
				+ ", $" 
				+ String.format("%.2f", preco) 
				+ ", Quantidade: " 
				+ qtde + 
				", Subtotal: $" 
				+ String.format("%.2f", subtotal());
	}
	
	
}
