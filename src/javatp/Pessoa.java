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

    protected int id;
    protected String nome;
    protected LocalDate dataNascimento;
    protected Genero genero;
    protected float peso;
    protected float altura;
    protected String patologias;
    protected TipoPessoa tipo;
    protected String cargo;
    
    //construtor do cliente 
    public Pessoa(int id, String nome, LocalDate dataNascimento, Genero genero, float peso, float altura, String patologias, TipoPessoa tipo) { 
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.patologias = patologias;
        this.tipo = tipo;
    }
    
    //construtor do funcionario
    public Pessoa(int id, String nome, LocalDate dataNascimento, Genero genero, float peso, float altura, String patologias, TipoPessoa tipo, String cargo) { 
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.patologias = patologias;
        this.tipo = tipo;
        this.cargo = cargo;
    }

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
