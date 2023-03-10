/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitos_abstract;

/**
 *
 * @author carlosrosa
 */
//A classe gerente é funcionario e assina autenticavel
public class Gerente extends Funcionario implements Autenticavel {
    private String senha;    
    
    public double getBonificacao(){
        return super.getSalario();
    }
    
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

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {
        if (this.senha == senha){                   //Podemos então adicionar o que for concreto aqui.                    
            return true;
        } else {
            return false;
        }
    }
}
