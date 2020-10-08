/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;
        
import java.util.Scanner;

/**
 *
 * @author gentil
 */
public class Calculadora {
    public static void main(String[] args) {
        // preparação de variaveis
        
        int n1, n2,total;
        
        // criaçao e instancia de um projeto
        
        Scanner entrada = new Scanner(System.in); 

        //Apresentação
        
        System.out.println("\n\t\t\t-- calculadora--\n");
        
        System.out.println("soma simples");

        //Entrada
        
        System.out.print("\tinforme N1: ");
        n1 = entrada.nextInt ();
        System.out.print("\tinforme N2: ");
        n2 = entrada.nextInt ();
        
        //Processamento
        
        total = n1 + n2;
        
        //Saída
        
        System.out.println("\n\t\t" + n1 + " + " + n2+"=" + total);
        
         //Entrada de subtraçao
        System.out.print("\tinforme N1: ");
        n1 = entrada.nextInt ();
        System.out.print("\tinforme N2: ");
        n2 = entrada.nextInt ();
        
        //Processamento
        
        total = n1 - n2;
        
        //Saída
        System.out.println("\n\t\t" + n1 + " - " + n2+"=" + total);
        
         //Entrada de divisao
         
        System.out.print("\tinforme N1: ");
        n1 = entrada.nextInt ();
        System.out.print("\tinforme N2: ");
        n2 = entrada.nextInt ();
        
        //Processamento
        
        total = n1 / n2;
        
        //Saída
        
        System.out.println("\n\t\t" + n1 + " / " + n2+"=" + total);
        
         //Entrada de multiplicaçao
         
        System.out.print("\tinforme N1: ");
        n1 = entrada.nextInt ();
        System.out.print("\tinforme N2: ");
        n2 = entrada.nextInt ();
        
        //Processamento
        
        total = n1 * n2;
        
        //Saída
        
        System.out.println("\n\t\t" + n1 + " * " + n2+"=" + total);
        
         
    }
    
}
