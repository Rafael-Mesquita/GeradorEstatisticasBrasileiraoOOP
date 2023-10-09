package br.edu.univas.estatisticas;

import br.edu.univas.interfaces.Estatistica;
import br.edu.univas.models.Jogo;

public class GolsChute implements Estatistica {

    @Override
    public String imprimir(Jogo jogo) {
        return
                "Total de gols no jogo: " + (jogo.getGolsTimeMandante() + jogo.getGolsTimeVisitante())  + System.lineSeparator() +
                        "O time mandante fez " + jogo.getGolsTimeMandante() + " gols" + System.lineSeparator() +
                        "O time visitante fez " + jogo.getGolsTimeVisitante() + " gols" + System.lineSeparator() +
                        "O time mandante chutou " + jogo.getChutesAGolTimeMandante() + " vezes no gol" + System.lineSeparator() +
                        "O time visitante chutou " + jogo.getChutesAGolTimeVisitante() + " vezes no gol" + System.lineSeparator();
    }

}