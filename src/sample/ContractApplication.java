package sample;

import java.util.Scanner;

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

    public Boolean salaryCheck(){
        if(this.salary.getSalarySort().isEmpty()){
            return false;
        }
        if (this.salary.getAmount() == null) {
            return false;
        }
        record.getPerson().setSalary(salary);
        return true;
    }
    public Boolean contractApplicationControle(){
        if(personControle() && recordControle()){
            return true;
        }else{
            return false;
        }
    }
    private Boolean personControle(){
        System.out.println("Deze contract aanvraag is gemaakt voor de volgende sollicatant: ");
        record.getPerson().printPersonInfo();
        System.out.println("Kloppen deze gegevens? (j/n)");
        Scanner scanner  = new Scanner(System.in);
        String antwoord = scanner.nextLine();
        Boolean controle = true;
        while(controle){
            if(antwoord.equals("j")){
                return true;
            }else if(antwoord.equals("n")){
                return false;
            }else{
                System.out.println("Je kan alleen met j of n antwoorden. Probeer het nog eens!");
            }
        }
        return false;
    }
    private Boolean recordControle(){
        System.out.println("Deze contract aanvraag is gemaakt met de volgende record gegevens:");
        recordPrinter();
        System.out.println("Kloppen deze gegevens? (j/n)");
        Scanner scanner2 = new Scanner(System.in);
        String antwoord = scanner2.nextLine();
        Boolean controle = true;
        while(controle){
            if(antwoord.equals("j")){
                return true;
            }else if(antwoord.equals("n")){
                return false;
            }else{
                System.out.println("Je kan alleen met j of n antwoorden. Probeer het nog eens!");
            }
        }
        return false;
    }
    private void recordPrinter(){
        System.out.println(record.getPerson().getFullName());
        System.out.println(salary.getFullSalary());
        System.out.println(record.getContractSort());
    }
}
