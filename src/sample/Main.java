package sample;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller controller = new Controller();
        makeDummyRecord(controller);
        makeDubbyUsers();
        makeDummyContractApplication(controller);
        if(Login.getInstance().isAuthenticated()){
            if(Login.getInstance().getLoggedInUser().getIsHr()){
                ContractApplication contractApplication = contractApplicationChoser(controller);
                if(contractApplication.contractApplicationControle()){
                    contractMaker(contractApplication);
                }
            }else if(Login.getInstance().getLoggedInUser().getIsRecruitment()){
                Record record = recordChoser(controller);
                ContractApplication contractApplication =  record.makeContractApplication(record);
                controller.addContractApplication(contractApplication);
            }

        }

    }
    private void makeDubbyUsers(){
        User HRuser = new User("a", "b");
        User RecruitmentUser = new User("c", "d");
        HRuser.makeHRWorker();
        RecruitmentUser.makeRecruitmentWorker();
        Login.getInstance().getUsers().add(HRuser);
        Login.getInstance().getUsers().add(RecruitmentUser);
    }
    private void contractMaker(ContractApplication contractApplication){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wilt u een contract maken? (j/n)");
        String antwoord = scanner.nextLine();
        if(antwoord.equals("j")){
            contractApplication.completeCheck();
        }else if(antwoord.equals("n")){
            System.out.println("Varwel");
        }else{
            System.out.println("Je kan aleen met j en n antwoorden. Probeer het nog eens.");
        }

    }
    private void makeDummyRecord(Controller controller){
        ArrayList<Boolean>  applicationInfoList = new ArrayList<>();
        applicationInfoList.add(false);
        applicationInfoList.add(true);
        applicationInfoList.add(true);
        applicationInfoList.add(true);
        ApplicantInfo applicant = new ApplicantInfo(1, applicationInfoList);
        ArrayList<String> personInfo = new ArrayList<String>();
        personInfo.add("Jasper");
        personInfo.add("Yvo Manfred");
        personInfo.add("Vorwerk");
        personInfo.add("20-03-1998)");
        personInfo.add("man");
        personInfo.add("NL00INGB1234567890");
        personInfo.add("123456789");
        Person person = new Person(personInfo, applicant);
        Record record1 = new Record(person, "Parttimer");
        controller.addPersonArrayList(person);
        controller.addRecord(record1);

        ArrayList<Boolean>  applicationInfoList2 = new ArrayList<>();
        applicationInfoList2.add(false);
        applicationInfoList2.add(true);
        applicationInfoList2.add(true);
        applicationInfoList2.add(true);
        ApplicantInfo applicant2 = new ApplicantInfo(1, applicationInfoList2);
        ArrayList<String> personInfo2 = new ArrayList<String>();
        personInfo2.add("Piet");
        personInfo2.add("Eduard Joosten");
        personInfo2.add("de Vries");
        personInfo2.add("30-7-2002");
        personInfo2.add("man");
        personInfo2.add("NL00INGB0987654321");
        personInfo2.add("987654321");
        Person person2 = new Person(personInfo2, applicant2);
        Record record2 = new Record(person2, "Vast bepaald");
        controller.addRecord(record2);
        controller.addPersonArrayList(person2);
    }
    private ContractApplication contractApplicationChoser(Controller controller){
        controller.printContractApplications();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welke contract aanvraag wilt u hebben? ");
        int antwoord = scanner.nextInt() -1;
        Boolean answerCheck = true;
        while (answerCheck){
            if(antwoord < controller.getContractApplicationArrayList().size()){
                return controller.getContractApplicationArrayList().get(antwoord);
            }else{
                System.out.println("Deze contract aanvraag bestaat niet. Probeer het nog eens");
            }
        }
        return null;
    }
    private Record recordChoser(Controller controller){
        controller.printRecords();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welke record wilt u gebruiken voor de contractaanvraag? ");
        int antwoord = scanner.nextInt() -1;
        Boolean answerCheck = true;
        while(answerCheck){
            if (antwoord < controller.getRecordArrayList().size()){
                return controller.getRecordArrayList().get(antwoord);
            }else{
                System.out.println("Deze record aanvraag bestaat niet. Probeerd het nog eens");
            }
        }
        return null;
    }
    private void makeDummyContractApplication(Controller controller){
        Salary salary = new Salary(false, 11.66);
        Salary salary2 = new Salary (true, 2375.00);
        ContractApplication contractApplication = new ContractApplication(controller.getRecordArrayList().get(0), salary);
        ContractApplication contractApplication2 = new ContractApplication(controller.getRecordArrayList().get(1),salary2);
        controller.getContractApplicationArrayList().add(contractApplication);
        controller.getContractApplicationArrayList().add(contractApplication2);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
