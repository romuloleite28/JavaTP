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
public class Divisao {

    private String nome;
    private int lotacao;
    private Zona zona;
    static Pessoa[] pessoas;

    public Divisao(String nome, int lotacao, Zona zona, Pessoa[] pessoas) {
        this.nome = nome;
        this.lotacao = lotacao;
        this.zona = zona;
        this.pessoas = pessoas;
    }

}
