package sample;

public class ContractPrinter {
    private Contract contract;
    public ContractPrinter(Contract contract){
        this.contract = contract;
        printContract();
    }

    public void printContract(){
        System.out.println(contract.makeBeginText());
        System.out.println(contract.makeTimeConditions());

    }
}
