package poo.teoria.aula01;

public class Bolo {
    private String sabor; // atributo
    
    public Bolo() // construtor da classe bolo
    {

    }

    public Bolo(String sabor) // construtor da classe bolo com sobrecarga de métodos
    {
        this.sabor = sabor; // esse construtor já define o sabor do bolo no momento que o objeto é criado
    }
    
    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public String getSabor(){
        return this.sabor;
    }
    
    public void fazerBolo() // metodo da classe bolo
    { 
        System.out.println("Fazendo o bolo de " + sabor);
    }

}