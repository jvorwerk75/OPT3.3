package sample;

import java.util.ArrayList;

public class Controller {
    private ArrayList<ContractApplication> contractApplicationArrayList = new ArrayList<>();
    private ArrayList<Record> recordArrayList = new ArrayList<>();

    public Controller(){}
    public void addContractApplication(ContractApplication contractApplication){
        this.contractApplicationArrayList.add(contractApplication);
    }
    public void addRecord(Record record){
        this.recordArrayList.add(record);
    }
    public void deleteContractApplication(ContractApplication contractApplication){
        for(int i = 0; i < contractApplicationArrayList.size(); i++){
            if(contractApplication.getRecord().getPerson().getBsn().equals(contractApplicationArrayList.get(i).getRecord().getPerson().getBsn())){
                contractApplicationArrayList.remove(i);
            }
        }
    }
    public void deleteRecord(Record record){
        for(int i = 0; i < recordArrayList.size(); i++){
            if(record.getPerson().getBsn().equals(recordArrayList.get(i).getPerson().getBsn())){
                recordArrayList.remove(i);
            }
        }
    }
    public void printContractApplications(){
        System.out.println("Contract aanvragen: ");
        for(int i = 0; i < contractApplicationArrayList.size(); i++){
            Person person = contractApplicationArrayList.get(i).getRecord().getPerson();
            System.out.println( "#" + i + " - "+ person.getFullName() + " - " + person.getBirthdate());
            System.out.println("================================================================");
        }
    }
    public void printRecords(){
        System.out.println("Records: ");
        for(int i = 0; i < recordArrayList.size(); i++){
            Person person = recordArrayList.get(i).getPerson();
            System.out.println("#" + i + " - " + person.getFullName() + " - " + person.getBirthdate());
            System.out.println("================================================================");
        }
    }
}
