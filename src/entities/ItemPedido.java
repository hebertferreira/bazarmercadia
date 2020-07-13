package entities;

import java.util.ArrayList;
import java.util.List;

public class ItemPedido {
	
	private List<Produto> produto = new ArrayList<>();
	private int qtde;
	private double valorUnitario;
	
	public ItemPedido() {
		
	}

	public ItemPedido(int qtde, double valorUnitario) {
		this.qtde = qtde;
		this.valorUnitario = valorUnitario;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public double subTotal() {
		return qtde*valorUnitario;
	}
	
}
