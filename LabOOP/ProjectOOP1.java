/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectoop1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ProjectOOP1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, total;
        int menu,exit;
        exit = 0;
        total = 0;
        while(exit!=1){
            System.out.println("Calculator");
            System.out.println("=================");
            System.out.println("Total :" + total);
            System.out.println("");
            if(total==0){
                System.out.printf("Input number : ");
                angka1 = input.nextDouble();
            }
            else angka1 = total;
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Clear Total");
            System.out.println("7. Exit");
            System.out.printf("Operator [1-7] : ");
            menu = input.nextInt();
            switch (menu){
                case 1 -> {
                    System.out.printf("Input number : ");
                    angka2 = input.nextDouble();
                    total = angka1 + angka2;
                    exit = 0;
                    break;
            }
                case 2 -> {
                    System.out.printf("Input number : ");
                    angka2 = input.nextDouble();
                    total = angka1 - angka2;
                    exit = 0;
                    break;
                }
                case 3 -> {
                    System.out.printf("Input number : ");
                    angka2 = input.nextDouble();
                    total = angka1 * angka2;
                    exit = 0;
                    break;
                }
                case 4 -> {
                    System.out.printf("Input number : ");
                    angka2 = input.nextDouble();
                    total = angka1 / angka2;
                    exit = 0;
                    break;
                }
                case 5 ->{
                    System.out.printf("Input number : ");
                    angka2 = input.nextDouble();
                    total = angka1 % angka2;
                    exit = 0;
                    break;
                }
                case 6 -> {
                    total = 0;
                    exit = 0;
                    break;
                }
                case 7 -> {
                    System.out.println("Thank You....");
                    exit = 1;
                    break;
                }
                default ->{
                    System.out.println("Input Error....");
                    exit = 0;
                    break;
                }
    }
         
    }

}
}
        
