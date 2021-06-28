package Contracts;
import sample.Person;

public class ContractDetermined extends EmployeeContract {
    private String endDate;
    public ContractDetermined(Person person){
        super(person);
        startDate();
        endDate();
        contractPercentage();
        probation();
        makeFunction();

    }
    public void endDate(){
        System.out.println("Wat wordt de einddatum van het contract? (dd/mm/yy)");
        this.endDate = scanner.nextLine();
    }
    public String makeTimeConditions(){
        return "Startdatum nieuwe medewerker: \r\n" + startDate + "\r\nEinddatum nieuwe medewerker:\r\n" + endDate;
    }
}
