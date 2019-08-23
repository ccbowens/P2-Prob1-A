package trabalhounidade2;

import trabalhounidade2.WAVPlayerAdapter;

public class FormatoAudioFactory {

    public static FormatoAudio getPlayer(TipoDeFormatoAudio tipo) {
        switch (tipo) {
            case WAVPlayer:
                return new WAVPlayerAdapter();
            case WMAPlayer:
                return new WmaPlayAdapter();
            case AIFFSuperPlayer:
                return new AIFFSuperPlayerAdapter();
            case AACPlayer:
                return new AACPlayerAdapter();
            case MP3DJ:
                return new MP3DJAdapter();
        }
        return null;
    }
}
