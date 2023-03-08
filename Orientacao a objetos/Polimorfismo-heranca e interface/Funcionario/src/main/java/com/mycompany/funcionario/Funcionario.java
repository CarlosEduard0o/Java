/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionario;

/**
 *
 * @author carlosrosa
 */
public class Funcionario {
    private String nome, cpf;
    private double salario;
    
    //protected double salario;  -->  Publico para os filhos
    
    //private int tipo = 0;                   0 - Funcionário comum, 1 - Gerente, 2 - Diretor
    
    //public Funcionario (String nome, String cpf, double salario){
    //    this.nome = nome;
    //    this.cpf = cpf;
    //   this.salario = salario;
    //}
    
//    public double getBonificacao(){         //Metodo que retorna uma bonificação de acordo com o cargo
//        return switch (this.tipo) {
//            case 0 -> this.salario * 0.1;   // Funcionário comum
//            case 1 -> this.salario;         // Gerente
//            default -> salario + 1000.00;   // Diretor
//        };                                  // Mas não é prático utilizar vários IFs ou switch. Conforme novos tipos forem surgindo, sempre temos que 
//    }                                       // adicionar mais IFs ou case

    public double getBonificacao(){
        return this.salario * 0.1;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

//    public void setTipo(int tipo) {
//        this.tipo = tipo;
//    }
                 
}
