/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhounidade2;

/**
 *
 * @author rmtiedt
 */
 public class AIFFSuperPlayerAdapter implements FormatoAudio {

    AIFFSuperPlayer player;

    @Override
    public void abrir(String arquivo) {
        player = new AIFFSuperPlayer(arquivo);
    }

    @Override
    public void reproduzir() {
        if (player != null) {
            player.reproduzir();
        }
    }

    @Override
    public void pausar() {
        if (player != null) {
            player.pausar();
        }
    }

    @Override
    public void parar() {
        if (player != null) {
            player.parar();
            player.setCursor(0);
        }
    }

    @Override
    public void avancar(int quantidade) {
        if (player != null) {
            retornar(-quantidade);
        }
    }

    @Override
    public void retornar(int quantidade) {
        if (player != null) {
            int local = player.pausar() - quantidade;
            if (local > 0) {
                player.setCursor(local);
                player.reproduzir();
            }
        }
    }

    @Override
    public void liberar() {
        if (player != null) {
            player.liberar();
            player = null;
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

