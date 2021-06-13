package Contracts;
import sample.*;
import java.util.Scanner;

public class Contract {
    private Integer contractPercentage;
    protected Integer probation;
    protected String startDate;
    private LBV lbv;
    private Person person;
    protected Function function;
    Scanner scanner = new Scanner(System.in);

    public Contract(Person person) {
        this.person = person;
    }

    public void makePartTimeContractCondition() {
        startDate();
        LBV();
        makeFunction();
    }

    public void makeStandardContractConditions() {
        startDate();
        contractPercentage();
        probation();
        LBV();
        makeFunction();

    }

    public void makeFunction() {
        this.function = new Function();
    }

    public String makeTimeConditions() {
        return "";
    }

    public void contractPercentage() {
        System.out.println("Hoeveel uur gaat de persoon werken per week? (24 t/m 40)");
        this.contractPercentage = scanner.nextInt();
    }

    public void probation() {
        System.out.println("Hoeveel maanden krijgt de persoon proeftijd? (1 t/m 2)");
        this.probation = scanner.nextInt();
    }

    public void startDate() {
        System.out.println("wanneer gaat de persoon beginnen? (dd/mm/yyyy)");
        this.startDate = scanner.nextLine();
    }
    public void LBV() {
        System.out.println("Wilt de persoon een LBV formulier? (j/n)");
        Scanner scanner2 = new Scanner(System.in);
        String answer = scanner2.nextLine();
        if (answer.equals("j")) {
            this.lbv = new LBV(true );
        } else if (answer.equals("n")) {
            this.lbv = new LBV(false);
        } else {
            System.out.println("U kunt alleen met 'j' of 'n' antwoorden. \r\n Probeer het nog eens! ");
            LBV();
        }
    }
    public Person getPerson(){return this.person;}
    public Integer getContractPercentage(){return this.contractPercentage;}
    public LBV getLbv(){return this.lbv;}
}
