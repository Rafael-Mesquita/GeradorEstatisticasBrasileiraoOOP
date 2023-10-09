package br.edu.univas.services;

import br.edu.univas.interfaces.Estatistica;
import br.edu.univas.models.Jogo;

public class GerenciadorEstatisticas {

    private Estatistica estatistica;

    public GerenciadorEstatisticas(Estatistica estatistica) {
        this.estatistica = estatistica;
    }

    public void imprimir(Jogo jogo) {
        System.out.println(estatistica.imprimir(jogo));
    }

}
