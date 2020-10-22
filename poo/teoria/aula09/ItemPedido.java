package poo.teoria.aula09;

public class ItemPedido {
    private int numero;
    private double precoUnitario;
    private String produto;
    private int quantidade;

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPreco() {
        return precoUnitario;
    }

    public void setPreco(double preco) {
        this.precoUnitario = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal(){
        return quantidade * precoUnitario;
    }

    public ItemPedido(int numero, double preco, String produto, int quantidade) {
        this.numero = numero;
        this.precoUnitario = preco;
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
