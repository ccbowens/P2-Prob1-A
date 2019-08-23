/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import problema1.AIFFSuperPlayer;

/**
 *
 * @author TIEDT
 */
public class AIFFAdapter implements FormatoAudio {

    AIFFSuperPlayer aif;

    @Override
    public void abrir(String nomeArquivo) {
     this.aif = new AIFFSuperPlayer(nomeArquivo);
     aif.setCursor(0);
    }

    @Override
    public void reproduzir() {
        if (aif != null) {
            this.aif.play();
        }
    }

    @Override
    public void pausar() {
        if (aif != null) {
            int tempo =  this.aif.pause();
            aif.setCursor(tempo);
        }
    }

    @Override
    public void parar() {
        if (this.aif != null) {
            this.aif.stop();
            aif.setCursor(0);
        }
    }

    @Override
    public void avancar(int qtdeSegundosAvancar) {
        if (this.aif != null) {
            this.aif.setCursor(qtdeSegundosAvancar);
        }
    }

    @Override
    public void retornar(int qtdeSegundosRetroceder) {
        if (this.aif != null) {
            this.aif.setCursor(qtdeSegundosRetroceder);
        }
    }

    @Override
    public void liberar() {
        if (this.aif != null) {
          this.aif.release();
        }
    }

}
