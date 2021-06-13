package sample;

import java.util.Scanner;

public class Record {
    private Person person;
    private Boolean complete;
    private Boolean correct;
    private String contractSort;

    public Record(Person person, String contractSort) {
        this.person = person;
        complete = completeRecordCheck();
        correct = syntaxCheck();
        this.contractSort = contractSort;
    }
    //deze methode bepaald of er een contract aanvraag gedaan mag worden
    public Boolean makeContractApplicationCheck(){
        if(complete && correct){
            return true;
        }else{
            return false;
        }
    }
    public ContractApplication makeContractApplication(Record record){
        if(makeContractApplicationCheck()){
            Salary salary = makeSalary();
            System.out.println("Contract aanvraag is aangemaakt!");
            return new ContractApplication(record, salary);
        }else{
            System.out.println("Er mist wat info in de record of salaris");
        }
        return null;
    }
    public Salary makeSalary(){
        Boolean fulltime = person.getApplicantInfo().getFulltime();
        Scanner scanner = new Scanner(System.in);
        if(fulltime){
            System.out.println("Wat gaat de persoon verdienen? (obv 40)(xxxx,xx)");
        }else{
            System.out.println("Wat gaat de persoon verdienen? (per uur) (xx,xx)");
        }
        Double amount = scanner.nextDouble();

        return new Salary(fulltime,amount);

    }
    public Person getPerson(){return this.person;}
    public Boolean getComplete(){return this.complete;}
    //check persoongegevens compleet zijn. Hierin zijn niet vereiste attributen weggelaten
    public Boolean completeRecordCheck() {
        if (person.getBirthdate().isEmpty()) {
            return false;
        }
        if (person.getGender().isEmpty()) {
            return false;
        }
        if (person.getIban().isEmpty()) {
            return false;
        }
        if (person.getFirstName().isEmpty()) {
            return false;
        }
        if (person.getLastName().isEmpty()) {
            return false;
        }
        return true;
    }
    public Boolean syntaxCheck(){
        if(this.person.getBsn().length() != 9){
            return false;
        }
        if(countIbanNumbers(this.person.getIban()) != 12){
            return false;
        }
        if(this.person.getIban().length() != 18){
            return false;
        }
        return true;
    }
    public Integer countIbanNumbers(String iban){
        char[] ch = iban.toCharArray();
        Integer numbers = 0;
        for(int i = 0; i < iban.length(); i++){
            if(Character.isDigit(ch[i])){
                numbers++;
            }
        }
        return numbers;
    }
    public String getContractSort(){return this.contractSort;}
}


