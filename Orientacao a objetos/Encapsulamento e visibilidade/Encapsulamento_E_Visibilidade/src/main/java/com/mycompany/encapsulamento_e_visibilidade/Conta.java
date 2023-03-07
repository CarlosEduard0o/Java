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
    
    Conta(double valor_saldo){
        this.saldo += valor_saldo;
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
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
       
    
}
