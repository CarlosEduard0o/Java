/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author carlosrosa
 */
public class Aluno extends Pessoas implements Autenticavel {
    private String senha;
    private int matricula;

//VISUALIZAÇÕES/FUNÇÕES DO ALUNO:
//VISUALIZAR NOTAS;
//VISUALIZAR A PRÓPRIA PRESENÇA;
//VISUALIZAR MATERIAL;
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

//    @Override
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
    
    public boolean autentica(String senha, int matricula) {
        if ((this.senha == senha) && (this.matricula == matricula)){                   //Podemos então adicionar o que for concreto aqui.                    
            return true;
        } else {
            return false;
        }
    }
}
    


