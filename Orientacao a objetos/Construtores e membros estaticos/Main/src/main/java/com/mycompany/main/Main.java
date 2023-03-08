/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author carlosrosa
 */
public class Main {

    public static void main(String[] args) {
        String senha;
        Scanner sc = new Scanner (System.in);
        Formulario usuario = new Formulario("Carlos", "Jfl123456", "carlos.rosa@jfl.com.br", 19);
        Formulario usuario_1 = new Formulario("Carlos", "Jfl123456", "carlos.rosa@jfl.com.br", 19);
        Formulario usuario_2 = new Formulario("Carlos", "Jfl123456", "carlos.rosa@jfl.com.br", 19);
        Formulario usuario_3 = new Formulario("Carlos", "Jfl123456", "carlos.rosa@jfl.com.br", 19);
        System.out.print("Quantidade de contas: " + Formulario.getQuantidadeDeContas());
        //System.out.println("Nome: " + usuario.getNome());
        //System.out.println("Senha: " + usuario.getSenha());
        //System.out.println("Email: " + usuario.getEmail());
        //usuario.analisaIdade(121);
        //System.out.println("Idade: " + usuario.getIdade());
        //System.out.println("Digite a nova senha: ");
        //senha = sc.next();
        //usuario.setSenha(senha);
        //System.out.println("Nova senha: " + usuario.getSenha());
        
    }
}
