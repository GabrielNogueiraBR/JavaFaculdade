package poo.teoria.aula03;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.codigo = 100;
        c1.velocidade = 100;


        System.out.println(c1); // vai ser exibido o hashcode da variável c1
        System.out.println(c1.hashCode()); // valor do hashcode em hexadecimal
        System.out.println(c1.codigo);
        System.out.println(c1.velocidade);
        System.out.println(c1.distanciaPercorrida); // como a distância não foi inicializada, o valor inicial é zero.

        


    }
}
