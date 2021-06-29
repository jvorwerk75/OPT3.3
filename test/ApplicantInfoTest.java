import org.junit.jupiter.api.Test;
import sample.ApplicantInfo;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantInfoTest {
    ArrayList<Boolean> applicationInfo = new ArrayList<>();
    public void addToApplicationInfo(){
        applicationInfo.add(true);
        applicationInfo.add(true);
        applicationInfo.add(true);
        applicationInfo.add(true);
    }
    public void setAllTrue(){
        for(int i = 0; i < applicationInfo.size(); i++) {
            applicationInfo.set(i, true);
        }
    }


    @Test
    void pairwiseTestCase1(){
        addToApplicationInfo();
        setAllTrue();
        applicationInfo.set(3, false);
        ApplicantInfo applicantInfo = new ApplicantInfo(2, applicationInfo);
        assertTrue(applicantInfo.applicantSuitedForJob());
    }
    @Test
    void pairwiseTestCase2(){
        addToApplicationInfo();
        setAllTrue();
        applicationInfo.set(0, false);
        applicationInfo.set(2, false);
        ApplicantInfo applicantInfo = new ApplicantInfo(2, applicationInfo);
        assertFalse(applicantInfo.applicantSuitedForJob());
    }
    @Test
    void pairwiseTestCase3(){
        addToApplicationInfo();
        setAllTrue();
        applicationInfo.set(0, false);
        ApplicantInfo applicantInfo = new ApplicantInfo(2, applicationInfo);
        assertTrue(applicantInfo.applicantSuitedForJob());
    }
    @Test
    void pairwiseTestCase4(){
        addToApplicationInfo();
        setAllTrue();
        applicationInfo.set(2, false);
        applicationInfo.set(3, false);
        ApplicantInfo applicantInfo = new ApplicantInfo(7, applicationInfo);
        assertTrue(applicantInfo.applicantSuitedForJob());
    }
    @Test
    void pairwiseTestCase5(){
        addToApplicationInfo();
        setAllTrue();
        ApplicantInfo applicantInfo = new ApplicantInfo(10, applicationInfo);
        assertTrue(applicantInfo.applicantSuitedForJob());
    }
    @Test
    void pairwiseTestCase6(){
        addToApplicationInfo();
        setAllTrue();
        applicationInfo.set(0, false);
        applicationInfo.set(2, false);
        applicationInfo.set(3, false);
        ApplicantInfo applicantInfo = new ApplicantInfo(10, applicationInfo);
        assertFalse(applicantInfo.applicantSuitedForJob());
    }
}