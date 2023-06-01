/* QUESTÃO 04 - FAÇA UM ALGORITMO QUE LEIA 10 VALORES E ESCREVA PRIMEIRAMENTE TODOS OS NÚMEROS
PARES DIGITADOS E DEPOIS OS IMPARES.
*/
package com.mycompany.exercicio02;
import java.util.Scanner;
public class Questão04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] valor = new int [10];
        
        System.out.println("Informe DEZ números: ");
        
        for(int i = 0 ; i <valor.length ; i++){
            
           valor[i] = input.nextInt();
           
        }
        System.out.println("LISTANDO NÚMEROS PARES");
        for (int i = 0; i <valor.length ; i++){
           
            if (valor[i] % 2 == 0){
                
                System.out.println(valor[i]);
            }
        }
        System.out.println("LISTNADO VALORES IMPARES");
        for (int i = 0; i <valor.length ; i++){
            
            if (valor[i] % 2 != 0){
                  System.out.println(valor [i]); 
            }
             
        }
        
}
}
