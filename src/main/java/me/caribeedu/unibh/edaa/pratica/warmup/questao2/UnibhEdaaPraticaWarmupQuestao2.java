/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.caribeedu.unibh.edaa.pratica.warmup.questao2;
import java.util.Random;

/**
 *
 * @author Edu Caribé
 */
public class UnibhEdaaPraticaWarmupQuestao2 {
    public static void main(String[] args) {
        var numerosAleatorios = gerarNumeros();
        
        System.out.println();
        System.out.println();
        
        avaliarNumeros(numerosAleatorios);
    }
    
    private static int[] gerarNumeros() {
        final int numeroMaximo = 1000;
        var randomGenerator = new Random();
        var numerosAleatorios = new int[10];
        
        System.out.println("Todos os números");
        System.out.print("|");
        
        for(int i=0; i<10; i++) {
            // O uso deste limitador é apenas para simplificar os cálculos do algoritmo, mas o algoritmo poderia ser utilizado sem limitador 
            var novoNumero = randomGenerator.nextInt(numeroMaximo);
            
            numerosAleatorios[i] = novoNumero;            
            
            System.out.print(novoNumero);
            System.out.print("|");
        }
        
        return numerosAleatorios;
    }
    
    private static boolean numeroPrimo(int numero) {
        if (numero <= 1)
            return false;
        
        for(int d=2; d<numero; d++) {
            if (numero % d == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    private static void avaliarNumeros(int[] numeros) {
        System.out.println("Avaliação de Números");
        
        for(int i=0; i<10; i++) {
            var numero = numeros[i];
            
            if (numeroPrimo(numero))
                System.out.println("O número " + numero + " na posição " + i + " é primo.");
            else
                System.out.println("O número " + numero + " na posição " + i + " NÃO é primo.");
        }
    }
}
