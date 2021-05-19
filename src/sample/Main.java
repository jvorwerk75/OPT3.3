package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ApplicantInfo applicant = new ApplicantInfo(1, null, false, true, true, true);
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk", "20-3-1998", "man", "NL00INGB1234567890", "123456789", applicant);
        Record record = new Record(person);
        ContractApplication contractApplication = new ContractApplication(record, person.getSalary());
        contractApplication.makeContract();
        person.printContract();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
