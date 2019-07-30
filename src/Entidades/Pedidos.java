package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Pedidos.enun.Pedidos_Status;

public class Pedidos {
	private Date momento;
	private Pedidos_Status statuspedidos;
	private Cliente cliente;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	List<ItemPedido> itens = new ArrayList<>();
	public Pedidos() {
		
	}

	public Pedidos(Date momento, Pedidos_Status status, Cliente cliente) {
		this.momento = momento;
		this.statuspedidos = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public Pedidos_Status getStatuspedidos() {
		return statuspedidos;
	}

	public void setStatuspedidos(Pedidos_Status statuspedidos) {
		this.statuspedidos = statuspedidos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getPedidos() {
		return itens;
	}

	public void adicionaItem(ItemPedido item) {
		itens.add(item);
		
	}
	
	public void removeItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for(ItemPedido Item : itens) {
			soma += Item.subtotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Order status: ");
		sb.append(statuspedidos + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (ItemPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
}
