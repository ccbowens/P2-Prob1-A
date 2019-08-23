/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back;

import problema1.wmaPlay;


/**
 *
 * @author TIEDT
 */
public class WmaPlayAdapter implements FormatoAudio {

    wmaPlay wma;
    
    @Override
    public void abrir(String nomeArquivo) {
        wma.setFile(nomeArquivo);
        if (wma != null) {
            wma.setLocation(0);
            wma.open();
        }
    }

    @Override
    public void reproduzir() {
        if (wma != null) {
              
            wma.play();
        }
    }

    @Override
    public void pausar() {
       if (wma != null) {
            wma.stop();
        } 
    }

    @Override
    public void parar() {
        if (wma != null) {
            wma.stop();
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

}
