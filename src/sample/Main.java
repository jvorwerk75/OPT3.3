package sample;

import Contracts.Contract;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller controller = new Controller();
        makeDummyRecord(controller);
        if(Login.getInstance().isAuthenticated()){
            Boolean nogeenkeer = true;
            while (nogeenkeer) {



            }

        }

    }
    public void makeDummyRecord(Controller controller){
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
        Record record1 = new Record(person);
        controller.addRecord(record1);

        ArrayList<Boolean>  applicationInfoList2 = new ArrayList<>();
        applicationInfoList2.add(false);
        applicationInfoList2.add(true);
        applicationInfoList2.add(true);
        applicationInfoList2.add(true);
        ApplicantInfo applicant2 = new ApplicantInfo(1, applicationInfoList2);
        ArrayList<String> personInfo2 = new ArrayList<String>();
        personInfo.add("Piet");
        personInfo.add("Eduard Joosten");
        personInfo.add("de Vries");
        personInfo.add("30-7-2002");
        personInfo.add("man");
        personInfo.add("NL00INGB0987654321");
        personInfo.add("987654321");
        Person person2 = new Person(personInfo2, applicant2);
        Record record2 = new Record(person2);
        controller.addRecord(record2);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
