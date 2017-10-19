/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campuspeople;

/**
 *
 * @author charles randall
 */
public class Staff extends Employee {
    private String jobTitle;
    private String supervisor;
    private String careerBand;
     
    public Staff(){
        
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return the supervisor
     */
    public String getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * @return the careerBand
     */
    public String getCareerBand() {
        return careerBand;
    }

    /**
     * @param careerBand the careerBand to set
     */
    public void setCareerBand(String careerBand) {
        this.careerBand = careerBand;
    }
    public String toString(){
        String format="";
        return format+=super.toString()+System.lineSeparator()+jobTitle+", "+supervisor+", "+careerBand;
    }
}
