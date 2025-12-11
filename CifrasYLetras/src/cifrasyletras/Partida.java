package cifrasyletras;

import java.util.Random;

public class Partida {

    Menu men = new Menu();
    Random ran = new Random();
    bolsaNum borsa = new bolsaNum();
    LT lt = new LT();
    private int num_rand;
    private char operacio;
    private int operando_1;
    private int operando_2;

    public void inicio_Ronda() {
        int rondas;
        MyString nom;
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("***************************************************");
        System.out.println("*            JUGAR CONTRA EL ORDENADOR            *");
        System.out.println("***************************************************");
        System.out.print("Introduce tu nombre de jugador: ");
        nom = new MyString(lt.llegirLiniaC());

        System.out.println("Nombre del segundo jugador: CPU");
        System.out.println("\n\n");
        System.out.print("Introduce cuantas rondas quieres jugar: ");
        rondas = lt.llegirSencer();

        System.out.println("\n\n");

        for (int i = 0; i < rondas; i++) {
            num_rand = ran.nextInt(1000);
            System.out.println("Ronda " + i + " de " + rondas);
            System.out.println("\n\n\n\n");
            System.out.println("------------------------------------------------");
            System.out.println("Turno de " + nom);
            System.out.println("------------------------------------------------");
            System.out.println("\n\n\n\n\n");
            men.menu_rondas_numeros();
            System.out.println("Numeros disponibles: ");
            System.out.println("*                                                 *");
            System.out.println("Objetivo: " + num_rand);
            System.out.println("*                                                 *");
            System.out.println("***************************************************");

            while (true) {
                System.out.print("Operacion 1 (+|-|*|/|=): ");
                operacio = lt.llegirCaracter();
                if (comprobar_operacion(operacio)) {
                    break;
                }
                System.err.println("Solo operaciones!!");
            }

            System.out.print("Operando 1 (): ");
            operando_1 = lt.llegirSencer();
            System.out.print("Operando 2 (): ");
            operando_2 = lt.llegirSencer();
            System.out.println("\n");
            resultado_numeros(operacio, operando_1, operando_2);
            System.out.println("");
        }
    }

    public boolean comprobar_operacion(char op) {
        return ((op == '+') || (op == '-') || (op == '*') || (op == '/') || (op == '='));
    }

    public boolean comprobar_operando_1(char op) {
        return false;
    }

    public boolean comprobar_operando_2(char op) {
        return false;
    }

    public void resultado_numeros(char operacio, int op1, int op2) {
        int resultado;
        switch (operacio) {
            case '+' -> {
                resultado = op1 + op2;
                System.out.println("Operacion realizada: " + op1 + " + " + op2 + " = " + resultado);
                break;
            }
            case '-' -> {
                resultado = op1 - op2;
                System.out.println("Operacion realizada: " + op1 + " - " + op2 + " = " + resultado);
                break;
            }
            case '*' -> {
                resultado = op1 * op2;
                System.out.println("Operacion realizada: " + op1 + " * " + op2 + " = " + resultado);
                break;
            }
            case '/' -> {
                if (op2 != 0) {
                    resultado = op1 / op2;
                    System.out.println("Operacion realizada: " + op1 + " / " + op2 + " = " + resultado);
                } else {
                    System.err.println("Error: Division por 0.");
                }
                break;
            }
            case '=' -> {
                System.out.println("Operacion realizada: " + op1 + " = " + op2 + " : " + op1);
                break;
            }
        }
    }

    public void bolsa(int n) {
        MyString let;
        let = new MyString("cifres.txt".toCharArray());
        borsa.poner(n);
    }
}
