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
    private int numeroDivisoes;
    static Divisao[] divisoes;

    public Zona(String nome, int numeroDivisoes, Divisao[] divisoes) {
        this.nome = nome;
        this.numeroDivisoes = numeroDivisoes;
        this.divisoes = divisoes;
    }

}
