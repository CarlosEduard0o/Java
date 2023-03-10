/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitos_abstract;

/**
 *
 * @author carlosrosa
 */
//public class Cliente extends Autenticavel {
//A classe cliente assina Autenticavel
    public class Cliente implements Autenticavel {  //Alterado de extends para implements, pois Autenticavel passou a ser uma interface e não da para herdar interface
        private String senha;

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {        //Agora temos que assinar o Autenticavel, e o implements faz isso. 
        if (this.senha == senha){                   //Podemos então adicionar o que for concreto aqui.                    
            return true;
        } else {
            return false;
        }
    }
                                                       
}
