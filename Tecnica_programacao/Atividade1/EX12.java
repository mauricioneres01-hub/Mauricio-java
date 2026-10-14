import java.util.Scanner;
public class EX11{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("informe a temperatura em °C = ");
        float c = entrada.nextFloat();

        System.out.println("temperatura em F = " +((c*9)/5+32));
        entrada.close();
    }
}