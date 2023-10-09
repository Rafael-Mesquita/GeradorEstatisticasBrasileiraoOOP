package br.edu.univas;

import br.edu.univas.estatisticas.FaltasCartoes;
import br.edu.univas.estatisticas.GolsChute;
import br.edu.univas.estatisticas.TempoJogo;
import br.edu.univas.models.Jogo;
import br.edu.univas.services.GerenciadorEstatisticas;

public class StartApp {

    public static void main(String[] args) {
        Jogo jogo = new Jogo(2, 4, 21, 30, 10, 22, 18, 20, 70, 96, 32, 1, 0, 24, 1, 1);
        GerenciadorEstatisticas faltasCartoes = new GerenciadorEstatisticas(new FaltasCartoes());
        GerenciadorEstatisticas golsChute = new GerenciadorEstatisticas(new GolsChute());
        GerenciadorEstatisticas tempoJogo = new GerenciadorEstatisticas(new TempoJogo());

        tempoJogo.imprimir(jogo);
        golsChute.imprimir(jogo);
        faltasCartoes.imprimir(jogo);

    }
}
