package Contracts;
import sample.*;

public class Contract {
    protected Integer probation;
    protected String startDate;
    protected Integer contractPercentage;
    protected Forms forms;
    protected Function function;
    private Person person;
    public Contract() {
    }
    public Integer getContractPercentage(){return this.contractPercentage;}
    public String makeTimeConditions(){return "";}
    public void setPerson(Person person){this.person = person;}
    public Forms getForms(){return this.forms;}
    public Person getPerson(){return this.person;}
}
