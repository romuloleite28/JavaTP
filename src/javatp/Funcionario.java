/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp;

/**
 *
 * @author phrea
 */
public class Funcionario {
        
    private Cliente funcionario;
    private String cargo;

    public Cliente getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Cliente funcionario) {
        this.funcionario = funcionario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(Cliente funcionario, String cargo) {
        this.funcionario = funcionario;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "funcionario=" + funcionario + ", cargo=" + cargo + '}';
    }
    
}
