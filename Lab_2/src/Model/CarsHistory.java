/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author rohinibalasubramanian
 */
public class CarsHistory {
    
    private ArrayList<Cars> history;
    
    public CarsHistory(){
        this.history = new ArrayList<Cars>();
    }

    public ArrayList<Cars>getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Cars> history) {
        this.history = history;
    }
    
   public Cars addNewCars(){
       
       Cars newCars = new Cars();
       history.add(newCars);
       return newCars;
       
   }
   
   public void deleteCars (Cars c){
       history.remove(c);
   }
    
    
}
