package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.PedidoStatus;

public class Pedido {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date dataCriacao;
	private PedidoStatus pedidoStatus;
	private Cliente cliente;
	private List<ItemPedido> itemPedido = new ArrayList<>();
	
	public Pedido() {
		
	}

	public Pedido(Cliente cliente, Date dataCriacao, PedidoStatus pedidoStatus) {
		this.cliente = cliente;
		this.dataCriacao = dataCriacao;
		this.pedidoStatus = pedidoStatus;
	}
	
	
	

}
