/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conceitos_abstract;

/**
 *
 * @author carlosrosa
 */
public class Conceitos_Abstract {

    public static void main(String[] args) {
       
        // Instanciações
        ControleDeBonificacao controle = new ControleDeBonificacao();
//      Funcionario f = new Funcionario();
        Designer d = new Designer();
        Gerente g = new Gerente();
        EditorDeVideo ev = new EditorDeVideo();
        Administrador a = new Administrador();
        SistemaInterno si = new SistemaInterno();
        Cliente c = new Cliente();
        
        //Passagem de parâmetros
        
//      f.setNome("Wellington");
//      f.setCPF("130.546.846-58");
//      f.setIdade(18);
//      f.setSalario(1897.85);
//      controle.registra(f);
        
        d.setNome("Carlos");
        d.setCPF("984.564.546-45");
        d.setIdade(31);
        d.setSalario(2584.56);
        controle.registra(d);
        
        ev.setNome("Rodrigo");
        ev.setCPF("568.847.846-58");
        ev.setIdade(27);
        ev.setSalario(3466.5);
        controle.registra(ev);
        
        g.setNome("Raul");
        g.setCPF("123.489.987-45");
        g.setIdade(61);
        g.setSalario(15586.56);
        g.setSenha("2222");
        controle.registra(g);
        si.autentica(g);
        
        a.setNome("Tatiana");
        a.setCPF("321.468.468-25");
        a.setIdade(48);
        a.setSalario(7568.56);
        a.setSenha("2222");
        controle.registra(a);
        si.autentica(a);
        
        c.setSenha("2222");
        si.autentica(c);
        
        
        //Prints
        
//      System.out.println("Nome do funcionario: " + f.getNome());
//        System.out.println("Nome do designer: " + d.getNome());
//        System.out.println("Nome do editor de video: " + ev.getNome());
//        System.out.println("Nome do gerente: " + g.getNome());
//        System.out.print("A bonificacao total é de: ");
//        System.out.printf("%.2f", controle.getSoma());
        
        
    }
}
