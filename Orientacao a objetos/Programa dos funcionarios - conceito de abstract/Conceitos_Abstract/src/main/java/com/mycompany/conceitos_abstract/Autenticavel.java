/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitos_abstract;

/**
 *
 * @author carlosrosa
// */
//public abstract class Autenticavel extends Funcionario {
//Mas note, não podemos adicionar nada concreto aqui. Porém precisamos do setSenha, do método autentica, como que faz?
public abstract interface Autenticavel {
    
//    private String senha;
//    
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }    
//
//    public boolean autentica (String senha){
//        if (this.senha == senha){
//            return true;
//        } else {
//            return false;
//        }
//    }
    
//    Tudo que está acima é concreto. Por passar a ser uma classe abstrata por conta da implementação do conceito de interface, comentei tudo que era concreto.
//    Lembrando que em classe abstratas, não pode haver implementação, portanto fica da maneira como está abaixo.
    
    public abstract void setSenha(String senha);
    public abstract boolean autentica (String senha);
    
}
