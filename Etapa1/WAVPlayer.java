package trabalhounidade2;

/**
 *
 * @author patricka
 */
public class WAVPlayer {
    
    private String arquivoNome;
    private Estado arquivoEstado;
    private int arquivoPosicao;

    public WAVPlayer(String arquivo) {
        this.arquivoEstado = Estado.VAZIO;
        this.arquivoPosicao = 0;
        this.arquivoNome = arquivo;
    }

    public void reproduzir() {
        if (this.arquivoEstado == Estado.VAZIO) {
            System.out.println(this.getClass().getName() + " - Arquivo " + this.arquivoNome + " executando a partir da posição " + this.arquivoPosicao);
            this.arquivoEstado = Estado.REPRODUZINDO;
            this.arquivoPosicao += 1000;
        }
    }

    public void parar() {
        if (this.arquivoEstado == Estado.REPRODUZINDO) {
            System.out.println(this.getClass().getName() + " O arquivo foi pausado.");
            this.arquivoEstado = Estado.PAUSADO;
        }else
           System.out.println(this.getClass().getName() + " O arquivo não está sendo reproduzido!");
    }
   
    
    public int avancar(int valor) {
        if (valor > 0) {
            this.arquivoPosicao += valor;
        }
        return this.arquivoPosicao;
    }

    public int retomar(int valor) {
        if (valor > 0) {
            this.arquivoPosicao -= valor;
            if (this.arquivoPosicao < 0) {
                this.arquivoPosicao = 0;
            }
        }
        return this.arquivoPosicao;
    }
    
}
