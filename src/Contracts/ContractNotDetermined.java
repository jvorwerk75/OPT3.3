package Contracts;
import sample.Person;

public class ContractNotDetermined extends EmployeeContract {
    public ContractNotDetermined(Person person){
        super(person);
        contractPercentage();
        probation();
    }
    public String makeTimeConditions(){
        return "Startdatum nieuwe medewerker: \r\n " + startDate;

    }
}
