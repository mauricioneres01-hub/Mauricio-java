package Matematica;

import java.util.Scanner;

public class Intervalos {
    
    public static void Iniciar() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\n=== MINI-PROJETO: INTERVALOS REAIS ===");
        
        // 1. Entrada de dados do Primeiro Intervalo (A)
        System.out.println("Defina o Intervalo A:");
        System.out.print("Digite o inicio de A: ");
        double inicioA = teclado.nextDouble();
        System.out.print("Digite o fim de A: ");
        double fimA = teclado.nextDouble();
        
        // 2. Entrada de dados do Segundo Intervalo (B)
        System.out.println("\nDefina o Intervalo B:");
        System.out.print("Digite o inicio de B: ");
        double inicioB = teclado.nextDouble();
        System.out.print("Digite o fim de B: ");
        double fimB = teclado.nextDouble();
        
        System.out.println("\nIntervalos configurados: A = [" + inicioA + ", " + fimA + "] e B = [" + inicioB + ", " + fimB + "]");
        
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- Operacoes com Intervalos ---");
            System.out.println("1 - Uniao (A U B)");
            System.out.println("2 - Intersecao (A n B)");
            System.out.println("3 - Pertinencia (Verificar se um numero esta em A ou B)");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha uma operacao: ");
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    calcularUniao(inicioA, fimA, inicioB, fimB);
                    break;
                case 2:
                    calcularIntersecao(inicioA, fimA, inicioB, fimB);
                    break;
                case 3:
                    System.out.print("Digite o numero real que deseja testar: ");
                    double numeroTestado = teclado.nextDouble();
                    verificarPertinencia(inicioA, fimA, inicioB, fimB, numeroTestado);
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }
    
    private static void calcularUniao(double iA, double fA, double iB, double fB) {
        if (fA < iB || fB < iA) {
            if (iA < iB) {
                System.out.println("Resultado da Uniao: [" + iA + ", " + fA + "] U [" + iB + ", " + fB + "]");
            } else {
                System.out.println("Resultado da Uniao: [" + iB + ", " + fB + "] U [" + iA + ", " + fA + "]");
            }
        } else {
            double uniInicio = Math.min(iA, iB);
            double uniFim = Math.max(fA, fB);
            System.out.println("Resultado da Uniao: [" + uniInicio + ", " + uniFim + "]");
        }
    }
    
    private static void calcularIntersecao(double iA, double fA, double iB, double fB) {
        double interInicio = Math.max(iA, iB);
        double interFim = Math.min(fA, fB);
        
        if (interInicio <= interFim) {
            System.out.println("Resultado da Intersecao: [" + interInicio + ", " + interFim + "]");
        } else {
            System.out.println("Resultado da Intersecao: [ ] (Intersecao Vazia!)");
        }
    }
    
    private static void verificarPertinencia(double iA, double fA, double iB, double fB, double numeroTestado) {
        boolean pertenceA = (numeroTestado >= iA && numeroTestado <= fA);
        boolean pertenceB = (numeroTestado >= iB && numeroTestado <= fB);
        
        if (pertenceA) {
            System.out.println("O numero " + numeroTestado + " PERTENCE ao Intervalo A.");
        } else {
            System.out.println("O numero " + numeroTestado + " NAO pertence ao Intervalo A.");
        }
        
        if (pertenceB) {
            System.out.println("O numero " + numeroTestado + " PERTENCE ao Intervalo B.");
        } else {
            System.out.println("O numero " + numeroTestado + " NAO pertence ao Intervalo B.");
        }
    }
}
