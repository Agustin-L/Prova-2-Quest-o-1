package questao1; 

public class Auditoria implements Observador {

    @Override
    public void atualizar(String nomeProduto,
                          int quantidadeAnterior,
                          int novaQuantidade) {

        System.out.println(
            "[AUDITORIA] Alteracao registrada: "
            + nomeProduto + " | "
            + quantidadeAnterior + " -> "
            + novaQuantidade
        );
    }
}
