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
import trabalhounidade2.FormatoAudio;
import trabalhounidade2.TipoDeFormatoAudio;
import trabalhounidade2.FormatoAudioFactory;

public class Main {
    public static void main(String[] args) {
        testar(TipoDeFormatoAudio.WMAPlayer);
        testar(TipoDeFormatoAudio.AIFFSuperPlayer);
        testar(TipoDeFormatoAudio.WAVPlayer);
        testar(TipoDeFormatoAudio.MP3DJ);
        testar(TipoDeFormatoAudio.AACPlayer);
    }
    static void testar(TipoDeFormatoAudio tipoAudio) {
        FormatoAudio audio = FormatoAudioFactory.getPlayer(tipoAudio);
        System.out.println("Teste Completo");
        audio.abrir("AACPlayer");
        audio.reproduzir();
        audio.avancar(10);
        audio.retornar(10);
        audio.pausar();
        audio.reproduzir();
        audio.parar();
        System.out.println("Teste simplificado");
        PlayerFacade facade = new PlayerFacade(tipoAudio);
        facade.reproduzirSimples("Audio");
        facade.pararSimples();
        
    }
}
