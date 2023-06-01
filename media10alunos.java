
package com.mycompany.exercicio02;
import java.util.Scanner;

public class exercicio03 {
public static void main(String[] args){
          
  Scanner input = new Scanner(System.in);
 
  double notaFinal=0;
  
  for(int contador = 1; contador<11; contador++){
  
      System.out.println("INFORME A NOTA:" + contador);
      
     double nota = input.nextDouble();
     
    notaFinal += nota/10; 
 
  }

  System.out.println("A média dos alunos é de: " +  notaFinal );
}
}



