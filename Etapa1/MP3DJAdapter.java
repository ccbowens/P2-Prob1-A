package trabalhounidade2;

import trabalhounidade2.FormatoAudio;
import trabalhounidade2.MP3DJ;

public class MP3DJAdapter implements FormatoAudio {

    private MP3DJ mp3 = new MP3DJ();
    
    @Override
    public void abrir(String nome) {
        mp3.setFile(nome);
    }

    @Override
    public void reproduzir() {
        mp3.reproduzir();
    }

    @Override
    public void pausar() {
        mp3.parar();
    }

    @Override
    public void parar() {
        mp3.parar();
        mp3.retomar(10000);
    }

    @Override
    public void avancar(int tempo) {
        mp3.avancar(tempo);
    }

    @Override
    public void retornar(int tempo) {
        mp3.retomar(tempo);
    }

    @Override
    public void liberar() {
        //Não possuí
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