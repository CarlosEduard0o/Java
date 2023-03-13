/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author carlosrosa
 * VISUALIZAÇÕES/FUNÇÕES DO PROFESSOR:
 * POSTAR / VISUALIZAR NOTAS;
 * POSTAR / VISUALIZAR PRESENÇA DA TURMA;
 * POSTAR / VISUALIZAR MATERIAL;
 * ABRIR / DELETAR TURMAS;
 * COMPARAR NOTA DE TURMAS;
 */
public class Professor extends Pessoas implements Autenticavel {
    private String senha;
    private int matricula;
    private AutenticacaoUtil autenticacao;
    
    public Professor(){
        this.autenticacao = new AutenticacaoUtil();
    } 
    
    public void setSenha(String senha) {
        this.autenticacao.setSenha(senha);
    }
    @Override
    public void setMatricula(int matricula) {
        this.autenticacao.setMatricula(matricula);
    }

    public boolean autentica(String senha, int matricula) {
        return this.autenticacao.autentica(senha, matricula);
    }
}
 

