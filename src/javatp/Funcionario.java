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
public class Funcionario {

    private int id;
    private String nome;
    private String data_nascimento;
    private String patologias[];
    private int peso;
    private int altura;
    public static final int MAX_FUNCIONARIO = 100;
    private Funcionario[] funcionarios;
    private int numeroFuncionarios;
    private String cargo;

    public Funcionario(String nome, String data_nascimento, String[] patologias,int id, int peso, int altura, Funcionario[] funcionarios, int numeroFuncionarios, String cargo) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.patologias = patologias;
        this.peso = peso;
        this.altura = altura;
        this.funcionarios = funcionarios;
        this.numeroFuncionarios = numeroFuncionarios;
        this.cargo = cargo;
        this.funcionarios = new Funcionario[Funcionario.MAX_FUNCIONARIO];
        this.numeroFuncionarios = 0;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFunncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    

}
