package questao1; 

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int quantidade;
    private List<Observador> observadores;

    public Produto(String nome, int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException(
                "Estoque nao pode ser negativo."
            );
        }

        this.nome = nome;
        this.quantidade = quantidade;
        this.observadores = new ArrayList<>();
    }

    public void adicionarObservador(Observador observador) {
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) {
            System.out.println("Quantidade invalida!");
            return;
        }

        if (quantidade == novaQuantidade) {
            System.out.println("\nEstoque sem alteracao.");
            return;
        }

        int quantidadeAnterior = quantidade;
        quantidade = novaQuantidade;

        System.out.println("\nProduto: " + nome);
        System.out.println("Estoque anterior: " + quantidadeAnterior);
        System.out.println("Novo estoque: " + quantidade);

        for (Observador observador : observadores) {
            observador.atualizar(
                nome, quantidadeAnterior, quantidade
            );
        }
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
