package Contracts;

import sample.Person;

public class ContractDetermined extends Contract {
    private String endDate;

    public ContractDetermined(Person person){
        super(person);
        endDate();
        makeStandardContractConditions();

    }
    public void endDate(){
        System.out.println("Wat wordt de einddatum van het contract? (dd/mm/yy)");
        this.endDate = scanner.nextLine();
    }
    public String makeTimeConditions(){
        return "Startdatum nieuwe medewerker: \r\n" + startDate + "\r\nEinddatum nieuwe medewerker:\r\n" + endDate;
    }


}
