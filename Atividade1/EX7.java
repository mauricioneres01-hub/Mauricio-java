public class EX7 {
    public static void main (String[]args){
        int A=10, B=20, C=0;
        System.out.println("Valor de A="+A+" Valor de B="+B);
        C=A;
        A=B;
        B=C;
        System.out.println("Valor de A="+A+" Valor de B="+B);
    }
}