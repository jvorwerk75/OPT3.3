import org.junit.jupiter.api.Test;
import sample.ApplicantInfo;
import sample.Person;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class SalaryTest {
    String firstName = "Jasper";
    String middleName = "Yvo Manfred";
    String lastName = "Vorwerk";
    String birthDate = "20-3-1998";
    String gender = "man";
    String iban = "NLV9RABO0123456789";
    String bsn = "12345678";

    ArrayList<String> personInfoList = new ArrayList<String>();
    public void addToPersonArray(){
        personInfoList.add(firstName);
        personInfoList.add(middleName);
        personInfoList.add(lastName);
        personInfoList.add(birthDate);
        personInfoList.add(gender);
        personInfoList.add(iban);
        personInfoList.add(bsn);
    }
    ArrayList<Boolean> applicationInfoList = new ArrayList<>();
    public void addToApplicationInfoList(){
        applicationInfoList.add(null);
        applicationInfoList.add(true);
        applicationInfoList.add(null);
        applicationInfoList.add(null);

    }
    //Test of de equivalentieklasen en randwaarden kloppen bij het bepalen van het salaris
    @Test
    void salaryClass1Test1(){
        addToApplicationInfoList();
        ApplicantInfo applicantInfo = new ApplicantInfo(0, applicationInfoList);
        addToPersonArray();
        Person person = new Person(personInfoList, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2275.00);
    }
    @Test
    void salaryClass1Test2(){
        addToApplicationInfoList();
        ApplicantInfo applicantInfo = new ApplicantInfo(2, applicationInfoList);
        addToPersonArray();
        Person person = new Person(personInfoList, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2275.00);
    }
    @Test
    void salaryClass1Test3(){
        addToApplicationInfoList();
        ApplicantInfo applicantInfo = new ApplicantInfo(3, applicationInfoList);
        addToPersonArray();
        Person person = new Person(personInfoList, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2275.00);
    }
    @Test
    void salaryClass2Test1(){
        addToApplicationInfoList();
        ApplicantInfo applicantInfo = new ApplicantInfo(4, applicationInfoList);
        addToPersonArray();
        Person person = new Person(personInfoList, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2500.00);
    }
    @Test
    void salaryClass2Test2(){
        addToApplicationInfoList();
        ApplicantInfo applicantInfo = new ApplicantInfo(7, applicationInfoList);
        addToPersonArray();
        Person person = new Person(personInfoList, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2500.00);
    }
    @Test
    void salaryClass2Test3(){
        addToApplicationInfoList();
        ApplicantInfo applicantInfo = new ApplicantInfo(9, applicationInfoList);
        addToPersonArray();
        Person person = new Person(personInfoList, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2500.00);
    }
    @Test
    void salaryClass3Test1(){
        addToApplicationInfoList();
        ApplicantInfo applicantInfo = new ApplicantInfo(10, applicationInfoList);
        addToPersonArray();
        Person person = new Person(personInfoList, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 3000.00);
    }
    @Test
    void salaryClass3Test2(){
        addToApplicationInfoList();
        ApplicantInfo applicantInfo = new ApplicantInfo(17, applicationInfoList);
        addToPersonArray();
        Person person = new Person(personInfoList, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 3000.00);
    }
}