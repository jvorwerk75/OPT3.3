package Contracts;

import java.util.Scanner;

public class Car {
    private Boolean needed;
    public Car(){
        carNeeded();
    }
    public void carNeeded(){
        System.out.println("Gaat de persoon een auto krijgen? (j/n)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equals("j")){
            this.needed = true;
        }else if(answer.equals("n")){
            this.needed = false;
        }else{
            System.out.println("U kunt alleen met 'j' of 'n' antwoorden. \r\n Probeer het nog eens! ");
            carNeeded();
        }
    }

    public Boolean getNeeded(){return this.needed;}
}
