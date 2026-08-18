import java.util.Scanner;
public class EX13{
    public static void main (String[]args){
        int h, m, s;
        Scanner entrada = new Scanner (System.in);

        System.out.print("informe o total de segundos a ser convertido = ");
        int t = entrada.nextInt();
           
        h=t/3600;
        m=(t%3600)/60;
        s=(t%3600)%60;

        System.out.println(+ t + " segundos  =" + h + "horas | " + m + "minutos | " + s + " segundos" );
        entrada.close();
    }
}