/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconversion;

/**
 *
 * @author ASUS
 */
public class Conversion {
    double tempcel;
    
    public Conversion(double tempcel){
        this.tempcel = tempcel;
    }
    
    double reamur(){
        return (4*this.tempcel)/5;
    }
    
    double fahrenheit(){
        return ((9*this.tempcel)/5)+32;
    }
    
    double kelvin(){
        return this.tempcel + 273.15;
    }
    
    public void condition(){
        if(this.tempcel <= 0){
            System.out.println("Water Condition Frozen.");
        }else if(this.tempcel >= 100){
            System.out.println("Water Condition Boiling.");
        }else{
            System.out.println("Water Condition Normal.");
        }
    }
}
