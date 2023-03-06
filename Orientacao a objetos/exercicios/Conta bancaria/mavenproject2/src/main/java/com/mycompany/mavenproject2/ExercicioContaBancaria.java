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

        sc.close();                    
    }
}
