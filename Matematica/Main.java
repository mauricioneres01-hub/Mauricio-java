package Matematica;

public class Main {
    public static void main(String[]args) {

        int opcao = -1;

        while(opcao != 0){

            opcao= Menu.Exibir();

            switch (opcao) {
                case 1:
                    Teoria.Iniciar();
                    break;
                
                case 2:
                    Conjuntos.Analisar();
                    break;

                case 3:
                    Intervalos.Iniciar();
                    break;


                case 0:
                    break;

                default:
                    System.out.println("Opcao invalida! Digite um numero de 0 a 3");
                    break;
            }
        }
    }
    
}
