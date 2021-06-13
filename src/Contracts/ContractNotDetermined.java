package Contracts;

import sample.Person;

public class ContractNotDetermined extends Contract {

    public ContractNotDetermined(Person person){
        super(person);
        startDate();
        contractPercentage();
        probation();
        LBV();
        makeFunction();
    }

    public String makeTimeConditions(){
        return "Startdatum nieuwe medewerker: \r\n " + startDate;

    }
}
