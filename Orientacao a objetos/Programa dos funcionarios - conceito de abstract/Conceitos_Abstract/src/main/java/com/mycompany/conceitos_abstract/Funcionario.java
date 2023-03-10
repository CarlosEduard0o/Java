/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitos_abstract;

/**
 *
 * @author carlosrosa
 */
// Não pode mais instanciar dessa classe Funcionario, pois ela é abstract.
public abstract class Funcionario {
    private String nome, CPF;
    private double salario;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    //Abstract no método significa que o mesmo não possui corpo. Não há implementação nesse método, mas há nos filhos. Com isso sou obrigado a colocar implementação nos filhos.
    //Se eu coloco um método abstract na classe mão, eu sou obrigado a colcoar a implementação nas classes filhas. Classe mãe é o mesmo que Classe pai
    public abstract double getBonificacao();

    public double getSalario() {
        return salario;
    }

}
