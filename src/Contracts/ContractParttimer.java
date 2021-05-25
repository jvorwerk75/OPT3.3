package Contracts;

import sample.Person;

public class ContractParttimer extends Contract {

    public ContractParttimer(Person person){
        super(person);
        makePartTimeContractCondition();

    }
    public String makeTimeConditions(){
        return "Startdatum nieuwe medewerker: \r\n " + startDate + "\r\n";
    }
}
