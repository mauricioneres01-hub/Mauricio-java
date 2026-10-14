package Matematica;
import java.util.ArrayList;

public class Diferenca {
    public static void Calcular(ArrayList<Integer> conjuntoA, ArrayList<Integer> conjuntoB){
        ArrayList<Integer> subtracaoAmenosB = new ArrayList<>();
        ArrayList<Integer> subtracaoBmenosA = new ArrayList<>();

        for (int i = 0; i < conjuntoA.size(); i++){

            int elementoA = conjuntoA.get(i);

            if(!conjuntoB.contains(elementoA)){
                subtracaoAmenosB.add(elementoA);
            }
    }

        for (int i = 0; i < conjuntoB.size(); i++){

            int elementoB = conjuntoB.get(i);

            if(!conjuntoA.contains(elementoB)){
                subtracaoBmenosA.add(elementoB);
            }
    }   
    
        System.out.println("A diferenca (A - B) e: " + subtracaoAmenosB);
        System.out.println("A diferenca (B - A) e: " + subtracaoBmenosA);   
    }
}    
