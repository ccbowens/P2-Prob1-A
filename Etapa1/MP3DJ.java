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
public class MP3DJ {
    
    private String arquivoSetado;
    private Estado arquivoEstado;
    private int arquivoPosicao;
    
    public void setFile(String s){
    this.arquivoSetado = s;
    this.arquivoEstado = Estado.SETADO;
    }
    
     public void reproduzir(){
        if (this.arquivoEstado == Estado.PAUSADO || this.arquivoEstado == Estado.SETADO || this.arquivoEstado == Estado.PARADO ){
        this.arquivoEstado = Estado.REPRODUZINDO;
        System.out.println("O arquivo " + this.arquivoSetado.toString() + " foi executado a partir dos " + this.arquivoPosicao + " milisegundos.");
        }
    }
    
    public void parar(){
    
        if(this.arquivoEstado == Estado.REPRODUZINDO){
            this.arquivoEstado = Estado.PAUSADO;
           System.out.println("O arquivo foi pausado aos " + this.arquivoPosicao + " milisegundos.");
        }else{
            
            this.arquivoEstado = Estado.PAUSADO;
            System.out.println("O tempo de reprodução voltou ao início.");
        }
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
