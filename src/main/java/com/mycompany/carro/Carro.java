/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carro;

public class Carro {
    String modelo;
    String cor;
    float ponta;
    String combustivel;
    boolean fechado;
    void status(){
        System.out.println("Qual o modelo?  " + this.modelo);
        System.out.println("qual a cor? "+ this.cor);
        System.out.println(" ponta? "+ this.ponta);
        System.out.println("combustivel " + this.combustivel);
        System.out.println("o carro esta fechado? "+ this.fechado);
            }
    void dirigir(){
        if (this.fechado == true){
            System.out.println("erro nao posso dirigir");
        }else{
            System.out.println("estou dirigindo");
        }        
    }
    void fechar(){
        this.fechado = true;        
    }
    void abrir(){
        this.fechado = false;        
    }
}