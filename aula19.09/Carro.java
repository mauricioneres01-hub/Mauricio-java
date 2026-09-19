public class Carro extends Veiculo {
    public Carro(String marca){
        super(marca);
    }

    @Override
    public void mover(){
        System.out.println("O carro está andando pela estrada.");
    }
}