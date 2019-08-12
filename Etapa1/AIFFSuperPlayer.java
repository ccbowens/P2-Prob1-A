/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhounidade2;

/**
 *
 * @author patricka
 */
public class AIFFSuperPlayer {
    private java.lang.String arquivoSetado;
    private trabalhounidade2.Estado arquivoEstado;
    private int arquivoPosicao;
    
    public AIFFSuperPlayer(String arquivo) {
        this.arquivoEstado = Estado.VAZIO;
        this.arquivoPosicao = 0;
        this.arquivoSetado = arquivo;
    }

    public void reproduzir() {
         if (this.arquivoEstado == Estado.VAZIO) {
            System.out.println(this.getClass().getName() + " - Arquivo " + this.arquivoSetado + " executando a partir da posição " + this.arquivoPosicao);
            this.arquivoEstado = Estado.REPRODUZINDO;
            this.arquivoPosicao += 1000;
        }
    }

    public int pausar() {
    if (this.arquivoEstado == Estado.REPRODUZINDO){
        this.arquivoEstado = Estado.PAUSADO;
        System.out.println("O arquivo foi pausado aos: " + this.arquivoPosicao + " milisegundos.");
    }
     return this.arquivoPosicao;
    }

    public void parar() {
      if (this.arquivoEstado == Estado.REPRODUZINDO) {
            System.out.println(this.getClass().getName() + " O arquivo foi pausado.");
            this.arquivoEstado = Estado.PAUSADO;
        }else
           System.out.println(this.getClass().getName() + " O arquivo não está sendo reproduzido!");
    }

    public void setCursor(int posicao) { 
    if(this.arquivoEstado ==  Estado.REPRODUZINDO || this.arquivoEstado ==  Estado.PAUSADO){
        this.arquivoPosicao = posicao;
         System.out.println("O tempo de execução do arquivo foi movido para " + this.arquivoPosicao + "milisegundos.");
  
    }
    }
   
    public void liberar() { 
    if (this.arquivoEstado == Estado.REPRODUZINDO){
        this.arquivoEstado = Estado.PARADO;
        System.out.println("O arquivo foi liberado da memória!");
        this.arquivoEstado = Estado.VAZIO;
        this.arquivoPosicao = 0;
        this.arquivoSetado = ""; 
    }else{
        this.arquivoEstado = Estado.PARADO;
        System.out.println("O arquivo foi liberado da memória!");
        this.arquivoEstado = Estado.VAZIO;
        this.arquivoPosicao = 0;
        this.arquivoSetado = ""; 
    }
    }
}
    

