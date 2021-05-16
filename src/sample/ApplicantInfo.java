package sample;

public class ApplicantInfo {
    private Integer yearsExperience;
    private String officeLocation;
    private Boolean oldOGDWorker;
    private Boolean acceptedOffer = false;
    private Boolean goodMotivation;
    private Boolean completedStudy;
    private Boolean fulltime;

    public ApplicantInfo(Integer yearsExperience, String officeLocation, Boolean oldOGDWorker, Boolean fulltime, Boolean goodMotivation, Boolean completedStudy){
        this.yearsExperience = yearsExperience;
        this.officeLocation = officeLocation;
        this.oldOGDWorker = oldOGDWorker;
        this.fulltime = fulltime;
        this.goodMotivation = goodMotivation;
        this.completedStudy = completedStudy;
    }
    public void setYearsExperience(Integer yearsExperience){this.yearsExperience = yearsExperience;}
    public void setOfficeLocation(String officeLocation){this.officeLocation = officeLocation;}
    public void setOldOGDWorker(Boolean oldOGDWorker){this.oldOGDWorker = oldOGDWorker;}
    public void setAcceptedOffer(Boolean acceptedOffer){this.acceptedOffer = acceptedOffer;}
    public void setFulltime(Boolean fulltime){this.fulltime = fulltime;}
    public void setGoodMotivation(Boolean goodMotivation){this.goodMotivation = goodMotivation;}
    public void setCompletedStudy(Boolean completedStudy){this.completedStudy = completedStudy;}
    public Integer getYearsExperience(){return yearsExperience;}
    public String getOfficeLocation(){return officeLocation;}
    public Boolean getOldOGDWorker(){return oldOGDWorker;}
    public Boolean getAcceptedOffer(){return acceptedOffer;}
    public Boolean getFulltime(){return fulltime;}
    public Boolean getGoodMotivation(){return goodMotivation;}
    public Boolean getCompletedStudy(){return completedStudy;}

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
