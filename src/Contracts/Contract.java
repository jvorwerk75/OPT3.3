package Contracts;
import sample.*;

public abstract class Contract {
    protected Integer probation;
    protected String startDate;
    protected Integer contractPercentage;
    protected Forms forms;
    protected Function function;
    private Person person;
    public Contract() {
    }
    public abstract String makeTimeConditions();
    public Integer getContractPercentage(){return this.contractPercentage;}
    public void setPerson(Person person){this.person = person;}
    public Forms getForms(){return this.forms;}
    public Person getPerson(){return this.person;}
}
