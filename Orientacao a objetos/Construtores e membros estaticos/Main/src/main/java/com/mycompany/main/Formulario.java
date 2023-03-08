/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author carlosrosa
 */
public class Formulario {
    private String nome, senha, email; //Atributo de objeto
    private int idade; //Atributo de objeto
    private static int quantidadeDeContas; //Atributo de classe
    
    Formulario(String nome, String senha, String email, int idade){
        quantidadeDeContas++;
        //System.out.println("Total de contas: " + quantidadeDeContas);
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.idade = idade;
    }
    
    public void alteraNome(String nome){
        this.nome = nome;
    }
    
    public void alteraSenha(String senha){
        this.senha = senha;
    }
    
    public void alteraEmail(String email){
        this.email = email;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
       
    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return this.idade;
    }
    
    public void analisaIdade(int idade){
        if (idade < 18){
            System.out.println("Não cadastramos menores de idade.");
            return;
        }
        this.idade = idade;
    }

    public static int getQuantidadeDeContas() { //Como quantidadeDeContas é um atributo de classe e não de instância
        return quantidadeDeContas;              //É preciso dizer que seu get também é static, assim como sua declaração de atributo
    }                                           //Se não fizer isso, não vai ser possível entender esse valor no Main, uma vez que ele é private

}
