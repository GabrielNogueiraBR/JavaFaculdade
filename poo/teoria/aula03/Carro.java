package poo.teoria.aula03;

public class Carro {
    int codigo;
    double velocidadeKmPorHora;
    double distanciaPercorridaEmMetros;
    

    //Criação do metodo de movimento
    public double mover(int segundos){
        double dist = (this.velocidadeKmPorHora/3.6) * (segundos);
        this.distanciaPercorridaEmMetros += dist;
        return dist;
    }



    //Override é quando não queremos usar o toString original, ou seja estamos rescrevendo/sobrescrevendo o método toString
    @Override
    public String toString() {
        return "Codigo do Carro=" + codigo + "\nDistância total=" + distanciaPercorridaEmMetros + "\nVelocidade atual=" + velocidadeKmPorHora;
    }

    

    
}
