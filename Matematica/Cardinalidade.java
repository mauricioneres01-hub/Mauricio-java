package Matematica;
import java.util.ArrayList;

public class Cardinalidade {
    public static void Calcular(ArrayList<Integer> conjuntoA, ArrayList<Integer> conjuntoB){
        int tamanhoA = conjuntoA.size();
        int tamanhoB = conjuntoB.size();

        System.out.println("A cardinalidade do Conjunto A e: "+ tamanhoA);
        System.out.println("A cardinalidade do conjunto B e: "+ tamanhoB);
    }
    
}
