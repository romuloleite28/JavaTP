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
public abstract class Cliente {

    private int id;
    private String nome;
    private String data_nascimento;
    private String patologias[];
    private int peso;
    private int altura;
    public static final int MAX_CLIENTES = 100;
    private Cliente[] clientes;
    private int numeroClientes;

    public Cliente(String nome, String data_nascimento, String[] patologias,int id, int peso, int altura) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.patologias = patologias;
        this.peso = peso;
        this.altura = altura;
        this.clientes = new Cliente[Cliente.MAX_CLIENTES];
        this.numeroClientes = 0;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean adicionarCliente(Cliente cliente) {
        if (this.numeroClientes > Cliente.MAX_CLIENTES) {
            System.out.println("Atingiu o limite máximo de clientes");
        }

        this.clientes[numeroClientes++] = cliente;
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String[] getPatologias() {
        return patologias;
    }

    public void setPatologias(String[] patologias) {
        this.patologias = patologias;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().equals(this.getClass())) {

            Cliente p = (Cliente) obj;

            return this.nome.equals(p.getNome()) && this.data_nascimento.equals(p.getData_nascimento());
        }
        return false;
    }

}
