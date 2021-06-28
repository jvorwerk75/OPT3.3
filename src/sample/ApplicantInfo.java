package sample;

import java.util.ArrayList;

public class ApplicantInfo {
    private Integer yearsExperience;
    private Boolean oldOGDWorker;
    private Boolean goodMotivation;
    private Boolean completedStudy;
    private Boolean fulltime;



    public ApplicantInfo(Integer yearsExperience, ArrayList<Boolean> info){
        this.yearsExperience = yearsExperience;
        this.oldOGDWorker = info.get(0);
        this.fulltime = info.get(1);
        this.goodMotivation = info.get(2);
        this.completedStudy = info.get(3);
    }
    public Boolean getFulltime(){return fulltime;}
    public Boolean applicantSuitedForJob(){
        if(yearsExperience < 4 && yearsExperience > 0){
            return applicantExperienceCase1();
        }else if( yearsExperience > 3 && yearsExperience < 10){
            return applicantExperienceCase2();
        }else{
            return applicantExperienceCase3();
        }
    }
    public Boolean applicantExperienceCase1(){
        if(goodMotivation){
            if(completedStudy){
                return true;
            }else{
                if(oldOGDWorker){
                    return true;
                }else{
                    return false;
                }
            }
        }else{
            if(completedStudy){
                if(oldOGDWorker){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }
    public Boolean applicantExperienceCase2(){
        if(completedStudy || oldOGDWorker){
            return true;
        }
            return false;
    }
    public Boolean applicantExperienceCase3(){
        if(completedStudy || oldOGDWorker || goodMotivation){
            return true;
        }else{
            return false;
        }
    }
}
