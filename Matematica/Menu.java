package Matematica;
import java.util.Scanner;

public class Menu {

        public static int Exibir(){
            Scanner teclado = new Scanner(System.in);
            System.out.println("1 - Teoria dos Conjuntos");
            System.out.println("2 - Conjuntos Numericos");
            System.out.println("3 - intervalos reais");
            System.out.println("0 - Sair");
            return teclado.nextInt();
        } 
}

