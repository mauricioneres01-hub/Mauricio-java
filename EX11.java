import java.util.Scanner;
public class EX11{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("digita o valor da base: ");
        float b = entrada.nextFloat();

        System.out.print("digite o valor da altura: ");
        float h = entrada.nextFloat();

        System.out.println("Valor da área do triângulo = " + ((b*h)/2));
        entrada.close();
    }
}