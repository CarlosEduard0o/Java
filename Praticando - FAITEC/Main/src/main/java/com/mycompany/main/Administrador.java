/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author carlosrosa
 * VISUALIZAÇÕES/FUNÇÕES DO ADMINISTRADOR:
 * POSTAR / VISUALIZAR PRESENÇA DA TURMA;
 * POSTAR / VISUALIZAR MATERIAL;
 * CADASTRAR ALUNOS E FUNCIONÁRIOS;
 * POSTAR/VISUALIZAR NOTAS POR PROFESSOR/ANO/TURMA;
 * CRIAR/DELETAR TURMAS E DISCPLINAS;
 * INSERIR/REMOVER ALUNOS NAS TURMAS;  
 */
public class Administrador extends Pessoas implements Autenticavel{

    private String senha;
    private int matricula;
    private AutenticacaoUtil autenticacao;
    
    public Administrador(){
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
    
    
