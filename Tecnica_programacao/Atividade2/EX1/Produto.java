public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


public Produto (String nome, double preco, int quantidade){
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}

public String getNome(){
    return nome;
}

public double getPreco(){
    return preco;
}

public int getQuantidade(){
    return quantidade;
}

public void alterarPreco(double novoPreco){
    if (novoPreco >= 0){
        this.preco = novoPreco;
    } else {
        System.out.println ("Erro: o preço não pode ser negativo");
    }
}

public void adicionarEstoque (int quantidade){
    if (quantidade >= 0){
        this.quantidade += quantidade;
    } else {
        System.out.println ("Erro: a quantidade adicionada deve ser positiva");
    }
}

public void retirarEstoque (int quantidade){
    if (quantidade > 0 && quantidade <= this.quantidade){
        this.quantidade -= quantidade;
    } else {
        System.out.println ("Erro: quantidade invalida ou insuficiente");
    }
}

public double calcularValorEstoque (){
    return this.preco * this.quantidade;
}

public void mostrarDados (){
    Sytem.out.println ("Nome: " + nome);
    System.out.println ("Preço:" + preco);
    System.out.println ("Quantidade em estoque: " + quantidade);
    System.out.println ("Valor total em estoque:" + calcularValorEstoque);
}
}