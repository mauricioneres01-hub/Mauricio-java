public class Main{
   public static void main (String[]args){
     Carro carro1 = new Carro();
     carro1.marca = "Fiat";
     carro1.modelo = "Uno";
     carro1.cor = "vermelho";
    
     carro1.ano = 2020;
     carro1.combustivel = "Flex";
     carro1.ligado = false;

     System.out.println ("Estado inicial: ");
     carro1.mostrarDados();

     System.out.println ("Acelerando...");
     carro1.acelerar();
     
     System.out.println("LIgando o carro");

     carro1.ligar();

     System.out.println ("Carro ligado!");
    
     carro1.buzinar();

    System.out.println ("Acelerando...");
     carro1.acelerar();
     carro1.acelerar();
     carro1.acelerar();
    
    System.out.println("Desligando o carro ...");

     carro1.mostrarDados();

      carro1.frear();
      carro1.frear();
      carro1.frear();

     carro1.desligar();
     
    System.out.println("carro desligado!");
     carro1.mostrarDados();
   }
   

}