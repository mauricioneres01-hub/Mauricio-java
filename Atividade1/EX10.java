import java.util.Scanner;
public class EX10{
    public static void main (String[]args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1= entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2= entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3= entrada.nextDouble();

        System.out.println("Nota final = (" + n1 + " + " + n2 + " + " + n3 + ") / 3 = " + ((n1+n2+n3)/3));

        entrada.close();
    }
}