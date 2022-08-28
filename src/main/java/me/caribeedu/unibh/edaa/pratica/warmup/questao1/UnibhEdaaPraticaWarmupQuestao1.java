/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package me.caribeedu.unibh.edaa.pratica.warmup.questao1;

/**
 *
 * @author Edu Caribé
 */
public class UnibhEdaaPraticaWarmupQuestao1 {
    public static void main(String[] args) {
        var tabuada = new int[10][10];
        
        preencherTabuada(tabuada);
        printTabuada(tabuada);
    }
    
    private static void preencherTabuada(int[][] tabuada) {
        for(int posicaoX=0; posicaoX < 10; posicaoX++) {
            int valorX = posicaoX + 1;
            
            for(int posicaoY=0; posicaoY < 10; posicaoY++) {
                int valorY = posicaoY + 1;
                
                tabuada[posicaoX][posicaoY] = valorX + valorY;
            }
        }
    }
    
    private static void printTabuada(int[][] tabuada) {
        for(int posicaoY=0; posicaoY < 10; posicaoY++) {
            System.out.print("|");
            
            for(int posicaoX=0; posicaoX < 10; posicaoX++) {
                int valorElemento = tabuada[posicaoX][posicaoY];
                
                 // Esta condicional foi adicionada apenas para uma melhor visualização dos dados de saída
                if (valorElemento < 10)
                    System.out.print("0" + tabuada[posicaoX][posicaoY]);
                else
                    System.out.print(tabuada[posicaoX][posicaoY]);
                
                System.out.print("|");
            }
            
            System.out.println();
        }
    }
}
