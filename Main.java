package questao1; 

public class Main {

    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        produto.adicionarObservador(compras);
        produto.adicionarObservador(vendas);
        produto.adicionarObservador(auditoria);

        System.out.println("===== MONITOR DE ESTOQUE =====");

        produto.alterarQuantidade(8);
        produto.alterarQuantidade(3);
        produto.alterarQuantidade(0);

        // Nao deve gerar notificacao
        produto.alterarQuantidade(0);

        // Vendas deve avisar que voltou a ter estoque
        produto.alterarQuantidade(7);

        System.out.println("\n===== REMOVENDO COMPRAS =====");

        produto.removerObservador(compras);

        // Compras nao recebera mais notificacoes
        produto.alterarQuantidade(2);
        produto.alterarQuantidade(10);

        System.out.println("\n===== FIM DO PROGRAMA =====");
    }
}
