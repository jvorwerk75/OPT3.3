package Contracts;
import sample.Person;

public class ContractNotDetermined extends EmployeeContract {
    public ContractNotDetermined(Person person){
        super(person);
        startDate();
        contractPercentage();
        probation();
        makeFunction();
    }
    public String makeTimeConditions(){
        return "Startdatum nieuwe medewerker: \r\n " + startDate;

    }
}
