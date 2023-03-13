/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitos_abstract;

/**
 *
 * @author carlosrosa
 */
//A classe administrador é funcionario e assina autenticavel
public class Administrador extends Funcionario implements Autenticavel {
    private String senha;
    private AutenticacaoUtil autenticador;
    
    public Administrador(){
    this.autenticador = new AutenticacaoUtil();
    }
    
    public double getBonificacao(){
        return 1000;
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
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(String senha) {        //Agora temos que assinar o Autenticavel, e o implements faz isso. 
        return this.autenticador.autentica(senha);                   //Podemos então adicionar o que for concreto aqui.                            
    }
}
