/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.util.Scanner;
import javatp.JsonImportar;
import javatp.Registo;

/**
 *
 * @author phrea
 */
public class API {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Registo[] arrayRegistos = new Registo[]{};
        JsonImportar jsonimportar = new JsonImportar();
        arrayRegistos = jsonimportar.importarData(arrayRegistos, "/resources/leituras.json");
        Hotel hotel = new Hotel(arrayRegistos,); //meter array clientes

        Scanner sc = new Scanner(System.in);
        int escolha = 0;

        API menu = new API();

        menu.printHeader();
        menu.printMenu();

        escolha = sc.nextInt();

        int op = 0;

        switch (escolha) {

            case 1:
                menu.printMenuCliente();
                if (op == 1) {
                    System.out.println("Falta colocar os métodos");
                }
                if (op == 2) {
                    System.out.println("Falta colocar os métodos");
                }
                if (op == 3) {
                    System.out.println("Falta colocar os métodos");
                }
                break;

            case 2:
                menu.printMenuFunc();
                if (op == 1) {
                    System.out.println("Falta colocar os métodos");
                }
                if (op == 2) {
                    System.out.println("Falta colocar os métodos");
                }
                if (op == 3) {
                    System.out.println("Falta colocar os métodos");
                }
                break;

            case 3:
                menu.printMenuJson();
                if (op == 1) {
                    System.out.println("Falta colocar os métodos");
                }
                if (op == 2) {
                    System.out.println("Falta colocar os métodos");
                }
                break;

        }

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
        System.out.println("3 - Importar dados");
        System.out.println("4 - Exportar dados");

    }

    public void printMenuCliente() {
        System.out.println("------------------------");
        System.out.println("--- Área de cliente  --");
        System.out.println("------------------------");
        System.out.println("1 - Adicionar cliente");
        System.out.println("2 - Remover cliente");
        System.out.println("------------------------");
    }

    public void printMenuFunc() {
        System.out.println("------------------------");
        System.out.println("- Área de Funcionário --");
        System.out.println("------------------------");
        System.out.println("1 - Adicionar funcionário");
        System.out.println("2 - Remover funcionário");
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
