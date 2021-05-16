import org.junit.jupiter.api.Test;
import sample.ApplicantInfo;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantInfoTest {
    @Test
    void pairwiseTestCase1(){
        ApplicantInfo applicantInfo = new ApplicantInfo(2, null,true,true,true, false);
        assertTrue(applicantInfo.applicantSuitedForJob());
    }
    @Test
    void pairwiseTestCase2(){
        ApplicantInfo applicantInfo = new ApplicantInfo(2, null,false,true,false, true);
        assertFalse(applicantInfo.applicantSuitedForJob());
    }
    @Test
    void pairwiseTestCase3(){
        ApplicantInfo applicantInfo = new ApplicantInfo(7, null,false,true,true, true);
        assertTrue(applicantInfo.applicantSuitedForJob());
    }
    @Test
    void pairwiseTestCase4(){
        ApplicantInfo applicantInfo = new ApplicantInfo(7, null,true,true,false, false);
        assertTrue(applicantInfo.applicantSuitedForJob());
    }
    @Test
    void pairwiseTestCase5(){
        ApplicantInfo applicantInfo = new ApplicantInfo(10, null,true,true,true, true);
        assertTrue(applicantInfo.applicantSuitedForJob());
    }
    @Test
    void pairwiseTestCase6(){
        ApplicantInfo applicantInfo = new ApplicantInfo(10, null,false,true,false, false);
        assertFalse(applicantInfo.applicantSuitedForJob());
    }
}