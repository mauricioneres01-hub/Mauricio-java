public class Main{
    public static void main(String []args){
Carro carro =  new Carro ("Fiat", "Uno", 4);
Moto moto = new Moto ("Honda","CG 160", 160);

carro.ligar();
carro.acelerar();
carro.abrirPortaMalas ();

moto.ligar();
moto.acelerar();
moto.empinar();
    }

}
