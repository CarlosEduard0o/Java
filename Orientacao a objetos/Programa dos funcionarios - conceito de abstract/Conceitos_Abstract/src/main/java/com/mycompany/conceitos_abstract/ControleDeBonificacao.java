/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitos_abstract;

/**
 *
 * @author carlosrosa
 */
public class ControleDeBonificacao {
    private double soma;
    public void registra (Funcionario funcionario){
        double boni = funcionario.getBonificacao();
        this.soma += boni;
    }

    public double getSoma() {
        return soma;
    }
}
