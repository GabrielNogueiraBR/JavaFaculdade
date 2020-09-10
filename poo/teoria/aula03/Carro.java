package poo.teoria.aula03;

public class Carro {
    //em linguagem orientada a objetos DEVEMOS definir todos os ATRIBUTOS como privados
    private int codigo;
    private double velocidadeKmPorHora;
    private double distanciaPercorridaEmMetros;
    

    //Criação do metodo de movimento
    public double mover(int segundos){
        double dist = (this.velocidadeKmPorHora/3.6) * (segundos);
        this.distanciaPercorridaEmMetros += dist;
        return dist;
    }



    //Override é quando não queremos usar o toString original, ou seja estamos rescrevendo/sobrescrevendo o método toString
    @Override
    public String toString() {
        return "\nCodigo do Carro=" + codigo + "\nDistância total=" + distanciaPercorridaEmMetros + "\nVelocidade atual=" + velocidadeKmPorHora;
    }


    //Getter de distancia percorrida em metros
    public double getDistanciaPercorridaEmMetros() {
        return distanciaPercorridaEmMetros;
    }
    //Setter de distancia percorrida em metros
    public void setDistanciaPercorridaEmMetros(double distanciaPercorridaEmMetros) {
        this.distanciaPercorridaEmMetros = distanciaPercorridaEmMetros;
    }

    //Getter de codigo
    public int getCodigo() {
        return codigo;
    }
    //Setter de codigo
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //Getter de Velocidade Km Por Hora
    public double getVelocidadeKmPorHora() {
        return velocidadeKmPorHora;
    }
    //Setter de Velocidade Km Por Hora
    public void setVelocidadeKmPorHora(double velocidadeKmPorHora) {
        this.velocidadeKmPorHora = velocidadeKmPorHora;
    }

    
    
    

    
}
