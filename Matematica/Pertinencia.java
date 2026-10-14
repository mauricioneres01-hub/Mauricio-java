package Matematica;
import java.util.ArrayList;
import java.util.Scanner;

public class Pertinencia {
    public static void Calcular(ArrayList<Integer> conjuntoA, ArrayList<Integer> conjuntoB){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o numero que deseja verificar a pertinencia: ");
        int numeroBusca = teclado.nextInt();
        
        boolean encontrouEma = false;
        boolean encontrouEmb = false;

        for(int i = 0; i < conjuntoA.size(); i++){
            if(conjuntoA.get(i) == numeroBusca){
                encontrouEma = true;
            }

        }

        for(int i = 0; i < conjuntoB.size(); i++){
            if(conjuntoB.get(i) == numeroBusca){
                encontrouEmb = true;
            }
        }

        if(encontrouEma){
           System.out.println(numeroBusca + " Pertence ao conjunto A"); 
        }else{
            System.out.println(numeroBusca + " Nao pertence ao conjunto A");
        }
        
        if(encontrouEmb){
           System.out.println(numeroBusca + " Pertence ao conjunto B"); 
        }else{
            System.out.println(numeroBusca + " Nao pertence ao conjunto B");
        }
      
    }
    
}
