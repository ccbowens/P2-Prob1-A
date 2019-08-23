/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import problema1.MP3DJ;
/**
 *
 * @author Rubens
 */
public class MP3DJAdapter implements FormatoAudio{
    MP3DJ mp3dj;
    private String nomeArquivo;

    @Override
    public void abrir(String nomeArquivo) {
        this.mp3dj.setFile(nomeArquivo);
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void reproduzir() {
        this.mp3dj.play();
    }

    @Override
    public void pausar() {
        this.mp3dj.stop();
    }

    @Override
    public void parar() {
        this.mp3dj.setFile(nomeArquivo);
    }

    @Override
    public void avancar(int qtdeSegundosAvancar) {
        this.mp3dj.forward(qtdeSegundosAvancar);
        
    }

    @Override
    public void retornar(int qtdeSegundosRetroceder) {
        this.mp3dj.reward(qtdeSegundosRetroceder);
    }

    @Override
    public void liberar() {
        this.mp3dj = null;
    }
    
    
}
