package com.mycompany.exercicio02;
import java.util.Scanner;


public class Espontaneo {
   public static void main(String[]args){
       
       //NESSE CÓDIGO VAMOS ANALISAR O IMC
       
       Scanner input = new Scanner(System.in);
       
        double peso;
        double altura;
        
        System.out.println("Informe o peso: ");
       
                peso = input.nextDouble();
       
                    System.out.println("Agora informe a altura: ");
             
                     altura = input.nextDouble();
                     double finish = peso / (altura *altura);
                    
                        if(finish <= 18.5){
                            
                       System.out.printf(" Sua situação é de magreza, seu imc é: %.2f%n" , finish ); 
                        }
                        
                            else if (finish == 18.6 || finish <= 24.9) {
                                
                                System.out.printf(" Sua situação é normal, seu imc é: %.2f%n " , finish);
                            
                            }
                            else if( finish >= 29.9){
                                
                                System.out.printf(" Você está com sobrepeso I, seu imc é: %.2f%n" , finish);
                            }
                            else if(finish <= 39.9){
                                System.out.printf(" Você está com obesidade II, seu imc é: %.2f%n" , finish);
                            }
                            else{
                                System.out.printf(" Você está com obesidade grave, seu imc é: %.2f%n" , finish);
                            }
   }
}      
    

