/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author carlosrosa
 */
public class AutenticacaoUtil {
    private String senha;
    private int matricula;
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public boolean autentica(String senha, int matricula) {
    if ((this.senha == senha) && (this.matricula == matricula)){                   
        return true;
    } else {
        return false;
    }
}
}
