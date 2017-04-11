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
public class Wereld {
    
    Virus virusA;
    Persoon[] personen;
    int numPersonen;
    
    public Wereld(){
        int percVaccinated = 75;
        numPersonen = 1000;
        virusA = new epidemie.Virus(50, 50, 50);
        personen = new Persoon[numPersonen];
        
        for(int i=0; i<(numPersonen); i++){
              personen[i]=new Persoon(percVaccinated);
              //System.out.println(i+" "+personen[i].print());
    
        }

    }
    
    public int print(){
        int statusA=0;
        int statusB=0;
        int statusC=0;
        for(int i=0; i<(numPersonen); i++){
             // System.out.println(i+" "+personen[i].print());
            if (personen[i].getStatus() == 0) {
                statusA++;
            } else if (personen[i].getStatus() == 1) {
                statusB++;
            } else {
                statusC++;
            }
            
         }   
        
        /*
        System.out.println("Status S : "+statusA);
        System.out.println("Status I : "+statusB);
        System.out.println("Status R : "+statusC);
        */
        System.out.println("S : "+statusA+" I : "+statusB+" R : "+statusC);
        return 0;
        
    }
    
    
    public void spreadVirus(int numInfected){
        Random randomGenerator = new Random();
        int randomGetal;
        //System.out.println("THE FOLLOWING PERSONS WERE INFECTED");
        for (int i=0; i<numInfected;i++){
            randomGetal = randomGenerator.nextInt(numPersonen);
            if (personen[randomGetal].getStatus()==2){
                //doe niets; persoon is reeds resistent
            } else {
                personen[randomGetal].setStatus(1);
            }
            
            //System.out.println(randomGetal+" "+personen[randomGetal].print());
        } 
       // print();

        
    }
    
    
    public void runTurn(int numContacts){
        // eerst : check resistentie en upgrade
        for (int i=0;i<numPersonen;i++){
            if (personen[i].getStatus()==1){
                personen[i].resistentiecounter++;
                if (personen[i].resistentiecounter==3){
                    personen[i].setStatus(2);
                }
            }
        }
        
        
        // nu rondje infecteren
        for (int j=0;j<numPersonen;j++){
            if (personen[j].getStatus()==1){
                spreadVirus(numContacts);
            }
        }
        
        
    }
    
    public void probleemCode(){
                Persoon[] Personen = new Persoon[numPersonen];
                Random randomGenerator = new Random();
                int randomInt;
                for(int j=0;j<(numPersonen); j++){
                    
                    randomInt = randomGenerator.nextInt(100);
                    if(randomInt < 30) {
                        if ((Personen[j].Statuss).equals("I")){
                            Personen[j].Statuss="R";
                        }
                    }  
               
                 }
    }
    
    
}
