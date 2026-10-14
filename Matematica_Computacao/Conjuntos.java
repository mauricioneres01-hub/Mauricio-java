package Matematica;
import java.util.Scanner;

public class Conjuntos {

    public static void Analisar(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero para analise");
        String entrada = teclado.next();

        if (entrada.toLowerCase().contains("r")) {
            String numeroTexto = entrada.toLowerCase().replace("r", "");
            int numero = Integer.parseInt(numeroTexto);
            double raiz = Math.sqrt(numero);
    
            if (raiz == (int)raiz) {
            int resultadoRaiz = (int)raiz;
            System.out.println("Pertence a: N, Z, Q, R");
            System.out.println("Justificativa:");
            System.out.println("- N: E um numero inteiro nao-negativo.");
            System.out.println("- Z: E um numero inteiro completo.");
            System.out.println("- Q: Pode ser escrito como fracao (" + resultadoRaiz + "/1).");
            System.out.println("- R: Todo numero racional e real.");
            System.out.println("Observacao: A raiz e exata e vale " + resultadoRaiz);
            } else {
                System.out.println("Pertence a: I, R");
                System.out.println("Justificativa:");
                System.out.println("- I: Raiz nao exata, gerando um decimal infinito e nao-periodico.");
                System.out.println("- R: Todo numero irracional e real.");
                System.out.println("Observacao: Raiz nao exata, portanto irracional.");
            }
        }

        else if (entrada.contains("(") && entrada.contains(")")) {
            if (entrada.equals("0,(9)")) {
                System.out.println("Pertence a: N, Z, Q, R");
                System.out.println("Justificativa: Matematicamente, 0,999... equivale exatamente a 1.");
                System.out.println("Observacao: Caso curioso: a geratriz e 9/9 = 1.");
            }else {
               System.out.println("Pertence a: Q, R");
               System.out.println("Justificativa:");
               System.out.println("- Q: E uma dizima periodica, logo possui uma fracao geratriz.");
               System.out.println("- R: Todo numero racional e real.");
        
               int posicaoVirgula = entrada.indexOf(",");
               int posicaoParenteses = entrada.indexOf("(");
        
               if (posicaoParenteses == posicaoVirgula + 1) {
                   System.out.println("Observacao: Tipo: dizima periodica simples.");
                } else {
                    System.out.println("Observacao: Tipo: dizima periodica composta.");
                }
            }
        }

        else if (entrada.contains("/")) {
            String[] partes = entrada.split("/");
            int cima = Integer.parseInt(partes[0]);
            int baixo = Integer.parseInt(partes[1]);
            double resultado = (double) cima / baixo;
    
            if (cima % baixo == 0) {
                int resultadoInteiro = (int)resultado;
                if (resultadoInteiro >= 0) {
                    System.out.println("Pertence a: N, Z, Q, R");
                    System.out.println("Justificativa: A fracao resulta em um inteiro positivo.");
                }else {
                    System.out.println("Pertence a: Z, Q, R");
                    System.out.println("Justificativa: A fracao resulta in um inteiro negativo.");
                }
                System.out.println("Observacao: A fracao simplifica para " + resultadoInteiro);
            } else {
                System.out.println("Pertence a: Q, R");
                System.out.println("Justificativa:");
                System.out.println("- Q: E uma razao entre dois numeros inteiros (decimal exato).");
                System.out.println("- R: Todo numero racional e real.");
                System.out.println("Observacao: Fracao equivalente ao decimal " + resultado);
            }
        }

        else {
            int numero = Integer.parseInt(entrada);
    
            if (numero > 0) {
            System.out.println("Pertence a: N, Z, Q, R");
            System.out.println("Justificativa: E um numero inteiro maior que zero.");
            System.out.println("Observacao: Numero natural.");
            } else if (numero == 0) {
                System.out.println("Pertence a: N, Z, Q, R");
                System.out.println("Justificativa: E o numero zero.");
                System.out.println("Observacao: Definam no README se N inclui o zero.");
            } else {
                System.out.println("Pertence a: Z, Q, R");
                System.out.println("Justificativa: E um numero negativo sem parte decimal.");
                System.out.println("Observacao: Inteiro negativo, nao e natural.");
            }
        }

    }
    
}
