package poo.teoria.aula09;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
	private double saldo;
	
	// Aqui em Cliente podemos ter diversos Pedidos, portanto teremos que criar uma lista de Pedidos.
	private ArrayList<Pedido> listaPedido = new ArrayList<Pedido>(); // devemos declarar nossa lista de Pedidos utilizando o new ArrayList<>()

	public Cliente(int codigo, String nome, double saldo){
		this.codigo = codigo;
		this.nome = nome;
		this.saldo = saldo;
    }

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Pedido> getListaPedido() {
		return listaPedido;
	}

	public void setListaPedido(ArrayList<Pedido> listaPedido) {
		this.listaPedido = listaPedido;
	}

	public boolean addPedido(Pedido pedido){
		return this.listaPedido.add(pedido);
	}
	
	public boolean removePedido(Pedido pedido){
		return this.listaPedido.remove(pedido);
	}

	public double somaTotalPedidos(){
		double soma = 0;
		for (Pedido pedido : listaPedido) {
			soma += pedido.getValorTotalPedido();
		}

		return soma;
	}

	public double somaTotalPedidosFechados(){
		double soma = 0;
		for (Pedido pedido : listaPedido) {
			if(pedido.isPedidoFechado())
				soma += pedido.getValorTotalPedido();
		}

		return soma;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", listaPedido=" + listaPedido + ", nome=" + nome + ", saldo=" + saldo
				+ "]";
	}

  
    
}
