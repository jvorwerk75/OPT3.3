package sample;

public class ContractApplication {
    private Record record;
    private Salary salary;
    public ContractApplication(Record record, Salary salary){
        this.record = record;
        this.salary = salary;
    }

    //Hierin wordt gecontroleerd of de contract aanvraag compleet is voordat hij opgestuurd mag worden.
    public void completeCheck(){
        if(recordCheck() && salaryCheck()){
            record.getPerson().makeContract(record.getPerson());
        }else{
            System.out.println("Er missen nog gegevens in de aanvraag.");
        }
    }
    public Record getRecord(){return this.record;}
    public boolean recordCheck(){
        record.completeRecordCheck();
        if(record.getComplete()){
            return true;
        }
        else{
            System.out.println("Record is niet compleet");
            return false;
        }
    }

    public void makeContract(){
        record.getPerson().makeContract(record.getPerson());
    }

    public Boolean salaryCheck(){
        if(this.salary.getSalarySort().isEmpty()){
            return false;
        }
        if (this.salary.getAmount() == null) {
            return false;
        }
        return false;
    }
}
