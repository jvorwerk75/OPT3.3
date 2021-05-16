package sample;

public class ContractApplication {
    private Record record;
    private Salary salary;
    public ContractApplication(Record record, Salary salary){
        this.record = record;
        this.salary = salary;
    }

    //Hierin wordt gecontroleerd of de contract aanvraag compleet is voordat hij opgestuurd mag worden.
    private void completeCheck(){
        if(recordCheck() && salaryCheck()){
            //TODO aanvraag is compleet en mag opgestuurd worden
        }else{
            //TODO aanvraag is niet compleet en moet nog compleet gemaakt worden
        }
    }
    private boolean recordCheck(){
        record.completeRecordCheck();
        if(record.getComplete()){
            return true;
        }
        else{
            System.out.println("Record is niet compleet");
            return false;
        }
    }
    private Boolean salaryCheck(){
        if(this.salary.getSalarySort().isEmpty()){
            return false;
        }
        if (this.salary.getAmount() == null) {
            return false;
        }
        return false;
    }
}
