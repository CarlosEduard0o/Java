/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitopolimorfismo;

/**
 *
 * @author carlosrosa
 */
public class Gestor extends Funcionario {
    private String senha_servidor;
    
    public double getBonificacao (){
        return super.getSalario()*0.5;
    }
    
}
