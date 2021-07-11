/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp;

import java.time.LocalDate;



/**
 *
 * @author Romulo Leite
 */
public class Cliente extends Pessoa {

    public Cliente(int id, String nome, LocalDate dataNascimento, Genero genero, float peso, float altura, String[] patologias, TipoPessoa tipo) {
        super(id, nome, dataNascimento, genero, peso, altura, patologias, tipo);
    }

    
   
    
    
 
}
