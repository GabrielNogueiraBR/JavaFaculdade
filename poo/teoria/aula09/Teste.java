package poo.teoria.aula09;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Teste {
    
    public static void main(String[] args) {

        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

        Cliente c1 = new Cliente(1, "Jose", 2000);
        Cliente c2 = new Cliente(1, "Maria", 3000);

        //adicionando os clientes na lista
        listaCliente.add(c1);
        listaCliente.add(c2);


        Pedido p1 = new Pedido(1);
        p1.setDataPedido(LocalDateTime.now());
        p1.setDescricao("Pedido numero 1");
        p1.addItemPedido(1, 10, "Bala", 10);
        p1.setPedidoFechado(true);

        Pedido p2 = new Pedido(2);
        p2.setDataPedido(LocalDateTime.now());
        p2.setDescricao("Pedido numero 2");
        p2.addItemPedido(2, 20, "Chocolate", 10);

        Pedido p3 = new Pedido(3);
        p3.setDataPedido(LocalDateTime.now());
        p3.setDescricao("Pedido numero 3");
        p3.addItemPedido(3, 30, "Ovo de chocolate", 10);
        p3.setPedidoFechado(true);

        // Aqui nao existe relacoes entre os objetos ainda
        System.out.println("\n\nNesse momento não existe relação entre os objetos");
        System.out.println("Numero de Pedidos do Cliente: " + c1.getListaPedido().size());
        System.out.println("Cliente do pedido 1: " + p1.getCliente());
        System.out.println("Cliente do pedido 2: " + p2.getCliente());

        // Estabelecendo relacoes entre objetos - Definindo o Cliente no Pedido 1 e 2
        System.out.println("\n\nEstabelecendo relações entre os objetos - Clientes dentro do objeto Pedido");
        p1.setCliente(c1);
        p2.setCliente(c1);
        System.out.println("Numero de Pedidos do Cliente: " + c1.getListaPedido().size());
        System.out.println("Cliente do pedido 1: " + p1.getCliente());
        System.out.println("Cliente do pedido 2: " + p2.getCliente());

        // Estabelecendo relacoes entre objetos - Definindo a lista de Pedidos no Cliente 1
        System.out.println("\n\nEstabelecendo relações entre os objetos - Lista de Pedidos");
        //c1.getListaPedido().add(p1); // Essa e uma forma de adiconar um pedido de forma indireta atraves do getListaPedido()
        
        c1.addPedido(p1);
        c1.addPedido(p2);

        p1.setCliente(c1);
        p2.setCliente(c1);
        System.out.println("Numero de Pedidos do Cliente: " + c1.getListaPedido().size());
        

        // Trocando o Relacionamento
        System.out.println("\n\nTrocando os relacionamentos dos objetos");
        c1.removePedido(p2);
        p2.setCliente(c2);
        c2.addPedido(p2);

        p3.setCliente(c1);
        c1.addPedido(p3);

        System.out.println("Numero de Pedidos do Cliente 1: " + c1.getListaPedido().size());
        System.out.println("Numero de Pedidos do Cliente 2: " + c2.getListaPedido().size());

        
        System.out.println("\n\nSoma Total de Pedidos: ");
        somaTodosPedidos(listaCliente); // Primeira forma de somar diversos pedidos
        somaTodosPedidosV2(listaCliente); // Segunda forma de somar diversos pedidos

        System.out.println("\n\nSoma Total de Pedidos Fechados: ");
        somaPedidosFechados(listaCliente);
    }

    //Para refatorar um código basta deixar o cursos sobre o método e apertar o botão F2
    public static void somaTodosPedidos(ArrayList<Cliente> listaCliente){

        double soma = 0;

        //Primeria forma de exibir o somatório de valores de pedidos
        for (Cliente cliente : listaCliente) {
            for (Pedido pedido : cliente.getListaPedido()) {
                soma += pedido.getValorTotalPedido();
            }
        }

        System.out.println("Soma = "+ soma);

    }

    public static void somaTodosPedidosV2(ArrayList<Cliente> listaCliente){

        double soma = 0;

        for (Cliente cliente : listaCliente) {
            soma += cliente.somaTotalPedidos();
        }

        System.out.println("Soma = "+ soma);

    }

    public static void somaPedidosFechados(ArrayList<Cliente> listaCliente){

        double soma = 0;

        for (Cliente cliente : listaCliente) {
            soma += cliente.somaTotalPedidosFechados();
        }

        System.out.println("Soma = "+ soma);

    }

}
