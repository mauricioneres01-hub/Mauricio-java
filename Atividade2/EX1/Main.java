public class Main{
    public static void main (String[]args){
        System.out.println ("=== 1. CRIANDO O PRODUTO (OPERAÇÂO VALIDA)===");
        Produto P1 = new Produto ("Pilhas", 5.0, 10);

        System.out.println ("=== 2.TESTANDO ALTERAÇÃO DE PREÇO ===");
        System.out.println ("-> ALTERANDO O PREÇO PARA 6.0 (VÁLIDO)...");
        P1.alterarPreco(6.0);

        System.out.println ("-> TESTANTO ALTERAR O PREÇO PARA -5.0 (INVÁLIDO)");
        P1.alterarPreco(-5.0);

        System.out.println ("Novo Preço atual: R$ " + P1.getPreco());
        System.out.println ();



    }
}