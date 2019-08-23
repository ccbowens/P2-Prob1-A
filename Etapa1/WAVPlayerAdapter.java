/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import java.util.logging.Level;
import java.util.logging.Logger;
import problema1.WAVPlayer;

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
            wav.play();
        }
    }

    @Override
    public void pausar() {
        if (wav != null) {
            wav.stop();
        }
    }

    @Override
    public void parar() {
        if (wav != null) {
            wav.stop();
        }
    }

    @Override
    public void avancar(int qtdeSegundosAvancar) {
        if (wav != null) {
            wav.forward(qtdeSegundosAvancar);
            wav.play();
        }
    }

    @Override
    public void retornar(int qtdeSegundosRetroceder) {
        if (wav != null) {
            wav.reward(qtdeSegundosRetroceder);
            wav.play();
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
}
