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
public class Cliente extends Registo {

    public Cliente(int id, String nome, String dataNascimento, char genero, String patologias, int peso, int altura, String cargo) {
        super(id, nome, dataNascimento, genero, patologias, peso, altura, cargo);
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
