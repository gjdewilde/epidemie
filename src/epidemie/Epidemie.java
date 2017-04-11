/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epidemie;

/**
 *
 * @author wilger
 */
public class Epidemie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Wereld wereld = new Wereld();   
        int a;
        wereld.spreadVirus(10);
        for (int i=0;i<20;i++){
            //System.out.println("Turn : "+i);
            a=wereld.print();
            wereld.runTurn(4);
        }
        
        a=wereld.print();
        System.out.println("KLAAR");

        
        
        
        
    }
}
