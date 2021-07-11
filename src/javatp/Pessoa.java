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
public abstract class Pessoa {
    
    private int id;
    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;
    private float peso;
    private float altura;
    private String patologias[];
    private TipoPessoa tipo;
   
    
    
//    @Override
//    public boolean equals(Object obj) {
//        if (obj.getClass().equals(this.getClass())) {
//
//            Pessoa c = (Pessoa) obj;
//
//            return this.nome.equals(c.getNome()) && this.data_nascimento.equals(c.getData_nascimento());
//        }
//        return false;
//    }

}
