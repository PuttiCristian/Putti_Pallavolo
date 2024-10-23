/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pallavolo;

/**
 *
 * @author B045_11
 */
public class Giocatore implements Runnable {
    public int idGiocatore;
    public int numeroPassaggi;
    
    public Giocatore(int idGiocatore) {
        this.idGiocatore=idGiocatore;
        numeroPassaggi= 0;
    }
    
    public void run() {
        while(true) {
            System.out.println("id Giocatore: " + idGiocatore + " numero passaggi: " + numeroPassaggi);
            numeroPassaggi++;
            Thread.currentThread().yield();
        }
    }
    
}
