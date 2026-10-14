package Matematica;
import java.util.ArrayList;

public class Intersecao {
    public static void Calcular(ArrayList<Integer> conjuntoA, ArrayList<Integer> conjuntoB){
        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < conjuntoA.size(); i++){

            int elementoA = conjuntoA.get(i);

            if(conjuntoB.contains(elementoA)){
                resultado.add(elementoA);
            }
        }

        System.out.println("A intersecao dos conjuntos A e B e: " + resultado);
    }
}
