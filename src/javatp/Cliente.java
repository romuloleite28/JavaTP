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

    public Cliente(int id, String nome, LocalDate dataNascimento, Genero genero, float peso, float altura, String patologias, TipoPessoa tipo) {
        super(id, nome, dataNascimento, genero, peso, altura, patologias, tipo);
    }

    public Pessoa adicionarCliente() throws IOException {

        byte[] localNome = new byte[30];
        byte[] localID = new byte[4];
        byte[] localDataNascimento = new byte[10];
        byte[] localPeso = new byte[4];
        byte[] localAltura = new byte[4];
        byte[] localPatologias = new byte[50];
        char localGenero;
        char tipoPessoa;

        System.out.println("ID: ");
        System.in.read(localID);
        String id1 = new String(localID);
        int id2 = Integer.parseInt(id1);

        System.out.println("Nome: ");
        System.in.read(localNome);
        String nome1 = new String(localNome); // Para o programa não dar skip 
        System.in.read(localNome);
        String nome2 = new String(localNome);

        System.out.println("Data de nascimento: ");
        System.in.read(localDataNascimento);
        String dataNascimento1 = new String(localDataNascimento);
        LocalDate dataNascimento2 = LocalDate.parse(dataNascimento1);
        System.out.println("Data de nascimento: ");

        System.out.println("Género:  (m - masculino / f - feminino)");
        Genero genero1 = null;
        if ((localGenero = (char) System.in.read()) != 'p') {
            if (localGenero == 'm') {
                genero1 = Genero.MASCULINO;
            } else if (localGenero == 'f') {
                genero1 = Genero.FEMININO;
            } else {
                throw new IOException("Opção inválida");
            }
        }

        System.out.println("Peso: ");
        System.in.read(localPeso);
        String peso1 = new String(localPeso);
        System.in.read(localPeso);
        float peso2 = Float.parseFloat(peso1);

        System.out.println("Altura: ");
        System.in.read(localAltura);
        String altura1 = new String(localAltura);
        System.in.read(localAltura);
        float altura2 = Float.parseFloat(altura1);

        System.out.println("Patologias: ");
        System.in.read(localPatologias);
        String patologias1 = new String(localPatologias);
        System.in.read(localPatologias);
        String patologias2 = new String(localPatologias);

        System.out.println("Tipo de pessoa: (c - cliente / f - funcionário");
        TipoPessoa tipoPessoa1 = null;
        if ((tipoPessoa = (char) System.in.read()) != 'p') { //o p é algo que não pode acontecer, comparado ao null
            if (tipoPessoa == 'c') {
                tipoPessoa1 = TipoPessoa.CLIENTE;
            } else if (tipoPessoa == 'f') {
                tipoPessoa1 = TipoPessoa.FUNCIONARIO;
            } else {
                throw new IOException("Opção inválida");
            }
        }

        Pessoa novoCliente = new Pessoa(id2, nome2, dataNascimento2, genero1, peso2, altura2, patologias2, tipoPessoa1) {
        };

        return novoCliente;
    }
}
