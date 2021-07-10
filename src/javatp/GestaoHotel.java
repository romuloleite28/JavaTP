/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp;

/**
 *
 * @author Asus
 */
public class GestaoHotel implements Hotel{
    
    private int max_registers;
    private int num_registers;
    private Registo[] registos;
    
    public GestaoHotel(){
        this.registos = new Registo[this.max_registers];
    }
    
    
    
    
    
}
