package sample;

import Contracts.*;

import java.awt.*;
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
    private ApplicantInfo applicantInfo;
    private Contract contract;
    private Salary salary;
    public Person(ArrayList<String> info, ApplicantInfo applicantInfo){
        this.firstName = info.get(0);
        this.middleName = info.get(1);
        this.lastName = info.get(2);
        this.birthdate = info.get(3);
        this.gender = info.get(4);
        this.iban = info.get(5);
        this.bsn = info.get(6);
        this.applicantInfo = applicantInfo;

    }
    public Salary getSalary(){return this.salary;}
    public void setSalary(Salary salary){this.salary = salary;}
    public String getFullName(){return this.firstName + " " + this.middleName + " " + this.lastName;}
    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String getBirthdate(){return this.birthdate;}
    public String getGender(){return this.gender;}
    public String getIban(){return this.iban;}
    public String getBsn(){return this.bsn;}
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
    public void determineContract(int choice, Person person){
        if(choice == 1){
            this.contract = new ContractDetermined(person);
        }else if(choice == 2){
            this.contract = new ContractNotDetermined(person);
        }else if(choice == 3){
            this.contract = new ContractParttimer(person);
        }else{
            System.out.println("probeer het opnieuw!");
            makeContract(person);
        }
        printContract();
    }
    public void printContract(){
        ContractPrinter contractPrinter = new ContractPrinter(this.contract, this.salary);
    }
    public void printPersonInfo(){
        System.out.println(getFullName());
        System.out.println(getBirthdate());
        System.out.println(getBsn());
        System.out.println(getGender());
        System.out.println(getIban());
    }
}
