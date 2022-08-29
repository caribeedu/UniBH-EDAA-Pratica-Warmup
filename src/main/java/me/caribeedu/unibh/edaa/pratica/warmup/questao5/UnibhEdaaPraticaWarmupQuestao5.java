/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.caribeedu.unibh.edaa.pratica.warmup.questao5;

import java.util.Scanner;

/**
 *
 * @author Edu Caribé
 */
public class UnibhEdaaPraticaWarmupQuestao5 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        
        int[] numerosEscritaUnica = new int[5];
        boolean[] numerosEscritos = new boolean[5];
        
        int indiceNumeroAtual = 0;
        
        while(true) {
            System.out.println("Insira um valor para o " + (indiceNumeroAtual + 1) + "º número: ");
            var numeroInserido = input.nextInt();
            
            if (numerosEscritos[indiceNumeroAtual] != true) {
                numerosEscritaUnica[indiceNumeroAtual] = numeroInserido;
                numerosEscritos[indiceNumeroAtual] = true;
            }
            
            System.out.println("O valor atual do " + (indiceNumeroAtual + 1) + "º número é " + numerosEscritaUnica[indiceNumeroAtual] + ".");
            
            if (indiceNumeroAtual < 4)
                indiceNumeroAtual++;
            else
                indiceNumeroAtual = 0;
        }
    }
}
