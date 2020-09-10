package poo.teoria.aula03;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setCodigo(1);

        //Quando exibimos o c1, automaticamente é mostrado o to String, por isso o resultado da exibição é o mesmo
        System.out.println(c1); 
        System.out.println(c1.toString());

        //exibindo o nome da classe no projeto e o nome simples da classe
        System.out.println(c1.getClass().getName());
        System.out.println(c1.getClass().getSimpleName());

        // valor do hashcode em decimal
        System.out.println(c1.hashCode());

        // valor do hashcode em hexadecimal
        System.out.println( Integer.toHexString(c1.hashCode()));

        System.out.println(c1.getCodigo());
        System.out.println(c1.getVelocidadeKmPorHora());
        System.out.println(c1.getDistanciaPercorridaEmMetros()); // como a distância não foi inicializada, o valor inicial é zero.

        System.out.println("\n1º Movimento do carro: ");
        c1.setVelocidadeKmPorHora(100);
        System.out.println("O carro moveu " + c1.mover(10) + " metros em 10 segundos" );
        System.out.println(c1); 
        
        System.out.println("\n2º Movimento do carro: ");
        c1.setVelocidadeKmPorHora(50);       
        System.out.println("O carro moveu " + c1.mover(5) + " metros em 5 segundos" );
        System.out.println(c1);

        System.out.println("\n3º Movimento do carro: ");
        c1.setVelocidadeKmPorHora(80);
        System.out.println("O carro moveu " + c1.mover(4) + " metros em 4 segundos" );
        System.out.println(c1); 
    }
}
