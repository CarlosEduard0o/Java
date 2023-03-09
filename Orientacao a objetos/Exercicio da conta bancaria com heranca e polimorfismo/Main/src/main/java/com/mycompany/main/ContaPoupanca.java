/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author carlosrosa
 */
public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero){  //Estou criando um construtor específico, com os argumentos do construtor mãe, senão não funciona
        super(agencia, numero);                     //Estou usando o construtor mãe para passar os parâmetros para o chamado do construtor específico   
    }
    
}
