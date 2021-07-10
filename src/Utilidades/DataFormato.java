/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

/**
 *
 * @author Romulo Leite
 */
public class DataFormato {

    int dia, mes, ano;

    public DataFormato(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }



    @Override
    public String toString() {

        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
