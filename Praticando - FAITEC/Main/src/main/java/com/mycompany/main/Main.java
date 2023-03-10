/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author carlosrosa
 */
public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Administrador administrador = new Administrador();
        Sistema sistema = new Sistema();
                
        aluno.setSenha("2222");
        aluno.setMatricula(1);
        aluno.setNome("Carlos");
        professor.setSenha("2222");
        professor.setMatricula(2);
        professor.setNome("Eduardo");
        administrador.setSenha("2222");
        administrador.setMatricula(3);
        administrador.setNome("Benetido");
   
        
        sistema.autentica(aluno);
        sistema.autentica(professor);
        sistema.autentica(administrador);
    }
}
