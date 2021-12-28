package com.mycompany.carro;


public class metodos {

   
    public static void main(String[] args) {
       Carro c1 = new Carro();
       c1.modelo = "sedan";
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       c1.combustivel = "cheio";
       
       c1.abrir();
                    
       c1.status();
       
        
    }
    
}
