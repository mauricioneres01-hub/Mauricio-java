public class Moto extends Veiculo{
    public Moto (String marca){
        super(marca);
    }

    @Override

    public void mover(){
        System.out.println("A moto está andando sobre duas rodas.");
    }
}