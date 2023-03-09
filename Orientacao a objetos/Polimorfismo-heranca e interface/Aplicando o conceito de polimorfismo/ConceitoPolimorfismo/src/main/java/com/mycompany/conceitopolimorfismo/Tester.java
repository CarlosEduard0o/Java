/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitopolimorfismo;

/**
 *
 * @author carlosrosa
 */
public class Tester extends Funcionario {
    
    public double getBonificacao (){
        return super.getSalario() * 0.1;
    }
}
