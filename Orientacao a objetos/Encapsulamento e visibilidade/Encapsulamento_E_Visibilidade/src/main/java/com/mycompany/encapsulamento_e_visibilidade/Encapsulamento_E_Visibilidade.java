/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulamento_e_visibilidade;

import java.util.Scanner;

/**
 *
 * @author carlosrosa
 */
public class Encapsulamento_E_Visibilidade {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int NumeroDaConta, NovoNumeroDaConta;
        String nome, cpf, profissao;
        //Bom, primeiro foi instanciado um objeto conta (Conta) e carlos (Cliente)
        //Encapsulamos todos os atributos de ambos objetos e criamos os getters e setters
        Conta conta = new Conta(200);
        Cliente carlos = new Cliente();
        if(conta.saca(150)){
            System.out.println("Saque realizado");
        } else {
            System.out.println("Não foi possível efetuar o saque. Verifique se há saldo.");
        }
        System.out.println("O novo saldo é de: " + conta.getSaldo());
        System.out.print("Digite o número da conta: ");
        NumeroDaConta = sc.nextInt();
        conta.setNumero(NumeroDaConta);
        System.out.println("O número da conta é: " + conta.getNumero());
        System.out.print("Digite o novo número da conta: ");
        NovoNumeroDaConta = sc.nextInt();
        conta.setNumero(NovoNumeroDaConta);
        System.out.println("O novo número da conta é: " + conta.getNumero());
        System.out.print("Digite o nome do cliente: ");
        nome = sc.next();
        
        //System.out.print("CPF do cliente: ");
        //cpf = sc.next();
        //System.out.print("Profissão do cliente: ");
        //profissao = sc.next();
        
        //Em seguida, enviamos o nome ao atributo nome do objeto carlos tipo Cliente
        //como o atributo titular do objeto conta é do tipo Cliente, inserimos o nome do cliente em seu atributo nome
        carlos.setNome(nome);
        //carlos.setCpf(cpf);
        //carlos.setProfissao(profissao);
        
        //Aqui passamos como atributo para o método setTitular da conta o objeto carlos, que pode conter nome, cpf e profissão.
        //Neste caso estou utilizando somente nome.
        conta.setTitular(carlos);
        System.out.println("Nome do cliente: " + conta.getTitular().getNome());
        
        //Tenho uma outra alternativa que seria criar uma variável temporária, conforme as linhas abaixo, aqui fiz com profissão ao invés de nome:
        //Através do conta.getTitular() estou pegando dentro do titular o objeto Carlos, pegar não, apontar para ele. Visto que Titular é do tipo Cliente
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");
        
        //Aqui estou apenas mostrando que carlos, titularDaConta e conta.getTitular estão apontando para o mesmo lugar, portanto mostrarão a mesma coisa
        System.out.println("Endereço conta.getTitular: " + conta.getTitular());
        System.out.println("Endereço carlos: " + carlos);
        System.out.println("Endereço titularDaConta: " + titularDaConta);
        
        //Na linha de baixo, eu estou alterando o nome do titular da conta
        //Eu pego a titular e dentro dele seto o nome, mas ele está dentro de conta, sendo assim fazemos conforme a linha de baixo
        System.out.print("Digite o novo nome do cliente: ");
        nome = sc.next();
        conta.getTitular().setNome(nome);
        System.out.println("Nome do cliente: " + conta.getTitular().getNome());
        System.out.println("Profissão do cliente: " + conta.getTitular().getProfissao());
        //System.out.println("CPF do cliente: " + carlos.getCpf());
        //System.out.println("Profissão do cliente: " + carlos.getProfissao());
        
    }
}
