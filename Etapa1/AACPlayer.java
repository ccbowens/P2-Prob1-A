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
public class AACPlayer {
    
    private String arquivoSetado;
    private Estado arquivoEstado;
    private int arquivoPosicao;

   public AACPlayer(String nomeArquivo) {
        this.arquivoEstado = Estado.VAZIO;
        this.arquivoPosicao = 0;
        this.arquivoSetado = nomeArquivo;
    }
    
        public void setLocation(int i){
   if (i > 0){
       this.arquivoPosicao = i;
       this.arquivoEstado = Estado.PARADO;
       } else
       this.arquivoEstado = Estado.PARADO;
       this.arquivoPosicao = 0;
    }
    
    public int getLocation(){
    return this.arquivoPosicao;    
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
            this.setLocation(0);
            System.out.println("O tempo de reprodução voltou ao início.");
        }
    }
    
     public void abrir() {
        if (this.arquivoEstado == Estado.SETADO) {
            this.arquivoEstado = Estado.ABERTO;
        }
    }
    
}
