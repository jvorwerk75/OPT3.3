package Contracts;

import sample.Function;
import sample.Person;

import java.util.Scanner;

public class EmployeeContract extends Contract{
    Scanner scanner = new Scanner(System.in);
    public EmployeeContract(Person person){
        this.forms = new Forms();
        setPerson(person);
    }
    public void contractPercentage() {
        System.out.println("Hoeveel uur gaat de persoon werken per week? (24 t/m 40)");
        this.contractPercentage = scanner.nextInt();
    }
    public Integer getContractPercentage(){return this.contractPercentage;}
    public void probation() {
        System.out.println("Hoeveel maanden krijgt de persoon proeftijd? (1 t/m 2)");
        this.probation = scanner.nextInt();
    }
    public void makeFunction() {
        this.function = new Function();
    }
    public void startDate() {
        System.out.println("wanneer gaat de persoon beginnen? (dd/mm/yyyy)");
        this.startDate = scanner.nextLine();
    }
    public String makeTimeConditions() {
        return "";
    }

}
