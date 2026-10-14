package Matematica;
import java.util.ArrayList;

public class Simetrica {
    public static void Calcular(ArrayList<Integer> conjuntoA, ArrayList<Integer> conjuntoB){

        ArrayList<Integer> subtracao = new ArrayList<>();

        for (int i = 0; i < conjuntoA.size(); i++){

            int elementoA = conjuntoA.get(i);

            if(!conjuntoB.contains(elementoA)){
                subtracao.add(elementoA);
            }
    }

        for (int i = 0; i < conjuntoB.size(); i++){

            int elementoB = conjuntoB.get(i);

            if(!conjuntoA.contains(elementoB)){
                subtracao.add(elementoB);
            }
    }   
    
        System.out.println("A diferenca Simetrica e: " + subtracao);
    }
    
}
