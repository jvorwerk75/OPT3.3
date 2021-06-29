package sample;

import java.util.Scanner;

public class Function {
    private String functionName;
    Scanner scanner = new Scanner(System.in);
    public Function(){
        makeFunction();
    }
    public String getFunctionName(){return functionName;}
    public void makeFunction(){
        System.out.println("Wat wordt de naam van de functie? (ICT=1/Account manager=2/HR medewerker=3/sales=4/Administratief medewerker=5/overig=6/parttimer=7)");
        int antwoord = scanner.nextInt();
        if(antwoord == 1){
            ICTFunction();
        }
        else if(antwoord == 2){
            AMFunction();
        }
        else if(antwoord == 3){
            HRFunction();
        }
        else if(antwoord == 4){
            salesFunction();
        }
        else if(antwoord == 5){
            administrationFunction();
        }
        else if(antwoord == 6){
            overigFunction();
        }
        else if(antwoord == 7){
            parttimeFunction();
        }
    }
    public void ICTFunction(){this.functionName = "ICT-Medewerker"; }
    public void AMFunction(){
        this.functionName = "Account Manager";
    }
    public void HRFunction(){
        this.functionName = "HR-Medewerker";
    }
    public void administrationFunction(){
        this.functionName = "Administratie medewerker";
    }
    public void salesFunction(){
        this.functionName = "Sales medewerker";
    }
    public void overigFunction(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Hoe heet de functie die de persoon gaat krijgen? ");
        this.functionName = scanner2.nextLine();
    }
    public void parttimeFunction(){
        this.functionName = "Part-timer";
    }
}
