package questao1; 

public class Compras implements Observador {

    @Override
    public void atualizar(String nomeProduto,
                          int quantidadeAnterior,
                          int novaQuantidade) {

        if (novaQuantidade < 5) {
            System.out.println(
                "[COMPRAS] ALERTA: " + nomeProduto
                + " possui estoque baixo: "
                + novaQuantidade + " unidades!"
            );
        }
    }
}
