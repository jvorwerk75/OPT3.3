package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String birthdate;
    private String gender;
    private String iban;
    private String bsn;
    private Salary salary;
    private ApplicantInfo applicantInfo;
    private Contract contract;
    private ContractPrinter contractPrinter;


    /*public Person(String firstName, String middleName, String lastName, String birthdate, String gender, String iban, String bsn, ApplicantInfo applicantInfo){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.gender = gender;
        this.iban = iban;
        this.bsn = bsn;
        this.applicantInfo = applicantInfo;
        this.salary = createSalary();
    }*/
    public Person(ArrayList<String> info, ApplicantInfo applicantInfo){
        this.firstName = info.get(0);
        this.middleName = info.get(1);
        this.lastName = info.get(2);
        this.birthdate = info.get(3);
        this.gender = info.get(4);
        this.iban = info.get(5);
        this.bsn = info.get(6);
        this.applicantInfo = applicantInfo;
        this.salary = createSalary();

    }

    public void setLastName(String lastName){this.lastName = lastName;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setMiddleName(String middleName){this.middleName = middleName;}
    public void setBirthdate(String birthdate){this.birthdate = birthdate;}
    public void setGender(String gender){this.gender = gender;}
    public void setIban(String iban){this.iban = iban;}
    public void setBSN(String bsn){this.bsn = bsn;}
    public String getFullName(){return this.firstName + " " + this.middleName + " " + this.lastName;}
    public String getFirstName(){return this.firstName;}
    public String getMiddleName(){return this.middleName;}
    public String getLastName(){return this.lastName;}
    public String getBirthdate(){return this.birthdate;}
    public String getGender(){return this.gender;}
    public String getIban(){return this.iban;}
    public String getBsn(){return this.bsn;}
    public Salary getSalary(){return this.salary;}

    public Salary createSalary(){
        Double amount;
        if(applicantInfo.getYearsExperience() < 4){
            amount = 2275.00;
        }else if(applicantInfo.getYearsExperience() > 3 && applicantInfo.getYearsExperience() < 10){
            amount = 2500.00;
        }else if(applicantInfo.getYearsExperience() >= 10){
            amount = 3000.00;
        }else{
            amount = null;
        }
        Salary salary = new Salary(applicantInfo.getFulltime(),amount);
        return salary;
    }
    public void makeContract(Person person){
        System.out.println("Weet u zeker dat u een contract wilt maken voor " + getFullName() + "? (j/n)");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equals("j")){
            System.out.println("Wat voor een contract gaat het worden?\r\n" +
                    "1. Vast contract met bepaalde tijd,\r\n" +
                    "2. Vast contract met onbepaalde tijd, \r\n" +
                    "3. Voorovereenkomst (voor parttimers).");
             determineContract(scanner.nextInt(), person);
        }
        if(answer.equals("n")){
            System.out.println("Contract maken afgebroken.");
        }
        if(answer.isEmpty()){
            System.out.println("Probeer het nog eens");
            makeContract(person);
        }
    }
    public void printContract(){
        contractPrinter = new ContractPrinter(contract);
    }
    public void determineContract(int choice, Person person){
        if(choice == 1){
            contract =  new ContractDetermined(person);
        }else if(choice == 2){
            contract = new ContractNotDetermined(person);
        }else if(choice == 3){
            contract = new ContractParttimer(person);
        }else{
            System.out.println("probeer het opnieuw!");
            makeContract(person);
        }
    }



}
