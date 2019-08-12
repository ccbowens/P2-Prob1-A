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
public interface FormatoAudio {

    public static void main(String[] args){
        // código...
    }
    
    void abrir(String nome);
    void reproduzir();
    void pausar();
    void parar();
    void avancar(int tempo);
    void retornar(int tempo);
    void liberar();
    void reproduzirSimples(String nome);
    void pausarSimples();
    
    
}
