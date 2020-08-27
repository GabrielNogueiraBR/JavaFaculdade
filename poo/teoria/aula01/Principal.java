package poo.teoria.aula01;

public class Principal {
    
    Bolo b1; // declaramos uma variável b1 do tipo Bolo. Só temos um objeto quando damos new Classe()
    Bolo b2; // esta variável é um ponteiro para o tipo (Classe) Bolo
    Bolo b3;
    Bolo b4;

    b1 = new Bolo(); // inicializamos um objeto do tipo bolo que será armazenado em b1
    b2 = null;
    b3 = new Bolo("Morango"); // criação de um objeto utilizando construtores
    b4 = b1; // aqui temos apenas a referencia do objeto sendo gravada em b4, ou seja, o mesmo objeto que está sendo referenciado em b1 também está sendo referenciado em b4. Dessa forma, o endereço que aponta para o objeto criado está tanto em b1 e b4, pois eles agem como ponteiros que apontam para o endereço do objeto.


    // Objetos em java são armazenados por referência
    // ou seja, b1 vai armazenar um endereço do tipo 0x12432423

    System.out.println("-------------------- ENDEREÇOS --------------------");
    System.out.println(b1); // ponteiro que aponta para um objeto
    System.out.println(b2); // ponteiro null
    System.out.println(b3); // ponteiro que aponta para um objeto
    System.out.println(b4); // ponteiro que aponta para o mesmo objeto de b1
    
    // vemos a relação de b1 ser o mesmo endereço de b4 em:
    System.out.println("--------------------- B1 = B4 ---------------------");
    System.out.println(b4);
    System.out.println(b1);
    
    System.out.println("--------------------- METODOS ---------------------");
    b1.setSabor("Chocolate"); // definimos um atributo através do método setSabor
    b1.fazerBolo();
    b3.fazerBolo();

    System.out.println("--------------------- OBJETOS ---------------------");
    System.out.println("O bolo de " + b1.getSabor() + " foi feito.");
    System.out.println("O bolo de " + b3.getSabor() + " foi feito.");
    System.out.println("---------------------------------------------------");
}