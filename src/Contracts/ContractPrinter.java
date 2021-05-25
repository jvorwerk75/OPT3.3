package Contracts;

import Contracts.Contract;

public class ContractPrinter {
    private Contract contract;
    public ContractPrinter(Contract contract){
        this.contract = contract;
        printContract();
    }

    public void printContract(){
        System.out.println("CONTRACT");
        System.out.println(contract.makeBeginText());
        System.out.println("==============================");
        printFunction();
        System.out.println("==============================");
        System.out.println(contract.makeTimeConditions());
        System.out.println("==============================");
        printProbation();
        System.out.println("==============================");
        printSalary();
        System.out.println("==============================");
        printContractPercentage();
        System.out.println("==============================");
        printLBV();
    }
    public void printFunction(){
        System.out.println("De persoon stap in de functie van: \r\n"+ contract.function.getFunctionName() );
    }
    public void printProbation(){
        System.out.println("De persoon krijgt een proeftijd van: ");
        if(contract.probation == 1){
            System.out.println(contract.probation + " maand");
        }else{
            System.out.println(contract.probation + " maanden");
        }
    }
    public void printSalary(){
        System.out.println("De persoon krijgt een salaris van: \r\n" + contract.getPerson().getSalary().getFullSalary());
    }
    public void printContractPercentage(){
        System.out.println("De persoon gaat per week zoveel uren werken: \r\n" + contract.getContractPercentage());
    }
    public void printLBV(){
        if(contract.getLbv().getNeeded()){
            System.out.println("De persoon heeft een LBV nodig.");
        }else{
            System.out.println("De persoon heeft geen LBV nodig.");
        }
    }
}
