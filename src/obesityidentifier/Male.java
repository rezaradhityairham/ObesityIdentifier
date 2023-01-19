/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obesityidentifier;

public class Male implements Obesity {
    double weight;
    double height;

    public double ObesityIdentifier (double weight, double height) {
        double meter;
        double Obesity;
        double broca;
        meter = height/100;
        Obesity= (weight/(meter*meter));
        
        if (Obesity<18.5){
            System.out.println("(Kurus)");
        }else if (Obesity<=22.9){
            System.out.println("(Normal)");
        }else if (Obesity<24.9){
            System.out.println("(Overweight)"); 
        }else {
            System.out.println("(Obesitas)"); 
        }
        
        broca = (height-100)-(0.15*(height-100));
        
        return broca;
    }

    public Male (double thisw, double thish){
        weight = thisw;
        height = thish;
    }
    
    public void ideal () {
        System.out.println();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
