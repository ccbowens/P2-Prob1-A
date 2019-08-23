/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhounidade2;

import trabalhounidade2.FormatoAudio;
import trabalhounidade2.AIFFSuperPlayer;

/**
 *
 * @author TIEDT
 */
public abstract class AIFFAdapter implements FormatoAudio {

    AIFFSuperPlayer aif;

    @Override
    public void abrir(String nomeArquivo) {
     this.aif = new AIFFSuperPlayer(nomeArquivo);
     aif.setCursor(0);
    }

    @Override
    public void reproduzir() {
        if (aif != null) {
            this.aif.reproduzir();
        }
    }

    @Override
    public void pausar() {
        if (aif != null) {
            int tempo =  this.aif.pausar();
            aif.setCursor(tempo);
        }
    }

    @Override
    public void parar() {
        if (this.aif != null) {
            this.aif.parar();
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
          this.aif.liberar();
        }
    }

}
