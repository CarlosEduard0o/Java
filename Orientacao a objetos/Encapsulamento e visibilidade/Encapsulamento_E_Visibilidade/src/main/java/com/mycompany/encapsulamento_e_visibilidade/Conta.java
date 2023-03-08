/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento_e_visibilidade;

/**
 *
 * @author carlosrosa
 */
public class Conta {
    
    //Encapsulamos todos os atributos de ambos objetos e criamos os getters e setters
    
    private double saldo;
    private int agencia, numero;
    private Cliente titular;
    
    Conta(double valor_saldo, int agencia, int numero){  //Construtor. Ele só é executado na criação do objeto
        this.saldo += valor_saldo;
        this.agencia = agencia;
        this.numero = numero;
    }
    
    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        if(numero <= 0){
            System.out.println("Não pode valor menor igual a 0.");
            return; //Para não excutar a linha this.numero = numero; Como é void, faz um retorno de nada, mas não executa a outra linha
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(int agencia) {
        if (agencia < 0){
            System.out.println("Não pode valor menor igual a 0. ");
            return; //Para não excutar a linha this.agencia = agencia; Como é void, faz um retorno de nada, mas não executa a outra linha
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
       
}
