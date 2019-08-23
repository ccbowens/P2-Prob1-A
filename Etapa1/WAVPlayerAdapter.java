/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhounidade2;

import trabalhounidade2.FormatoAudio;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabalhounidade2.WAVPlayer;

/**
 *
 * @author TIEDT
 */
public class WAVPlayerAdapter implements FormatoAudio {

    WAVPlayer wav;
    private int tempo;

    @Override
    public void abrir(String nomeArquivo) {
        wav = new WAVPlayer(nomeArquivo);
    }

    @Override
    public void reproduzir() {
        if (wav != null) {
            wav.reproduzir();
        }
    }

    @Override
    public void pausar() {
        if (wav != null) {
            wav.parar();
        }
    }

    @Override
    public void parar() {
        if (wav != null) {
            wav.parar();
        }
    }

    @Override
    public void avancar(int qtdeSegundosAvancar) {
        if (wav != null) {
            wav.avancar(qtdeSegundosAvancar);
            wav.reproduzir();
        }
    }

    @Override
    public void retornar(int qtdeSegundosRetroceder) {
        if (wav != null) {
            wav.avancar(qtdeSegundosRetroceder);
            wav.reproduzir();
        }
    }

    @Override
    public void liberar() {
        try {
            finalize();
        } catch (Throwable ex) {
            Logger.getLogger(WAVPlayerAdapter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void reproduzirSimples(String nome) {
        this.abrir(nome);
        this.reproduzir();
    }

    @Override
    public void pausarSimples() {
        this.parar();
    }
}
