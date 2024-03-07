package com.mycompany.condicaoternaria;

import java.util.Scanner;

public class CondicaoTernaria {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite um valor para receber o desconto");
        
        double preco = teclado.nextDouble();
        double desconto; 
        
      /*if(preco < 20.0){
            desconto = preco * 0.1;
        }else{
            desconto = preco * 0.05;
        }
        System.out.println("R$" + desconto + " de Desconto");
       */
       
        desconto = (preco < 20.0) ? (0.1) : (0.05); /* (1º{0.1}Verdadeiro = Se sim /// 2º{0.05}Falso = se não) */
       
        System.out.println("R$" + desconto + " de Desconto");
    }
}
