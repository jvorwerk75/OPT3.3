package sample;

import java.util.Scanner;

public class Function {
    private String functionName;
    private String functionExplained;
    Scanner scanner = new Scanner(System.in);
    public Function(){
        makeFunction();
    }
    public String getFunctionName(){return functionName;}
    public String getFunctionExplained(){return functionExplained;}
    public void makeFunction(){
        System.out.println("Wat wordt de naam van de functie? (ICT=1/Account manager=2/HR medewerker=3/sales=4/Administratief medewerker=5/overig=6/parttimer=7)");
        if(scanner.nextInt() == 1){
            ICTfunction();
        }
        else if(scanner.nextInt() == 2){
            AMfunction();
        }
        else if(scanner.nextInt() == 3){
            HRFunction();
        }
        else if(scanner.nextInt() == 4){
            salesFunction();
        }
        else if(scanner.nextInt() == 5){
            administrationFunction();
        }
        else if(scanner.nextInt() == 6){
            overigFunction();
        }
        else if(scanner.nextInt() == 7){
            parttimeFunction();
        }
    }
    public void ICTfunction(){
        this.functionName = "ICT-Medewerker";
        this.functionExplained = "Je zult als medewerker van ons bedrijf opdrachten uitvoeren op de diverse vakgebieden van onze bedrijfsorganisatie. De taken die je uitvoert houden verband met de uitvoering van informatiserings- en automatiseringsprojecten bij onze klanten en/of onze organisatie zelf. ";
    }
    public void AMfunction(){
        this.functionName = "Account Manager";
        this.functionExplained = "Je zult als medewerker van onze organisatie verkoop en marketingtaken uitvoeren op de gebieden van klantenwerving, klantenbinding en projectbegeleiding. Deze commerciële taken hebben betrekking op de diverse diensten binnen onze organisatie, met name projecten, outsourcing bij klanten en beheer.";
    }
    public void HRFunction(){
        this.functionName = "HR-Medewerker";
        this.functionExplained = "Je zult als medewerker van OGD werkzaam zijn als HR Adviseur/medewerker";
    }
    public void administrationFunction(){
        this.functionName = "Administratie medewerker";
        this.functionExplained = "Je zult bij OGD werkzaam zijn als administratief medewerker.";
    }
    public void salesFunction(){
        this.functionName = "Sales medewerker";
        this.functionExplained = "Je zult bij OGD werkzaam zijn als marketeer.";
    }
    public void overigFunction(){
        System.out.println("Hoe heet de functie die de persoon gaat krijgen? ");
        this.functionName = scanner.nextLine();
    }
    public void parttimeFunction(){
        this.functionName = "Part-timer";
        this.functionExplained = "Je zult bij OGD werkzaam zijn als part-timer.";
    }
}
