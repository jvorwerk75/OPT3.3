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
    ArrayList<String> info1 = new ArrayList<String>();
    public void addToArray(){
        info1.add(firstName);
        info1.add(middleName);
        info1.add(lastName);
        info1.add(birthDate);
        info1.add(gender);
        info1.add(iban);
        info1.add(bsn);
    }
    //Test of de equivalentieklasen en randwaarden kloppen bij het bepalen van het salaris
    @Test
    void salaryClass1Test1(){
        ApplicantInfo applicantInfo = new ApplicantInfo(0, null,null,true, null, null);
        addToArray();
        Person person = new Person(info1, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2275.00);
    }
    @Test
    void salaryClass1Test2(){
        ApplicantInfo applicantInfo = new ApplicantInfo(2, null,null,true,null, null);
        addToArray();
        Person person = new Person(info1, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2275.00);
    }
    @Test
    void salaryClass1Test3(){
        ApplicantInfo applicantInfo = new ApplicantInfo(3, null,null,true, null, null);
        addToArray();
        Person person = new Person(info1, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2275.00);
    }
    @Test
    void salaryClass2Test1(){
        ApplicantInfo applicantInfo = new ApplicantInfo(4, null,null,true,null ,null );
        addToArray();
        Person person = new Person(info1, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2500.00);
    }
    @Test
    void salaryClass2Test2(){
        ApplicantInfo applicantInfo = new ApplicantInfo(7, null,null,true,null, null);
        addToArray();
        Person person = new Person(info1, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2500.00);
    }
    @Test
    void salaryClass2Test3(){
        ApplicantInfo applicantInfo = new ApplicantInfo(9, null,null,true,null, null);
        addToArray();
        Person person = new Person(info1, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2500.00);
    }
    @Test
    void salaryClass3Test1(){
        ApplicantInfo applicantInfo = new ApplicantInfo(10, null,null,true,null, null);
        addToArray();
        Person person = new Person(info1, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 3000.00);
    }
    @Test
    void salaryClass3Test2(){
        ApplicantInfo applicantInfo = new ApplicantInfo(17, null,null,true,null,null);
        addToArray();
        Person person = new Person(info1, applicantInfo);
        assertTrue(person.getSalary().getAmount() == 3000.00);
    }
}