package sample;

public class ApplicantInfo {
    private Integer yearsExperience;
    private String officeLocation;
    private Boolean oldOGDWorker;
    private Boolean acceptedOffer = false;
    private Boolean fulltime;

    public ApplicantInfo(Integer yearsExperience, String officeLocation, Boolean oldOGDWorker, Boolean fulltime){
        this.yearsExperience = yearsExperience;
        this.officeLocation = officeLocation;
        this.oldOGDWorker = oldOGDWorker;
        this.fulltime = fulltime;
    }
    public void setYearsExperience(Integer yearsExperience){this.yearsExperience = yearsExperience;}
    public void setOfficeLocation(String officeLocation){this.officeLocation = officeLocation;}
    public void setOldOGDWorker(Boolean oldOGDWorker){this.oldOGDWorker = oldOGDWorker;}
    public void setAcceptedOffer(Boolean acceptedOffer){this.acceptedOffer = acceptedOffer;}
    public void setFulltime(Boolean fulltime){this.fulltime = fulltime;}
    public Integer getYearsExperience(){return yearsExperience;}
    public String getOfficeLocation(){return officeLocation;}
    public Boolean getOldOGDWorker(){return oldOGDWorker;}
    public Boolean getAcceptedOffer(){return acceptedOffer;}
    public Boolean getFulltime(){return fulltime;}


}
