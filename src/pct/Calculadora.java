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
        
        int op;
        
        // criaçao e instancia de um projeto
        
        Scanner entrada = new Scanner(System.in); 

        //Apresentação
        
        System.out.println("\n\t\t\t-- calculadora--\n");
        
        //menu
        System.out.println("[1]. soma");
        System.out.println("[2]. subtração");
        System.out.println("[3]. divisão");
        System.out.println("[4]. multiplicação");
        System.out.println("[5]. saida");
        
        //obter a opção escolhida pelo usuario
        System.out.println("\n\t opção: ");
        op = entrada.nextByte();
        
        if (op == 1){
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
         } else if(op == 2){
            System.out.println("subtração");
        
         } else if (op == 3){
             System.out.println("divisão");
             
         } else if (op == 4){
             System.out.println("multiplicação");
        
         } else if (op == 5){
             System.out.println("opção" + op + " Incorreta");
         }
        
        
        
    }
    
}
