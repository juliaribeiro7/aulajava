/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulajava;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Aulajava {

    public static void main(String[] args) {
        //Entrada de Dados //
        try ( //Leitura //
                Scanner scanner = new Scanner(System.in)) {
            //Entrada de Dados //
            
            int valor;
            int pdesconto;
            int vdesconto;
            int pjuros;
            int vjuros;
            
            //Entrada de dados manual//
            System.out.println("****WINKS!!****");// Nome da loja//
            System.out.println("Digite o valor da compra:"); // Mostrar na tela//
            valor = scanner.nextInt();// Fazer a leitura do valor//
            System.out.println("Digite a porcentagem de desconto:");
            pdesconto =scanner.nextInt(); // Fazer a leitura do desconto
            System.out.println("Digite a porcentagem de juros:");
            pjuros =scanner.nextInt(); // Fazer a leitura do desconto
            
            
            //Processamento//
            
            vdesconto = valor *(pdesconto/100); // Calculo de desconto//
            vjuros = valor *(pjuros/100); // Calculo de juros//
            
            
            // Saída //
            System.out.println ("Compra com desconto: "+ vdesconto);
            System.out.println("Compra com juros " +vjuros);
        }

    }
}
