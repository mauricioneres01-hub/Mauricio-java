import java.util.Scanner;
public class EX14 {
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        
        float troco;

        System.out.print("Informe o valor do produto = ");
        float preco = entrada.nextFloat();

        System.out.print("Informe o valor pago = ");
        float pago = entrada.nextFloat();

        troco = pago - preco;

        if (pago<preco)
        System.out.println("valor insuficiente, falta R$" + troco);

        if (pago>preco)
        System.out.println("Devolver troco R$" + troco);
        
        if (pago == preco)
        System.out.println("Produto pago, sem necessidade de troco");

        entrada.close();
    }
}