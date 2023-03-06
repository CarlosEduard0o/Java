/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author carlosrosa
 */
public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;
    
    boolean deposita(double valor){
        this.saldo += valor;
        return true;
    }
    boolean sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Novo saldo: " + this.saldo);
            return true;
        } else {
            System.out.println("Valor indisponível para saque");
            return false;
        }
    }
    public boolean transfere(double valor_a_transferir, Conta destino){
        if (this.saldo >= valor_a_transferir){
            this.saldo -= valor_a_transferir;
            destino.deposita(valor_a_transferir);
            return true;
        }
        return false;
    }
}
