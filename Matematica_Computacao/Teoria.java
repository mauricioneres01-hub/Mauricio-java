package Matematica;
import java.util.ArrayList;
import java.util.Scanner;

public class Teoria {

    public static void Iniciar(){

        ArrayList<Integer> conjuntoA = new ArrayList<>();
        ArrayList<Integer> conjuntoB = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite os elementos do conjunto A");
        int qtda = teclado.nextInt();

        for (int i = 0; i < qtda; i++){

            int elemento = teclado.nextInt();
            if(!conjuntoA.contains(elemento)){
                conjuntoA.add(elemento);
            }
        }
       
        System.out.println("Digite os elementos do conjunto B");
        int qtdb = teclado.nextInt();

        for (int i = 0; i < qtdb; i++){

            int elemento = teclado.nextInt();

            if(!conjuntoB.contains(elemento)){
                conjuntoB.add(elemento);
            }
        }

        int opcaoTeoria = -1;

        while (opcaoTeoria != 0){
            
            System.out.println("\n ===Menu teoria dos conjuntos===");
            System.out.println("1 - Uniao");
            System.out.println("2 - Intersecao");
            System.out.println("3 - Diferenca");
            System.out.println("4 - diferenca simetrica");
            System.out.println("5 - Pertinencia");
            System.out.println("6 - Inclusao");
            System.out.println("7 - Cardinalidade");
            System.out.println("8 - Complemento de A em relacao ao conjunto universo U");
            System.out.println("0 - Voltar ao menu principal");
            System.out.println("Escolha uma opcao:");
            opcaoTeoria = teclado.nextInt();

            switch (opcaoTeoria) {
                case 1:
                    Uniao.Calcular(conjuntoA, conjuntoB);
                    break;

                case 2:
                    Intersecao.Calcular(conjuntoA, conjuntoB);    
                    break;

                case 3:
                    Diferenca.Calcular(conjuntoA, conjuntoB);
                    break;
                
                case 4:
                    Simetrica.Calcular(conjuntoA, conjuntoB);
                    break;
                    
                case 5:
                    Pertinencia.Calcular(conjuntoA, conjuntoB);
                    break;
                    
                case 6:
                    Inclusao.Calcular(conjuntoA, conjuntoB);
                    break;
                    
                case 7:
                    Cardinalidade.Calcular(conjuntoA, conjuntoB);
                    break;
                    
                case 8:
                    ComplementoA.Calcular(conjuntoA, conjuntoB);
                    break;

                case 0:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("Opcao invalida! Digite um valor de 0 a 8");
                    break;    
            }
        }
    }
    
}
