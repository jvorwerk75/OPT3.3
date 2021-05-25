package Contracts;

import sample.Person;

public class ContractNotDetermined extends Contract {

    public ContractNotDetermined(Person person){
        super(person);
        makeStandardContractConditions();
    }

    public String makeTimeConditions(){
        return "Startdatum nieuwe medewerker: \r\n " + startDate;

    }
}
