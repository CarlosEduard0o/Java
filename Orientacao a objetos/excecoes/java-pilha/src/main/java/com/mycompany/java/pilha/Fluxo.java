/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java.pilha;

/**
 *
 * @author carlosrosa
 */
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }
    public static void metodo1(){
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
    public static void metodo2(){
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        System.out.println("Fim do metodo2");
    }
}
