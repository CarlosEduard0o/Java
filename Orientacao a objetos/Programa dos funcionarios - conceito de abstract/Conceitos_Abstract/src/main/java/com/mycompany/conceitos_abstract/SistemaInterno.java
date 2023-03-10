/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitos_abstract;

/**
 *
 * @author carlosrosa
 */
public class SistemaInterno {
    private String senha = "2222";
    
//    public void autentica (Gerente g){
//        boolean autenticou = g.autentica(this.senha);
//        if(autenticou){
//            System.out.println("Pode entrar no sistema");
//        } else {
//            System.out.println("Não pode entrar no sistema");    
//        }
//    }  
//    
//    public void autentica (Administrador a){
//        boolean autenticou = a.autentica(this.senha);
//        if(autenticou){
//            System.out.println("Pode entrar no sistema");
//        } else {
//            System.out.println("Não pode entrar no sistema");    
//        }
//    }  
    
    public void autentica (Autenticavel fa){
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou){
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");    
        }
    }    
}
