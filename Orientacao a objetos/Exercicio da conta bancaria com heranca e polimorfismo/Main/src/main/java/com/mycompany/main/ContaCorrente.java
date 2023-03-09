/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author carlosrosa
 */
public class ContaCorrente extends Conta {
    public ContaCorrente (int agencia, int numero){  //Estou criando um construtor específico, com os argumentos do construtor mãe, senão não funciona
        super(agencia, numero);                      //Estou usando o construtor mãe para passar os parâmetros para o chamado do construtor específico     
    }

    @Override                                   //Isso se chama anotação, uma configuração. É uma configuração para o compilador. A assinatura deve ser igual
    public boolean saca(double valor) {         //Se na classe mãe é public boolean (double), aqui tem que ser igual. Se mudar não compila, isso significa ter a assiantura igual
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
