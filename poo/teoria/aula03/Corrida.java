package poo.teoria.aula03;

public class Corrida {
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.codigo = 1;
        c2.codigo = 2;


        double distanciaPistaMetros = 10000;
                
        while(true){

            c1.velocidadeKmPorHora = Math.random()*200;
            c2.velocidadeKmPorHora = Math.random()*200;
            
                        

            c1.mover(1);
            c2.mover(1);

            if(c1.distanciaPercorridaEmMetros >= distanciaPistaMetros){
                System.out.println("\nO carro vencedor foi o Carro 1");
                break;
            }          
            
            else if(c2.distanciaPercorridaEmMetros >= distanciaPistaMetros){
                System.out.println("\nO carro vencedor foi o Carro 2");
                break;
            }

        }
        

        System.out.println(c1);
        System.out.println(c2);

    }


   


}
