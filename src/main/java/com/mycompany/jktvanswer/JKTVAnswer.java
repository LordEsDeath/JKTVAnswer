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
        int correct = 0;
        
        while(answer != 5){
            
            System.out.print(num1+"*"+num2+"=");
            int input= inputS.nextInt();
            ++answer;
            if (input == num1 * num2) {
                System.out.println("Правильно. ");
                ++correct;
                
            }else{
                 System.out.println("Неправильно. ");
                 

            }
        }if(answer == 5 ){
                System.out.println("У тебя "+ correct+ " Баллов");
                if(correct == 5){
                System.out.println("Оценка 5" );
                }if(correct == 4){
                System.out.println("Оценка 4" );
                }if(correct == 3){
                System.out.println("Оценка 3" );
                }if(correct < 2){
                    System.out.println("Оценка 2. Учи математику!!!" );
                }
                
                System.out.print("Завершено");
                
        }else{
            System.out.print("Произашёл баг");
        }
    }
        
}
    
    


