package Matematica;
import java.util.ArrayList;

public class Uniao {
    public static void Calcular(ArrayList<Integer> conjuntoA, ArrayList<Integer> conjuntoB){

        ArrayList<Integer> AuB = new ArrayList<>();

        for (int i =0; i < conjuntoA.size(); i++){
            AuB.add(conjuntoA.get(i));
        }

        for (int i = 0; i < conjuntoB.size(); i++){
            int elementoB = conjuntoB.get(i);

            if (!AuB.contains(elementoB)){
                AuB.add(elementoB);
            }
        }

        System.out.println("A uniao dos conjuntos A e B e: " + AuB);
    }
    
}
