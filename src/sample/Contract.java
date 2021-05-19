package sample;

import java.util.Scanner;

public class Contract {
    private Integer contractPercentage;
    protected Integer probation;
    protected String startDate;
    private LBV lbv;
    private Person person;
    private String user;
    protected Function function;
    private ContractPrinter contractPrinter;
    Scanner scanner  = new Scanner(System.in);

    public Contract(Person person){
        this.person = person;
    }
    public void makeStandardContractConditions(){
        contractPercentage();
        startDate();
        probation();
        //LBV();
        User();
        makeFunction();
    }
    public void makeFunction(){
        this.function = new Function();
    }
    public String makeBeginText() {
        return "";
    }
    public String makeTimeConditions(){
        return "";
    }
    public void contractPercentage(){
        System.out.println("Hoeveel uur gaat de persoon werken per week? (24 t/m 40)");
        this.contractPercentage = scanner.nextInt();
    }
    public void probation(){
        System.out.println("Hoeveel maanden krijgt de persoon proeftijd? (1 t/m 2)");
        this.probation = scanner.nextInt();
    }
    public void startDate(){
        System.out.println("wanneer gaat de persoon beginnen? (dd/mm/yyyy)");
        Scanner scanner1 = new Scanner(System.in);
        this.startDate = scanner1.nextLine();
    }
    public void LBV(){
        System.out.println("heeft de persoon een LBV nodig? (j/n)");
        if(scanner.nextLine().equals("j")){
            this.lbv = new LBV();
        }
        if(scanner.nextLine().equals("n")){
            return;
        }
        System.out.println("Probeer het opnieuw");
        LBV();
    }
    public void User(){
        System.out.println("Wat is uw volledige naam? ");
        Scanner scanner2 = new Scanner(System.in);
        this.user = scanner2.nextLine();
    }







}
