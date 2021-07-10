/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp;

/**
 *
 * @author Romulo Leite
 */
public class Zona {
    
    private String nome;
    private Divisao[] divisoes;
    private int numeroDivisoes;
    public static final int MAX_ZONA = 10;

    public Zona(String nome, Divisao[] divisoes, int numeroDivisoes) {
        this.nome = nome;
        this.divisoes = new Divisao[this.numeroDivisoes];
        this.numeroDivisoes = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Divisao[] getDivisoes() {
        return divisoes;
    }

    public void setDivisoes(Divisao[] divisoes) {
        this.divisoes = divisoes;
    }

    public int getNumeroDivisoes() {
        return numeroDivisoes;
    }

    public void setNumeroDivisoes(int numeroDivisoes) {
        this.numeroDivisoes = numeroDivisoes;
    }
    
    
    
    
    
}
