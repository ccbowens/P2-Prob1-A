/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhounidade2;

import trabalhounidade2.FormatoAudio;
import trabalhounidade2.wmaPlay;


/**
 *
 * @author TIEDT
 */
public class WmaPlayAdapter implements FormatoAudio {

    wmaPlay wma;
    
    @Override
    public void abrir(String nomeArquivo) {
        wma = new wmaPlay();
        wma.setFile(nomeArquivo);
        wma.abrir();
    }

    @Override
    public void reproduzir() {
        if (wma != null) {
            wma.reproduzir();
        }
    }

    @Override
    public void pausar() {
       if (wma != null) {
            wma.parar();
        } 
    }

    @Override
    public void parar() {
        if (wma != null) {
            wma.parar();
            wma.setLocation(0);
        }
    }

    @Override
    public void avancar(int qtdeSegundosAvancar) {
        if(wma != null){
            wma.setLocation(qtdeSegundosAvancar);
        }
    }

    @Override
    public void retornar(int qtdeSegundosRetroceder) {
      if(wma != null){
          wma.setLocation(qtdeSegundosRetroceder);
          wma.getLocation();
      }
    }

    @Override
    public void liberar() {
       if(wma != null){
           wma.setFile(null);
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
