package Contracts;

import sample.Login;
import sample.Salary;

public class ContractPrinter {
    private Contract contract;
    private Salary salary;
    public ContractPrinter(Contract contract, Salary salary){
        this.contract = contract;
        this.salary = salary;
        printContract();
    }

    public void printContract(){
        System.out.println("CONTRACT");
        System.out.println(makeBeginText());
        System.out.println("==============================");
        printFunction();
        System.out.println("==============================");
        System.out.println(contract.makeTimeConditions());
        if(contract.probation != null) {
            System.out.println("==============================");
            printProbation();
        }
        System.out.println("==============================");
        printSalary();
        System.out.println("==============================");
        printContractPercentage();
        System.out.println("==============================");
        printLBV();
        System.out.println("==============================");
        printCar();
    }
    private void printFunction(){
        System.out.println("De persoon stap in de functie van: \r\n"+ contract.function.getFunctionName() );
    }
    private void printProbation(){
        System.out.println("De persoon krijgt een proeftijd van: ");
        if(contract.probation == 1){
            System.out.println(contract.probation + " maand");
        }else{
            System.out.println(contract.probation + " maanden");
        }
    }
    private void printSalary(){
        System.out.println("De persoon krijgt een salaris van: \r\n" + salary.getFullSalary());
    }
    private void printContractPercentage(){
        System.out.println("De persoon gaat per week zoveel uren werken: \r\n" + contract.getContractPercentage());
    }
    private void printLBV(){
        if(contract.getForms().getLbv()){
            System.out.println("De persoon heeft een LBV nodig.");
        }else{
            System.out.println("De persoon heeft geen LBV nodig.");
        }
    }
    private void printCar(){
        if(contract.getForms().getCar()){
            System.out.println("De Persoon krijgt een auto van OGD.");
        }else{
            System.out.println("De Persoon hoeft geen auto van OGD.");
        }
    }
    private String makeBeginText() {
        return "Dit zijn de details van het contract voor " + contract.getPerson().getFullName() + ". \r\n==============================\r\nDit contract is aangemaakt door: " + Login.getInstance().getUsername();
    }
}
