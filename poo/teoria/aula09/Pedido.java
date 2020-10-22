package poo.teoria.aula09;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    private long numero;
    private String descricao;
    private LocalDateTime dataPedido;
    private boolean pedidoFechado;
    private ArrayList<ItemPedido> listaItem = new ArrayList<ItemPedido>();

    // private int codigoCliente;  -> esse é um erro clássico em orientação objeto, pois a classe Pedido não se relaciona ao cliente como um relacionamento em Bancos de dados relacionais.
    
    // a relação na orientação objeto é entre objetos e não através dos atributos como uma chave estrangeira.

    private Cliente cliente; // em POO um objeto Pedido guarda um objeto do tipo Cliente.

    //Como falamos anteriormente, em POO esse relacionamento é dado através do objetos.

    public Pedido(long numero){
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

    //o getter de bolean comeca com o is, pois vamos retornar um bolean
    // isPedidoFechado -> true ou false?
    public boolean isPedidoFechado() {
        return pedidoFechado;
    }

    public void setPedidoFechado(boolean pedidoFechado) {
        this.pedidoFechado = pedidoFechado;
    }

    public ArrayList<ItemPedido> getListaItem() {
        return listaItem;
    }

    public void setListaItem(ArrayList<ItemPedido> listaItem) {
        this.listaItem = listaItem;
    }

    //primeira forma para adicionar um novo item de pedido na lista
    public boolean addItemPedido(ItemPedido itemPedido){
		return this.listaItem.add(itemPedido);
	}
	
	public boolean removeItemPedido(ItemPedido itemPedido){
		return this.listaItem.remove(itemPedido);
	}

    public double getValorTotalPedido(){
        double total = 0;

        for (ItemPedido itemPedido : listaItem) {
            total += itemPedido.getValorTotal();
        }

        return total;

    }

    //segunda forma para adicionar um novo item de pedido na lista
    public boolean addItemPedido(int numero, double preco, String produto, int quantidade){
        return listaItem.add(new ItemPedido(numero, preco, produto, quantidade));
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", dataPedido=" + dataPedido + ", descricao=" + descricao + ", listaItem="
                + listaItem + ", numero=" + numero + ", pedidoFechado=" + pedidoFechado + "]";
    }

    
    

}
