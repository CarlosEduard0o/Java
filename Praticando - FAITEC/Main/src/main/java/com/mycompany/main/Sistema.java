/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author carlosrosa
 */
public class Sistema {
    private String senha = "2222";
    private int matricula = 3;
//    private String nome;

//    public void setNome(String nome) {
//        this.nome = nome;
//    }
    
    public void autentica (Autenticavel pessoa){
        boolean autenticou = pessoa.autentica(this.senha, this.matricula);
        if(autenticou){
            System.out.println("Bem vindo.");
        } else {
            System.out.println("Credenciais inválidas");    
        }
    }    
}