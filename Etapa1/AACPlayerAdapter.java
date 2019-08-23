/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import problema1.AACPlayer;

/**
 *
 * @author Rubens
 */
public class AACPlayerAdapter implements FormatoAudio {
    AACPlayer aacplayer;

    @Override
    public void abrir(String nomeArquivo) {
        this.aacplayer = new AACPlayer(nomeArquivo);
        this.aacplayer.setLocation(0);
        this.aacplayer.open();
    }

    @Override
    public void reproduzir() {
        this.aacplayer.play();
    }

    @Override
    public void pausar() {
        this.aacplayer.stop();
    }

    @Override
    public void parar() {
        this.aacplayer.setLocation(0);
        this.aacplayer.stop();
    }

    @Override
    public void avancar(int qtdeSegundosAvancar) {
        this.aacplayer.setLocation(this.aacplayer.getLocation() + qtdeSegundosAvancar);
    }

    @Override
    public void retornar(int qtdeSegundosRetroceder) {
        this.aacplayer.setLocation(this.aacplayer.getLocation() - qtdeSegundosRetroceder);
    }

    @Override
    public void liberar() {
        this.aacplayer = null;
    }
    
    
}
