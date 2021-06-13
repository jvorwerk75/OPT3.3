package sample;

import Contracts.Contract;
import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;

public class Controller {
    private ArrayList<ContractApplication> contractApplicationArrayList = new ArrayList<>();
    private ArrayList<Record> recordArrayList = new ArrayList<>();
    private ArrayList<Person> personArrayList = new ArrayList<>();

    public Controller(){}
    public void addContractApplication(ContractApplication contractApplication){contractApplicationArrayList.add(contractApplication);}
    public void addPersonArrayList(Person person){
        personArrayList.add(person);
    }
    public void addRecord(Record record){
        this.recordArrayList.add(record);
    }
    public void printContractApplications(){
        System.out.println("Contract aanvragen: ");
        for(int i = 0; i < contractApplicationArrayList.size(); i++){
            Person person = contractApplicationArrayList.get(i).getRecord().getPerson();
            System.out.println( "#" + (i + 1) + " - "+ person.getFullName() + " - " + person.getBirthdate());
            System.out.println("================================================================");
        }
    }
    public ArrayList<Record> getRecordArrayList(){return recordArrayList;}
    public ArrayList<Person> getPersonArrayList(){ return personArrayList;}
    public ArrayList<ContractApplication> getContractApplicationArrayList(){return contractApplicationArrayList;}
    public void printRecords(){
        System.out.println("Records: ");
        for(int i = 0; i < recordArrayList.size(); i++){
            Person person = recordArrayList.get(i).getPerson();
            System.out.println("#" + (i + 1) + " - " + person.getFullName() + " - " + person.getBirthdate());
            System.out.println("================================================================");
        }
    }
}
