package Contracts;

import java.util.Scanner;

public class LBV {
    private Boolean lbvNeeded;
    public LBV(){
        LBVNeeded();
    }
    public void LBVNeeded() {
        System.out.println("Wilt de persoon een LBV formulier? (j/n)");
        Scanner scanner2 = new Scanner(System.in);
        String answer = scanner2.nextLine();
        if (answer.equals("j")) {
            this.lbvNeeded = true;
        } else if (answer.equals("n")) {
            this.lbvNeeded = false;
        } else {
            System.out.println("U kunt alleen met 'j' of 'n' antwoorden. \r\n Probeer het nog eens! ");
            LBVNeeded();
        }
    }
    public Boolean getNeeded(){return lbvNeeded;}
}
