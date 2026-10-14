package Matematica;

import java.util.ArrayList;

public class ComplementoA {
    public static void Calcular(ArrayList<Integer> conjuntoA, ArrayList<Integer> conjuntoB) {
        
        
        ArrayList<Integer> universoU_Manual = new ArrayList<>();
        ArrayList<Integer> universoU_Nativo = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            universoU_Manual.add(i);
            universoU_Nativo.add(i);
        }
        
 
        ArrayList<Integer> resultadoManual = new ArrayList<>();
        
        for (int i = 0; i < universoU_Manual.size(); i++) {
            int elementoU = universoU_Manual.get(i);

            if (!conjuntoA.contains(elementoU)) {
                resultadoManual.add(elementoU);
            }
        }
        
        universoU_Nativo.removeAll(conjuntoA);
        
    
        System.out.println("\n--- OPERACAO: COMPLEMENTO DE A EM U (U: 1 a 10) ---");
        System.out.println("-> Resultado da Implementacao Manual: " + resultadoManual);
        System.out.println("-> Resultado da Solucao Nativa (.removeAll): " + universoU_Nativo);
        
    
        if (resultadoManual.equals(universoU_Nativo)) {
            System.out.println("STATUS: Validacao concluida com sucesso! Ambas as solucoes sao iguais.");
        } else {
            System.out.println("STATUS: Erro na validacao.");
        }
    }
}