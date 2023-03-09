/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitopolimorfismo;

/**
 *
 * @author carlosrosa
 */
public class Gerente extends Funcionario {
    private String senha_cofre;
    
    public double getBonificacao (){
        return super.getSalario();
    }
}
