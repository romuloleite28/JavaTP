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
    private Cliente[] clientes;
    private int numeroClientes;

    public Divisao(String nome, int lotacao, Zona zona, Cliente[] clientes, int numeroClientes) {
        this.nome = nome;
        this.lotacao = lotacao;
        this.zona = zona;
        this.clientes = new Cliente[this.lotacao];
        this.numeroClientes = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getNumeroClientes() {
        return numeroClientes;
    }

    public void setNumeroClientes(int numeroClientes) {
        this.numeroClientes = numeroClientes;
    }
    
    
    
    
}
