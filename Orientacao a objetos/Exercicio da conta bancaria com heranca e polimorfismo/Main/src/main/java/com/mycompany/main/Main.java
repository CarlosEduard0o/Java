/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author carlosrosa
 */
public class Main {
    public static void main (String[] args){
        
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);
        
        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200);
        
        cc.transfere(10, cp);
        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
        
    }
}
