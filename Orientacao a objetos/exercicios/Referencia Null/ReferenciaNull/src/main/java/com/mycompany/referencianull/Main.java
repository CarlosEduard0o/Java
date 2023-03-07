/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.referencianull;

/**
 *
 * @author carlosrosa
 */
public class Main {

    public static void main(String[] args) {
        Conta contaDoCarlos = new Conta();
        System.out.println("Resultado: ");
        System.out.println(contaDoCarlos.titular);
        //System.out.println(contaDoCarlos.titular.nome);  Aqui daria um exception ao compilar, pois o atributo titular dentro de Conta, não foi inicializado, ou seja, não recebeu o tipo Cliente
        contaDoCarlos.titular = new Cliente();             //Nesta linha inicializamos o atributo titular  
        System.out.println(contaDoCarlos.titular.nome);  //printando aqui teremos null, visto que nada foi armazenado em titular
    }                                                      // Ao inves de inicializar o atributo titular por aqui, eu poderia ter feito da maneira que está comentada dentro da classe Conta         
}
