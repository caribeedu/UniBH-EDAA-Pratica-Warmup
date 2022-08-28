/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.caribeedu.unibh.edaa.pratica.warmup.questao3;

import java.text.DecimalFormat;

/**
 *
 * @author Edu Caribé
 */
public class UnibhEdaaPraticaWarmupQuestao3 {
    private static final DecimalFormat decimalFormatter = new DecimalFormat("0.00");
    
    public static void main(String[] args) {
        var modelosCarros = buscarModelos();
        var consumoCarros = buscarConsumoKM();
        
        System.out.println("Modelos de Carro vs. KM por Litro de Gasolina");
        
        for(int i=0; i<5; i++) {
            var carro = modelosCarros[i];
            var kmLitro = consumoCarros[i];
            
            System.out.println(carro + " - " + kmLitro + "Km/L");
        }
                
        System.out.println();
        
        avaliarConsumoModelosCarros(modelosCarros, consumoCarros);
    }
    
    private static String[] buscarModelos() {
        return new String[] {"Gol", "Fusca", "Polo", "Punto", "Celta"};
    }
    
    private static double[] buscarConsumoKM() {
        return new double[] {12.7, 14.5, 11.4, 13.6, 13.9};
    }
    
    private static void avaliarConsumoModelosCarros(String[] carros, double[] consumos) {
        double menorQuantidadeLitrosGasta = Integer.MAX_VALUE;
        String modeloMaisEconomico = null;
        
        System.out.println("Modelos de Carro vs. Quantidade de Litros Gastos por 1000Km");
        
        for(int i=0; i<5; i++) {
            var carro = carros[i];
            var kmLitro = consumos[i];
            
            double consumoMilKm = 1000 / kmLitro;
            
            System.out.println(carro + " - " + decimalFormatter.format(consumoMilKm) + " litros");
            
            if (consumoMilKm < menorQuantidadeLitrosGasta) {
                menorQuantidadeLitrosGasta = consumoMilKm;
                modeloMaisEconomico = carro;
            }
        }
        
        System.out.println();
        
        System.out.println("Modelo Mais Econômico");
        System.out.println("O modelo de carro mais econômico é o " + modeloMaisEconomico + ".");
    }
}
