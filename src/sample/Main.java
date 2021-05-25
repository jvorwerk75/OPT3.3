package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        if(Login.getInstance().isAuthenticated()){
            Boolean nogeenkeer = true;
            while (nogeenkeer) {
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
                Record record = new Record(person);
                ContractApplication contractApplication = new ContractApplication(record, person.getSalary());
                contractApplication.makeContract();
                person.printContract();
                System.out.println("Nog een keer? (j/n)");
                Scanner scanner = new Scanner(System.in);
                if (!scanner.nextLine().equals("j")) {
                    nogeenkeer = false;
                }
            }

        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
