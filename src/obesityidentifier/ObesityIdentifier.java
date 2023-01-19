package obesityidentifier;

import java.util.Scanner;

public class ObesityIdentifier {

    public double CalculateWeight (Obesity ideal) {
        double meter;
        double Obesity;
        double broca = 0;
        
        if(ideal instanceof Male){
            Male male = (Male) ideal;
            meter = male.getHeight()/100;
            Obesity = (male.getWeight()/(meter*meter));
            System.out.print("Obese Level: "+Obesity+" ");

            if (Obesity<18.5){
                System.out.println("(Thin)");
            }else if (Obesity<=22.9){
                System.out.println("(Normal)");
            }else if (Obesity<24.9){
                System.out.println("(Overweight)"); 
            }else {
                System.out.println("(Obese)"); 
            }
            broca = (male.getHeight()-100)-(0.10*(male.getHeight()-100));
            
        }else if(ideal instanceof Female){
            Female female = (Female) ideal;
            meter = female.getHeight()/100;
            Obesity = (female.getWeight()/(meter*meter));
            System.out.print("Obese Level: "+Obesity+" ");

            if (Obesity<18.5){
                System.out.println("(Thin)");
            }else if (Obesity<=22.9){
                System.out.println("(Normal)");
            }else if (Obesity<24.9){
                System.out.println("(Overweight)"); 
            }else {
                System.out.println("(Obese)"); 
            }
            broca = (female.getHeight()-100)-(0.15*(female.getHeight()-100));
        }
            return broca;
    }
    
    public static String name(){
        String name;
        
        Scanner input = new Scanner (System.in);
            
        System.out.println("Please Insert Your Name :");
        name = input.nextLine();
        
        return name;
    }
    
    public static Integer age(){
        int age;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter Your age :");
        age = Integer.parseInt(input.nextLine());
             
        if (age < 18){
             System.out.println("You are not old enough to use the Obesity Identifier");
        } else {
            rumusByGender();
        }
        return age;
    }
    
    
    public static String rumusByGender(){
        String GenderAnswer;
        double height;
        double weight;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter your gender (M/F) :");
        GenderAnswer = input.nextLine();
        
        //If else untuk memilih rumus berdasarkan jenis kelamin
            ObesityIdentifier  idealObj = new ObesityIdentifier ();
            if(GenderAnswer.equals("M")){
                System.out.println("Weight :"); 
                weight = Double.parseDouble(input.nextLine());
                
                 System.out.println("Height :"); 
                height = Double.parseDouble(input.nextLine());
                
                System.out.println("------------------------------");
                System.out.println("Result");
                
                 Male male = new Male(weight,height);
                 System.out.println("Your ideal weight according to Broca: "+idealObj.CalculateWeight(male)+" Kg");
            
            }else{         
                
                System.out.println("Weight :");
               weight = Double.parseDouble(input.nextLine());
               
                System.out.println("Height :");
               height = Double.parseDouble(input.nextLine());
               
                System.out.println("------------------------------");
                System.out.println("Result");
               
               
                Female female = new Female(weight,height);
                System.out.println("Your ideal weight according to Broca: "+idealObj.CalculateWeight(female)+" Kg");   
            }
        
            return GenderAnswer;
    }
    
    
    public static void main(String[] args) {
        System.out.println("Obesity Identifier Program");
        System.out.println("-------------------------------------------");
        System.out.println("Identity");
        
        name();
        age();
        
    }
}
