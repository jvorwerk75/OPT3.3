package sample;

import Contracts.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    private ApplicantInfo applicantInfo;
    private EmployeeContract employeeContract;
    private Salary salary;
    private PersonInfo personInfo;
    public Person(ArrayList<String> info, ApplicantInfo applicantInfo){
        this.personInfo = new PersonInfo(info);
        this.applicantInfo = applicantInfo;

    }
    public ApplicantInfo getApplicantInfo(){return this.applicantInfo;}
    public Salary getSalary(){return this.salary;}
    public void setSalary(Salary salary){this.salary = salary;}
    public String getFullName(){return personInfo.getFirstName() + " " + personInfo.getMiddleName() + " " + personInfo.getLastName();}
    public String getFirstName(){return personInfo.getFirstName();}
    public String getLastName(){return personInfo.getLastName();}
    public String getBirthdate(){return personInfo.getBirthdate();}
    public String getGender(){return personInfo.getGender();}
    public String getIban(){return personInfo.getIban();}
    public String getBsn(){return personInfo.getBsn();}
    public void makeContract(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weet u zeker dat u een contract wilt maken voor " + getFullName() + "? (j/n)");
        String answer = scanner.nextLine();
        if (answer.equals("j")) {
            System.out.println("Wat voor een contract gaat het worden?\r\n" +
                    "1. Vast contract met bepaalde tijd,\r\n" +
                    "2. Vast contract met onbepaalde tijd, \r\n" +
                    "3. Voorovereenkomst (voor parttimers).");
            determineContract(scanner.nextInt(), person);
        }
        if (answer.equals("n")) {
            System.out.println("Contract maken afgebroken.");
        }
        if(employeeContract == null){
            System.out.println("Probeer het nog eens");
            makeContract(person);
        }
    }
    private void determineContract(int choice, Person person){
        if(choice ==1){
            this.employeeContract = new ContractDetermined(person);
        }else if(choice == 2){
            this.employeeContract = new ContractNotDetermined(person);
        }else if(choice == 3){
            this.employeeContract = new ContractParttimer(person);
        }else{
            return;
        }
        printContract();
    }

    public void printContract(){
        ContractPrinter contractPrinter = new ContractPrinter(this.employeeContract);
    }
    public void printPersonInfo(){
        System.out.println(getFullName());
        System.out.println(getBirthdate());
        System.out.println(getBsn());
        System.out.println(getGender());
        System.out.println(getIban());
    }
}
