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
public class API {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        API menu = new API();
        menu.printHeader();
        menu.printMenu();

    }

    public void printHeader() {
        System.out.println("+----------------------+");
        System.out.println("|   Seja bem-vindo/a   |");
        System.out.println("|     à nossa API      |");
        System.out.println("+----------------------+");
    }

    public void printMenu() {
        System.out.println("\n");
        System.out.println("------------------------");
        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Cliente");
        System.out.println("2 - Funcionário");
        System.out.println("3 - Ler ficheiros .json");
        System.out.println("4 - Exportação relatórios");
    }

    public void printMenuCliente() {
        System.out.println("------------------------");
        System.out.println("--- Área de cliente  --");
        System.out.println("------------------------");
        System.out.println("1 - Adicionar cliente");
        System.out.println("2 - Editar cliente");
        System.out.println("3 - Alterar posição do cliente");
        System.out.println("------------------------");
    }

    public void printMenuFunc() {
        System.out.println("------------------------");
        System.out.println("- Área de Funcionário --");
        System.out.println("------------------------");
        System.out.println("1 - Adicionar funcionário");
        System.out.println("2 - Editar funcionário");
        System.out.println("3 - Alterar posição do funcionário");
        System.out.println("------------------------");
    }

    public void printMenuJson() {
        System.out.println("------------------------");
        System.out.println("--- Ficheiros .json ----");
        System.out.println("------------------------");
        System.out.println("1 - Leituras.json");
        System.out.println("2 - Divisoes.json");
        System.out.println("------------------------");
    }

}
