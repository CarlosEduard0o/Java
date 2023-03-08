/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionario;

/**
 *
 * @author carlosrosa
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Gerente g1 = new Gerente();
        
        f1.setNome("Carlos");
        f1.setCpf("130.256.616-40");
        f1.setSalario(3000.0);
        
        g1.setNome("Carlos Eduardo");
        g1.setCpf("130.256.616-40");
        g1.setSalario(5000.00);
        
        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        
        g1.setSenha(5555);
        
        boolean autenticou = g1.autentification(5555);
        if(autenticou){
            System.out.println("Ok");
        } else {
            System.out.println("Senha inválida");
        }
        
        System.out.println("Bonificação do gerente: " + g1.getBonificacao());
        System.out.print("Bonificação do funcionario: ");
        System.out.printf("%.2f", f1.getBonificacao());
    }
}
