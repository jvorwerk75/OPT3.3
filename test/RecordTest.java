
import org.junit.jupiter.api.Test;
import sample.Person;
import sample.Record;

import static org.junit.jupiter.api.Assertions.*;

class RecordTest {

    // condition coverage
    // elke voorwaarden wordt op true en false getest

    @Test
    void conditionCoverage1(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NLV9RABO0123456789", "12345678", null);
        Record record = new Record(person);
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void conditionCoverage2(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "N19RABO0123456789", "12345678", null);
        Record record = new Record(person);
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void conditionCoverage3(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL9RABO0123456789", "123456789", null);
        Record record = new Record(person);
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }

    //Decistion Coverage
    //elke uitkomst wordt gecontroleerd

    @Test
    void decisionCoverage1(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NLV9RABO0123456789", "123456789", null);
        Record record = new Record(person);
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void decisionCoverage2(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "123456789", null);
        Record record = new Record(person);
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertTrue(record.makeContractApplication());
    }

    //Condition/Decision coverage
    //Alle voorwaarden en uitkomsten zijn false of true;

    @Test
    void conditionDecisionCoverage1(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO012345789", "12345689", null);
        Record record = new Record(person);
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void conditionDecisionCoverage2(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "123456789", null);
        Record record = new Record(person);
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertTrue(record.makeContractApplication());
    }

    //Modified condition/decision coverage
    //Er wordt getest of 1 specifieke voorwaarde impact heeft op D

    @Test
    void modifiedConditionDecisionCoverage1(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "123456789", null);
        Record record = new Record(person);
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertTrue(record.makeContractApplication());
    }
    @Test
    void modifiedConditionDecisionCoverage2(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "12345678", null);
        Record record = new Record(person);
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void modifiedConditionDecisionCoverage3(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NLV9RABO0123456789", "123456789", null);
        Record record = new Record(person);
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void modifiedConditionDecisionCoverage4(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "N19RABO0123456789", "123456789", null);
        Record record = new Record(person);
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }

    //Multiple Condition Coverage
    //Alle mogelijke combinaties worden getest

    @Test
    void multipleConditionCoverage1(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO012346789", "12345689", null);
        Record record = new Record(person);
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage2(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NLV9RABO0123456789", "12345689", null);
        Record record = new Record(person);
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage3(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19ABO0123456789", "12345678", null);
        Record record = new Record(person);
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage4(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "12345678", null);
        Record record = new Record(person);
        //A
        assertFalse(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage5(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL9RABO0123456789", "123456789", null);
        Record record = new Record(person);
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage6(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NLV9RABO0123456789", "123456789", null);
        Record record = new Record(person);
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertFalse(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage7(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "L19RABO0123456789", "123456789", null);
        Record record = new Record(person);
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertFalse(record.getPerson().getIban().length() == 18);
        //D
        assertFalse(record.makeContractApplication());
    }
    @Test
    void multipleConditionCoverage8(){
        Person person = new Person("Jasper", "Yvo Manfred", "Vorwerk"
                , "20-3-1998", "Man", "NL19RABO0123456789", "123456789", null);
        Record record = new Record(person);
        //A
        assertTrue(numberCount(record.getPerson().getBsn()) == 9);
        //B
        assertTrue(numberCount(record.getPerson().getIban()) == 12);
        //C
        assertTrue(record.getPerson().getIban().length() == 18);
        //D
        assertTrue(record.makeContractApplication());
    }

    public Integer numberCount(String string){
        char[] ch = string.toCharArray();
        int numbers = 0;
        for (int i = 0; i < string.length(); i++){
            if(Character.isDigit(ch[i])){
                numbers++;
            }
        }
        return numbers;
    }
}