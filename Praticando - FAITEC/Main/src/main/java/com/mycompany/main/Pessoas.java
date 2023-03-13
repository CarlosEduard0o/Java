/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author carlosrosa
 */
public abstract class Pessoas {
    private String nome, senha;
    private int idade, matricula;

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public String getSenha() {
        return this.senha;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }   
 }
