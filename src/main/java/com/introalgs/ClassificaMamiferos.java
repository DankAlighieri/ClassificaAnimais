package com.introalgs;

import java.util.Scanner;

public class ClassificaMamiferos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continueCheck = 0;
        boolean wantsToEnd = false;
        while (wantsToEnd == false) {
            System.out.println("Aperte 1 p/ mamíferos\n 2 p/ aves \n 3 p/ répteis");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Aperte 1 p/ quadrupedes\n 2 p/ bipedes\n 3 p/ voadores\n 4 p/ aquaticos");
                    int op_1 = sc.nextInt();
                    switch (op_1) {
                        case 1:
                            System.out.println("Aperte 1 p/ carnivoros\n 2 p/ herbivoros");
                            int op_1_2 = sc.nextInt();
                            if (op_1_2 == 1) System.out.println("O animal eh Leao");
                            else if (op_1_2 == 2) System.out.println("O animal eh cavalo");
                            else System.out.println("Opcao invalida");
                            System.out.println("Quer ir de novo? Aperte 1, se nao, aperte 2\n");
                            continueCheck = sc.nextInt();
                            if (continueCheck == 1) wantsToEnd = false;
                            else wantsToEnd = true;
                            break;
                        case 2:
                            System.out.println("Aperte 1 p/ onivoros\n 2 p/ frutivoros");
                            op_1_2 = sc.nextInt();
                            if (op_1_2 == 1) System.out.println("O animal eh homem");
                            else if (op_1_2 == 2) System.out.println("O animal eh macaco");
                            else System.out.println("Opcao invalida");
                            System.out.println("Quer ir de novo? Aperte 1, se nao, aperte 2\n");
                            continueCheck = sc.nextInt();
                            if (continueCheck == 1) wantsToEnd = false;
                            else wantsToEnd = true;
                            break;
                        case 3:
                            System.out.println("O animal eh morcego.");
                            System.out.println("Quer ir de novo? Aperte 1, se nao, aperte 2\n");
                            continueCheck = sc.nextInt();
                            if (continueCheck == 1) wantsToEnd = false;
                            else wantsToEnd = true;
                            break;
                        case 4:
                            System.out.println("O animal eh baleia.");
                            System.out.println("Quer ir de novo? Aperte 1, se nao, aperte 2\n");
                            continueCheck = sc.nextInt();
                            if (continueCheck == 1) wantsToEnd = false;
                            else wantsToEnd = true;
                            break;
                        default:
                            System.out.println("Numero pressionado nao esta dentro dos limites. Por favor pressione um numero entre 1-4.");
                            wantsToEnd = true;
                            break;
                        }
                    break;
                case 2:
                    System.out.println("Aperte 1 p/ nao voadores\n 2 p/ nadadores\n 3 p/ de rapina");
                    int op_2 = sc.nextInt();
                    switch (op_2){
                        case 1:
                            System.out.println("Aperte 1 p/ tropicais\n 2 p/ polares");
                            int op_2_1 = sc.nextInt();
                            if (op_2_1 == 1) System.out.println("O animal eh avestruz");
                            else if (op_2_1 == 2) System.out.println("O animal eh pinguim");
                            else System.out.println("Opcao invalida");
                            System.out.println("Quer ir de novo? Aperte 1, se nao, aperte 2\n");
                            continueCheck = sc.nextInt();
                            if (continueCheck == 1) wantsToEnd = false;
                            else wantsToEnd = true;
                            break;
                        case 2:
                            System.out.println("O animal eh pato.");
                            System.out.println("Quer ir de novo? Aperte 1, se nao, aperte 2\n");
                            continueCheck = sc.nextInt();
                            if (continueCheck == 1) wantsToEnd = false;
                            else wantsToEnd = true;
                            break;
                        case 3:
                            System.out.println("O animal eh aguia.");
                            System.out.println("Quer ir de novo? Aperte 1, se nao, aperte 2\n");
                            continueCheck = sc.nextInt();
                            if (continueCheck == 1) wantsToEnd = false;
                            else wantsToEnd = true;
                            break;
                        default:
                            System.out.println("Numero pressionado nao esta dentro dos limites. Por favor pressione um numero entre 1-3.");
                            wantsToEnd = true;
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Aperte 1 p/ nao com casco\n 2 p/ carnivoro\n 3 p/ de sem patas");
                    int op_3 = sc.nextInt();
                    switch (op_3){
                        case 1:
                            System.out.println("O animal eh tartaruga.");
                            System.out.println("Quer ir de novo? Aperte 1, se nao, aperte 2\n");
                            continueCheck = sc.nextInt();
                            if (continueCheck == 1) wantsToEnd = false;
                            else wantsToEnd = true;
                            break;
                        case 2:
                            System.out.println("O animal eh crocodilo.");
                            System.out.println("Quer ir de novo? Aperte 1, se nao, aperte 2\n");
                            continueCheck = sc.nextInt();
                            if (continueCheck == 1) wantsToEnd = false;
                            else wantsToEnd = true;
                            break;
                        case 3:
                            System.out.println("O animal eh cobra.");
                            System.out.println("Quer ir de novo? Aperte 1, se nao, aperte 2\n");
                            continueCheck = sc.nextInt();
                            if (continueCheck == 1) wantsToEnd = false;
                            else wantsToEnd = true;
                            break;
                        default:
                            System.out.println("Numero pressionado nao esta dentro dos limites. Por favor pressione um numero entre 1-3.");
                            wantsToEnd = true;
                            break;
                    }
                    break;
                default:
                    System.out.println("Numero pressionado nao esta dentro dos limites. Por favor pressione um numero entre 1-3.");
                    wantsToEnd = true;
                    break;
            }
        }
        sc.close();
    }
}
