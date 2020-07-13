package entities;

public class ItemPedido {
	
	private Integer qtde;
	private Double valorUnitario;
	private Produto produto;
	
	public ItemPedido() {
		
	}

	public ItemPedido(Produto produto, Integer qtde, Double valorUnitario) {
		this.produto = produto;
		this.qtde = qtde;
		this.valorUnitario = valorUnitario;
	}
	
	public Integer getQtde() {
		return qtde;
	}
	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}
	public Double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return valorUnitario*qtde;
	}
	
	public String toString() {
		
		return produto.getNome() + " - Qtde: "+ qtde + " - R$" + valorUnitario + " - SUBTOTAL: R$ " + subTotal(); 
	}
	
}
