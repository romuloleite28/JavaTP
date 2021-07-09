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
public class Cliente {

    private boolean hospede;
    private String zona;
    private int id;
    private String dataNascimento;
    private String genero;
    private String patologias;
    private int peso;
    private int altura;
    private int teste;

    public Cliente(int id, String dataNascimento, String genero, String patologias, int peso, int altura) {
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.patologias = patologias;
        this.peso = peso;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public String getPatologias() {
        return patologias;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPatologias(String patologias) {
        this.patologias = patologias;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
