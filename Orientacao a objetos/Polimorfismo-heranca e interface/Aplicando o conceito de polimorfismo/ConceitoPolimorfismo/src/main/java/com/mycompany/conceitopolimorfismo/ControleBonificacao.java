/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conceitopolimorfismo;

/**
 *
 * @author carlosrosa
 */
public class ControleBonificacao {
    private double soma;
    
//    public void registra (Funcionario funcionario){
//        double boni = funcionario.getBonificacao();
//        this.soma += boni ;           //625,1
//        }
////    
////    public void registra (Gestor gestor){
////        double boni = gestor.getBonificacao();
////        this.soma += boni ;           //4.928,05    
////        }
////        
////    public void registra (Gerente gerente){
////        double boni = gerente.getBonificacao();
////        this.soma += boni ;           //15898.3  
////        }    

    //A maneira como fizemos acima até funciona. Mas acaba deixando de ser uma boa prática pelo fato de precisar fazer um método para cada cargo
    
    public void registra (Funcionario funcionario){
        double boni = funcionario.getBonificacao();
        //System.out.printf( "%.2f",boni);
        //System.out.println();
        this.soma += boni ;           //625,1
        //System.out.println(this.soma);
        }
    
    //A maneira comentada tem o mesmo resultado do que a maneira que não está comentada. Mas como é possível? Na maneira comentada, cada método é progamado
    //Na maneira sem estar comentada só tem um método, que referencia ao funcionario. Nele eu não precisei referenciar o gestor e o gerente.
    //Isso é possível porque o Gester e um Gerente são filhos da classe Funcionario, ou seja, eles também são da classe funcionário.
    
    public double getSoma() {
        return soma;
    }
}
