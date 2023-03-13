/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitos_abstract;

/**
 *
 * @author carlosrosa
 */
public class AutenticacaoUtil {
    private String senha;
    
    
    public void setSenha(String senha) {
        this.senha = senha; 
    }

    public boolean autentica(String senha) {
        if (this.senha == senha){                   //Podemos então adicionar o que for concreto aqui.                    
            return true;
        } else {
            return false;
        }
    }
    
}
