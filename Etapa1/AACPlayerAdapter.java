/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhounidade2;
import trabalhounidade2.AACPlayer;
/**
 *
 * @author rmtiedt
 */
public class AACPlayerAdapter implements FormatoAudio {
    AACPlayer aacplayer;

    @Override
    public void abrir(String nomeArquivo) {
        this.aacplayer = new AACPlayer(nomeArquivo);
        this.aacplayer.setLocation(0);
        this.aacplayer.abrir();
    }

    @Override
    public void reproduzir() {
        this.aacplayer.reproduzir();
    }

    @Override
    public void pausar() {
        this.aacplayer.parar();
    }

    @Override
    public void parar() {
        this.aacplayer.setLocation(0);
        this.aacplayer.parar();
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
