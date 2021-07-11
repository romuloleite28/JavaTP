/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp;

import java.io.IOException;
import java.time.LocalDate;

/**
 *
 * @author Romulo Leite
 */
public class Cliente extends Pessoa {

    public Cliente(int id, String nome, LocalDate dataNascimento, Genero genero, float peso, float altura, String[] patologias, TipoPessoa tipo) {
        super(id, nome, dataNascimento, genero, peso, altura, patologias, tipo);
    }

    public Pessoa adicionarCliente() throws IOException {

        byte[] nome = new byte[30];

        System.out.println("Nome: ");
        System.in.read(nome);
        String nome1 = new String(nome);
        System.in.read(nome);
        String nome2 = new String(nome);

        System.out.println("ID: ");
        System.in.read(id);
        String id1 = new String(id);
        int id2 = Integer.parseInt(id1);
        
        
    }
}
