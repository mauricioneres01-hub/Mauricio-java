public class Main{
    public static void main(String[] args){
        Veiculo veiculo1 = new Carro("Fiat");
        Veiculo veiculo2 = new Moto("Honda");

        System.out.println(veiculo1.getMarca());
        veiculo1.mover();
        
        System.out.println(veiculo2.getMarca());
        veiculo2.mover();
    }
}