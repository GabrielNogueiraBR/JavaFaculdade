package poo.teoria.aula03;

import java.util.ArrayList;

public class CorridaV2 {

    public static void main(String[] args) {
    
        //lista de carros
        ArrayList<Carro> listaCarros = new ArrayList<Carro>();
        
        //pista de corrida
        double distanciaPistaMetros = 10000;
        
        //variaveis de controle
        int i = 0;
        Carro vencedor = null; //enquanto nao houver vencedor
        

        //criando os 100 carros
        for(i = 0; i < 100; i++){

            Carro aux = new Carro();
            aux.setCodigo(i+1);
            listaCarros.add(aux);

        }

        while(vencedor == null){
            movimenta_carros(listaCarros);
            vencedor = verifica_vencedor(listaCarros, distanciaPistaMetros);
        }//continua correndo

        System.out.println("\nO vencedor foi o: ");
        System.out.println(vencedor.toString());


    }

    public static Carro verifica_vencedor(ArrayList<Carro> lista, double distanciaPistaMetros){
        
        int i;

        for(i = 0; i < 100; i++){
            if( lista.get(i).getDistanciaPercorridaEmMetros() >= distanciaPistaMetros)
                return lista.get(i);
        }
        
        return null;
    }
    
    public static void movimenta_carros(ArrayList<Carro> lista){
        int i;
        for(i = 0; i < 100; i++){
            lista.get(i).setVelocidadeKmPorHora(Math.random()*200);
            lista.get(i).mover(1);
        }
    }



}
