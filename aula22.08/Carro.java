public class Carro{
    String marca;
    String cor;
    String modelo;
    int velocidade;
    int ano;
    String combustivel;
    boolean ligado;

void ligar(){
    ligado = true;
}

 void desligar(){
    ligado = false;
    }
       

 void buzinar(){
    System.out.println ("Biiiiip!");
 }

void acelerar () {
    if (ligado == true){
    velocidade = velocidade + 10;
    }
    else {
        System.out.println ("Carro desligado, não é possivel acelear");
    }
}


void frear () {
    velocidade = velocidade - 10;
}


void mostrarDados (){
     System.out.println ("Marca: " + marca);
     System.out.println ("Cor:" + cor);
     System.out.println ("Modelo: " + modelo);
     System.out.println ("Velocidade: " + velocidade);
     System.out.println ("Ano: " + ano);
     System.out.println ("Combustível: " + combustivel);
     System.out.println ("Ligado: " + ligado);
}
    
}