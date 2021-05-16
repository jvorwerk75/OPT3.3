import org.junit.jupiter.api.Test;
import sample.ApplicantInfo;
import sample.Person;

import static org.junit.jupiter.api.Assertions.*;

class SalaryTest {
    //Test of de equivalentieklasen en randwaarden kloppen bij het bepalen van het salaris
    @Test
    void salaryClass1Test1(){
        ApplicantInfo applicantInfo = new ApplicantInfo(0, null,null,true, null, null);
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "123456789", applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2275.00);
    }
    @Test
    void salaryClass1Test2(){
        ApplicantInfo applicantInfo = new ApplicantInfo(2, null,null,true,null, null);
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "123456789", applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2275.00);
    }
    @Test
    void salaryClass1Test3(){
        ApplicantInfo applicantInfo = new ApplicantInfo(3, null,null,true, null, null);
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "123456789", applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2275.00);
    }
    @Test
    void salaryClass2Test1(){
        ApplicantInfo applicantInfo = new ApplicantInfo(4, null,null,true,null ,null );
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "123456789", applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2500.00);
    }
    @Test
    void salaryClass2Test2(){
        ApplicantInfo applicantInfo = new ApplicantInfo(7, null,null,true,null, null);
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "123456789", applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2500.00);
    }
    @Test
    void salaryClass2Test3(){
        ApplicantInfo applicantInfo = new ApplicantInfo(9, null,null,true,null, null);
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "123456789", applicantInfo);
        assertTrue(person.getSalary().getAmount() == 2500.00);
    }
    @Test
    void salaryClass3Test1(){
        ApplicantInfo applicantInfo = new ApplicantInfo(10, null,null,true,null, null);
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "123456789", applicantInfo);
        assertTrue(person.getSalary().getAmount() == 3000.00);
    }
    @Test
    void salaryClass3Test2(){
        ApplicantInfo applicantInfo = new ApplicantInfo(17, null,null,true,null,null);
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "123456789", applicantInfo);
        assertTrue(person.getSalary().getAmount() == 3000.00);
    }
}