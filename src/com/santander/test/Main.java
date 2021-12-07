package com.santander.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanMes = new Scanner(System.in);
        int mes = scanMes.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            // if (mes == 12 || mes == 13 || mes == 14, aqui estou extrapolando só para mostrar que dá para colocar mais de uma condição no seu case)
            case 12: case 13: case 14:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido. Por favor, digite um mês entre 1 e 12");
                break;
        }
    }
}
