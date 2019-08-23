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
public class PlayerFacade {
   
     private final TipoDeFormatoAudio tipoFormatoAudio;
    private FormatoAudio formatoAudio;

    public PlayerFacade(TipoDeFormatoAudio formatoAudio) {
        this.tipoFormatoAudio = formatoAudio;
    }

    public void reproduzirSimples(String nome) {
        formatoAudio = FormatoAudioFactory.getPlayer(tipoFormatoAudio);
        formatoAudio.abrir(nome);
        formatoAudio.reproduzir();
    }

    public void pararSimples() {
        formatoAudio.parar();
        formatoAudio.liberar();
    }

}
