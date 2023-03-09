/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conceitopolimorfismo;

/**
 *
 * @author carlosrosa
 */
public class Main {

    public static void main(String[] args) {
        
        ControleBonificacao controle = new ControleBonificacao();
        
        Funcionario funcionario = new Funcionario ();
        funcionario.setNome("Carlos");
        funcionario.setCpf("130.256.616-40");
        funcionario.setSalario(3125.5);
        funcionario.setIdade(24);
        controle.registra(funcionario);
        
        Gestor gestor = new Gestor();                  //Gestor gestor = new Gestor(); e Funcionario gestor = new Gestor();, qualquer um dos dois vai funcionar
        gestor.setNome("Raul");
        gestor.setCpf("584.544.654.-58");
        gestor.setSalario(9856.1);
        gestor.setIdade(38);
        controle.registra(gestor);
        
        Gerente gerente = new Gerente();               //Gerente gerente = new Gerente(); e Funcionario gerente = new Gerente();, qualquer um dos dois vai funcionar    
        gerente.setNome("Mario");
        gerente.setCpf("987.654.321-10");          //Mas porque os dois comentários acima funcionam?
        gerente.setSalario(15898.3);            //Porque, Gerente e gestor são filhos do Funcionario
        gerente.setIdade(41);                    //Esse é o conceito que explica porque na classe ControleBonificacao eu posso colocar somente um   
        controle.registra(gerente);         //metodo para todos os funcionários ao inves de um método para cada funcionário, como está comentado lá.                                 
        System.out.printf("%.2f" ,controle.getSoma());
        
    }
}
