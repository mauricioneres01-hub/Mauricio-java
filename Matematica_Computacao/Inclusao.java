package Matematica;
import java.util.ArrayList;

public class Inclusao {
    public static void Calcular(ArrayList<Integer> conjuntoA, ArrayList<Integer> conjuntoB){

        boolean estaContido = true;

        for (int i = 0; i < conjuntoA.size(); i++){
            int elementoA = conjuntoA.get(i);

            if(!conjuntoB.contains(elementoA)){
                estaContido = false;
                break;
            }   
        }

        if(estaContido){
            System.out.println("O conjunto A esta contido no conjunto B (a C= B).");
        }else{
            System.out.println("O conjunto A nao esta contido no conjunto B.");
        }
    }

    
}
