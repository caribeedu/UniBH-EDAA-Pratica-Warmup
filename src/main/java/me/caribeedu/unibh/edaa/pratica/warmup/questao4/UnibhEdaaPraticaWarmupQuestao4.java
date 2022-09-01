/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.caribeedu.unibh.edaa.pratica.warmup.questao4;

import java.util.Scanner;

/**
 *
 * @author Edu Caribé
 */
public class UnibhEdaaPraticaWarmupQuestao4 {
    public static void main(String[] args) {
        System.out.println("Roubo Banco HSVC");
        
        var valoresSuspeitos = obterValoresSuspeitos();
        var valorAssaltanteConfesso = obterValorAssaltanteConfessado();
                
        var assaltantes = avaliarSuspeitos(valoresSuspeitos, valorAssaltanteConfesso);
        int valorTotalRoubado = 0;
        
        for(int i=0; i<assaltantes.length; i++) {
            int indiceAssaltante = assaltantes[i];
            
            System.out.println("O suspeito de nº " + (indiceAssaltante + 1) + " é um dos assaltantes.");
            
            valorTotalRoubado += valoresSuspeitos[indiceAssaltante];
        }
        
        System.out.println();
        System.out.print("Ao todo os assaltantes roubaram R$" + valorTotalRoubado + ",00.");
    }
    
    private static int[] obterValoresSuspeitos() {
        final Scanner input = new Scanner(System.in);
        
        var valores = new int[10];
        int suspeitosContabilizados = 0;
        
        while(suspeitosContabilizados < 10) {
            int suspeitoNumero = suspeitosContabilizados + 1;
            
            System.out.print("Insira o valor contido pelo suspeito nº " + suspeitoNumero + ": ");
            int valorContido = input.nextInt();
            
            if (valorContido < 0) {
                System.out.println();
                System.out.print("Favor inserir um valor válido. Tente novamente.");
                continue;
            }
            
            valores[suspeitosContabilizados] = valorContido;
            suspeitosContabilizados++;
            
            System.out.println("O suspeito de nº " + suspeitosContabilizados + " continha R$" + valorContido + ",00.");
        }
        
        return valores;
    }
    
    private static int obterValorAssaltanteConfessado() {
        System.out.println();
        
        final Scanner input = new Scanner(System.in);
        int valorConfessado = 0;
        
        while(valorConfessado == 0) {
            System.out.print("Insira o valor contido pelo assaltante confessado: ");
            int valorContido = input.nextInt();

            if (valorContido <= 0 || valorContido % 10 != 0) {
                System.out.println();
                System.out.print("Favor inserir um valor válido. Os assaltantes continham apenas notas de 10.");
                continue;
            }
            
            System.out.println();
            valorConfessado = valorContido;
        }
        
        return valorConfessado;
    }    
    
    private static int[] avaliarSuspeitos(int[] valoresSuspeitos, int valorAssaltanteConfesso) {
        var indicesSuspeitosQueSaoAssaltantes = new int[0];
        
        for(int i=0; i<valoresSuspeitos.length; i++) {
            var valorContido = valoresSuspeitos[i];
            
            if (valorContido % 10 != 0 || valorContido < valorAssaltanteConfesso)
                continue;
            
            indicesSuspeitosQueSaoAssaltantes = adicionarAssaltante(indicesSuspeitosQueSaoAssaltantes, i);
        }
        
        return indicesSuspeitosQueSaoAssaltantes;
    }
    
    private static int[] adicionarAssaltante(int[] indicesAssaltantes, int indiceNovoAssaltante) {
        int novoTamanhoArray = indicesAssaltantes.length + 1;
        var indicesAssaltantesAtualizado = new int[novoTamanhoArray];
        
        for(int i=0; i<indicesAssaltantes.length; i++)
            indicesAssaltantesAtualizado[i] = indicesAssaltantes[i];
        
        indicesAssaltantesAtualizado[novoTamanhoArray - 1] = indiceNovoAssaltante;
        
        return indicesAssaltantesAtualizado;
    }
}
