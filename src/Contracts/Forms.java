package Contracts;
import java.util.Scanner;
public class Forms{
    private Boolean car;
    private Boolean lbv;
    public Forms() {
        makeForms();
    }
    public void makeForms(){
        Car();
        LBV();
    }
    public Boolean getCar(){return this.car;}
    public Boolean getLbv(){return this.lbv;}
    public void Car(){
        System.out.println("Gaat de persoon een auto krijgen? (j/n)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equals("j")){
            this.car = true;
        }else if(answer.equals("n")){
            this.car = false;
        }else{
            System.out.println("U kunt alleen met 'j' of 'n' antwoorden. \r\n Probeer het nog eens! ");
            Car();
        }
    }
    public void LBV() {
        System.out.println("Wilt de persoon een LBV formulier? (j/n)");
        Scanner scanner2 = new Scanner(System.in);
        String answer = scanner2.nextLine();
        if (answer.equals("j")) {
            this.lbv = true;
        } else if (answer.equals("n")) {
            this.lbv = false;
        } else {
            System.out.println("U kunt alleen met 'j' of 'n' antwoorden. \r\n Probeer het nog eens! ");
            LBV();
        }
    }
}
