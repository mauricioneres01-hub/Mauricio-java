import java.util.Scanner;
public class EX9 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int v1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int v2 = entrada.nextInt();

        System.out.println(v1 + " + " + v2 + " = " + (v1+v2));
        System.out.println(v1 + " - " + v2 + " = " + (v1-v2));
        System.out.println(v1 + " x " + v2 + " = " + (v1*v2));
        System.out.println(v1 + " / " + v2 + " = " + (v1/v2));
        System.out.println(v1 + " % " + v2 + " = " + (v1%v2));
        entrada.close();
    }
}