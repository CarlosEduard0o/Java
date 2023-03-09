/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author carlosrosa
 */
public class Conta {
        private double saldo; 
        private int numero, agencia; 
        private Cliente titular; 
        private static int total = 0;
        
//        public Conta(){                              //Criei esse construtor padrão, pos sem ele não seria possível criar as classes filhas, sempre daria erro
//            
//        }
        
        public Conta(int agencia, int numero){      //Note que aqui, na classe Conta eu tenho dois construtores, sendo um deles padrão e outro específico. Sendo assim, posso normalmente ter mais
            Conta.total++;                          //de um construtor na mesma classe.
            //System.out.println("O total de contas é " + Conta.total);
            this.agencia = agencia;
            this.numero = numero;
            //this.saldo = 100;
            //System.out.println("Estou crianto uma conta " + this.numero);
        }
        
        public void deposita(double valor){
            this.saldo += valor;
        }
        
        public boolean saca(double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
        
        public boolean transfere(double valor, Conta destino){
            if(this.saca(valor)){
                destino.deposita(valor);
                return true;
            } else {
                return false;
            }
        }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
    
    
}

