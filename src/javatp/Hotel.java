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
public class Hotel {

    private Cliente[] clientes;
    private Registo[] registos;
    static Zona[] zonas;

    public Hotel(Cliente[] clientes, Registo[] registos, Zona[] zonas) {
        this.clientes = clientes;
        this.registos = registos;
        this.zonas = zonas;
    }

}
