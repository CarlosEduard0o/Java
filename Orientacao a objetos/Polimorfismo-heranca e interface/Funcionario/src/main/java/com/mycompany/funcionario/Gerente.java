/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionario;

/**
 *
 * @author carlosrosa
 */
public class Gerente extends Funcionario {
    private int senha;
    
    public boolean autentification (int senha){
        if (this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
        
//    public double getBonificacao(){         
//        return super.salario;           //Aqui estou usando super, mas se usar this funcionaria normalmente. A questão é que ao usar this, a pessoa         
//    }                                   //que for estudar o código vai achar que o atributo salario esta na classe Gerente, sendo que na verdade está
//                                        //na classe Funcionario. Ao usar super, a pessoa entenderá que terá que ir na classe mãe para ver o atributo.
    
//  Mas imagine que agora o Gerente terá uma nova bonificação, sendo seu próprio salário mais 10% do salário dos funcionários
    
    public double getBonificacao(){
        return super.getBonificacao() + super.getSalario();  //Antes estava somente super.salario, pois o atributo salário estava declarado
    }                                                            //como protected. Mas no dia a dia protected é pouco usado, e ainda permanece
                                                                 //sendo bboa prática usar o private. Portanto, eu posso usar o método getSalario   
                                                                 //criado na classe funcionario.   
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
