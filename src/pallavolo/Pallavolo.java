/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pallavolo;

/**
 *
 * @author Putti Cristian
 */
public class Pallavolo {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Giocatore g1 = new Giocatore(0); // non è un thread
        Giocatore g2 = new Giocatore(1);
        
        Thread t1 = new Thread(g1,"Cristian"); // è un thread
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t2 = new Thread(g2,"Tommaso");
        t2.start();
        System.out.println("id giocatore: " + t1.getId() + " priorità: " + t1.getPriority() + " nome: " + t1.getName());
        System.out.println("id giocatore: " + t2.getId() + " priorità: " + t2.getPriority() + " nome: " + t2.getName());

        
    }
    
}
