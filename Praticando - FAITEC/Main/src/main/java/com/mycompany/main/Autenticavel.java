/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author carlosrosa
 */
public abstract interface Autenticavel {
//  public abstract void setNome(String nome);
    public abstract boolean autentica (String senha, int matricula);
}
