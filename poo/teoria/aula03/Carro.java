package poo.teoria.aula03;

public class Carro {
    //em linguagem orientada a objetos DEVEMOS definir todos os ATRIBUTOS como privados
    private int codigo;
    private double velocidadeKmPorHora;
    private double distanciaPercorridaEmMetros;
    private double tanque;
    private double consumoEmKmPorLitros;

    //funcao para abastecer o carro
    public Boolean abastecer(double combustivel){
        if(combustivel < 0)
            return false;

        if(combustivel > 50)
            this.tanque = 50;

        else
            this.tanque = combustivel;

        return true;

    }
    
    //Criação do metodo de movimento
    public double mover(int segundos){
        
        if(tanque > 0){
            double dist = (this.velocidadeKmPorHora/3.6) * (segundos);
            this.tanque -= (dist*0.001) * consumoEmKmPorLitros;
            this.distanciaPercorridaEmMetros += dist;
        return dist;
        }
        else
            return 0;
        
        
    }

    //Override é quando não queremos usar o toString original, ou seja estamos rescrevendo/sobrescrevendo o método toString
    @Override
    public String toString() {
        return "\nCodigo do Carro=" + codigo + "\nDistância total(m)=" + distanciaPercorridaEmMetros + "\nVelocidade(Km/h)=" + velocidadeKmPorHora + "\nTanque(L): " + tanque + "\nConsumo (Km/L): " + consumoEmKmPorLitros;
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

    public double getTanque() {
        return tanque;
    }

   
    public double getConsumo() {
        return consumoEmKmPorLitros;
    }

    public void setConsumo(double consumoEmKmPorLitros) {
        this.consumoEmKmPorLitros = consumoEmKmPorLitros;
    }
}
