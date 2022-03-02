/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconversion;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temper;
        int choose;
        
        Scanner input = new Scanner(System.in);
        System.out.println("+--------------------------------------+");
        System.out.println("| WATER TEMPERATURE CONVERSION PROGRAM |");
        System.out.println("+--------------------------------------+");
        System.out.println("Data Entry");
        System.out.println("----------");
        System.out.print("Temperature in Celcius : ");
        temper = input.nextDouble();
        
        do{
            System.out.println("\nOption");
            System.out.println("------");
            System.out.print("1. View Conversion Data\n2. Edit Conversion Data\n3. Exit\nChoose : ");
            choose = input.nextInt();
            Conversion temperature = new Conversion(temper);
            
            if(choose == 1){
                System.out.println("\nTemperature in Celcius    : " + temper + "°C");
                System.out.println("Temperature in Fahrenheit : " + temperature.fahrenheit() + "°F");
                System.out.println("Temperature in Reamur     : " + temperature.reamur() + "°R");
                System.out.println("Temperature in Kelvin     : " + temperature.kelvin() + "K");
                temperature.condition();
            }else if(choose == 2){
                System.out.println("\nData Entry");
                System.out.println("----------");
                System.out.print("Temperature in Celcius : ");
                temper = input.nextDouble();
            }else if(choose == 3){
                System.out.println("\nThank You!!");
            }else{
                System.out.println("\nOption does not exist, please enter the options correctly!");
            }
        }while(choose != 3);
    }
    
}
