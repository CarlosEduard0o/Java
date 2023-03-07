/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.referencianull;

/**
 *
 * @author carlosrosa
 */
public class Conta {
    double saldo;
    int agencia, numero;
    Cliente titular;
    //Cliente titular = new Cliente(); Mas fazendo deste jeito, o atributo sempre inicializa zerado. No caso de um banco nem sempre é bom inicializar com o atributo zerado, visto que pode ser do interesse do banco que um mesmo cliente tenha mais de uma conta
}
