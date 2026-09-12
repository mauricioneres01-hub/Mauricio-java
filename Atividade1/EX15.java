import java.util.Scanner;
public class EX15{
    public static void main (String[]args){
        int c;
        Scanner entrada = new Scanner (System.in);

        System.out.print("Informe a distância (Km) percorrida = ");
        int d = entrada.nextInt();

        System.out.print("Informe o combustível (L) consumido = ");
        int l = entrada.nextInt();

        c = d/l;

        System.out.println("Consumo = " + c + " Km/l");
        entrada.close();
    }
}