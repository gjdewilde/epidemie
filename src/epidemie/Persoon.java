/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package epidemie;

import java.util.Random;

/**
 *
 * @author wilger
 */
public class Persoon {
    
    
    int status;
    int resistentiecounter;
    public String Statuss;

    //status 0: S ; 1:I ; 2:R
    
    public Persoon(int percVaccinated){
        // bij de aanmaak van de persoon wordt ook gelijk de resistentie bepaald. 
        Random randomGenerator = new Random();
        int randomGetal  = randomGenerator.nextInt(99);
        if (randomGetal > (100-percVaccinated)){
            status = 2;
        } else {
            status = 0;
        }
        resistentiecounter = 0;
        
        
    }

    
    public void setStatus(int statusGetal){
        status = statusGetal;
    }
    
    public int getStatus(){
        return status;
    
    }
    
    public String print(){
        return "Persoon met status"+status;
    }
    
}
