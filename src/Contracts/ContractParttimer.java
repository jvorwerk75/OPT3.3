package Contracts;
import sample.Person;

public class ContractParttimer extends EmployeeContract {

    public ContractParttimer(Person person){
        super(person);
        startDate();
        makeFunction();

    }
    public String makeTimeConditions(){
        return "Startdatum nieuwe medewerker: \r\n " + startDate + "\r\n";
    }
}
