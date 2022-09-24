/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jktvanswer;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kostj
 */
public class JKTVAnswer {

    public static void main(String[] args) {
        int answer = 0;
        Random numGen = new Random();
        Scanner inputS = new Scanner(System.in);
        int num1 = numGen.nextInt(10);
        int num2 = numGen.nextInt(10);
        
        while(answer != 5){
            System.out.print(num1+"*"+num2+"=");
            int input= inputS.nextInt();
            if (input == num1 * num2) {
                System.out.print("Правильно. ");
            }
            else{
                System.out.println("Неправильно. Попробуй заного.");
            }
                System.out.print("Завершено");
                break;
    }
    }
}
