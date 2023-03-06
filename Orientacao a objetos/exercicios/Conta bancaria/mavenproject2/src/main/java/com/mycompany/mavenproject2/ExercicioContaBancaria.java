/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author carlosrosa
 */
public class ExercicioContaBancaria {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        //primeiraConta.saldo = 200;
        double valor;
        String nome_cliente, cpf_cliente, profissao_cliente;
        double valor_a_transferir;
        System.out.println("O saldo da conta e: " + primeiraConta.saldo);
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor que você deseja depositar: ");
        valor = sc.nextDouble();
        primeiraConta.deposita(valor);
        System.out.println("Novo saldo: " + primeiraConta.saldo);
        System.out.print("Digite o valor que você deseja sacar: ");
        valor = sc.nextDouble();
        if (primeiraConta.sacar(valor)){
            System.out.println("Operação realizada com sucesso!");
        } else {
            System.out.println("Operação não realizada.");
        }
        Conta contaDoCarlos = new Conta();
        System.out.print("O valor a transferir será de: ");
        valor_a_transferir = sc.nextDouble();
        if (primeiraConta.transfere(valor_a_transferir, contaDoCarlos)){
            System.out.print("O saldo da conta do Carlos foi para: ");
            System.out.println(contaDoCarlos.saldo);
            System.out.print("O saldo da primeira conta foi para: ");
            System.out.println(primeiraConta.saldo);
            System.out.println("Transferencia realizada com sucesso.");
        } else {
            System.out.println("Transferência não realizada por falta de saldo.");
        }
        // Criei uma nova classe cliente, para utilizar as informações de nome, CPF e profissão
        // Esses atributos de cliente será apontado para o atributo titular, em primeiraConta
        // Tudo referencia
        Cliente cliente = new Cliente();
        System.out.print("Digite o nome do cliente: ");
        nome_cliente = sc.next();
        cliente.nome = nome_cliente;
        System.out.print("Digite o CPF do cliente: ");
        cpf_cliente = sc.next();
        cliente.cpf = cpf_cliente;
        System.out.print("Digite a profissão do cliente: ");
        profissao_cliente = sc.next();
        cliente.profissao = profissao_cliente;
        primeiraConta.titular = cliente; // Aqui faz com que o atributo titular da primeiraConta receba o objeto cliente
        //System.out.println("Nome: " + cliente.nome);
        System.out.println("Nome: " + primeiraConta.titular.nome);
        System.out.println("CPF: " + primeiraConta.titular.cpf);
        System.out.println("Profissão: " + primeiraConta.titular.profissao);
        sc.close();                    
    }
}
