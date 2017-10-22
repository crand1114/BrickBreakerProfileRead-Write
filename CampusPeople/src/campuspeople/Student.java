/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campuspeople;

import java.util.ArrayList;

/**
 *
 * @author charles randall
 */
public class Student extends Person{
    protected String major;
    protected int creditHours;
    protected float gpa;
    protected ArrayList<String> classSchedule;
    
    public Student(){
        classSchedule=new ArrayList<>();
    }
    public Student(String fname,String lname, String sid, String  birthDate, String phoneNumber, String maj,int cred, float grade){
        major=maj;
        creditHours=cred;
        gpa=grade;    
        classSchedule=new ArrayList<String>();
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the creditHours
     */
    public int getCreditHours() {
        return creditHours;
    }

    /**
     * @param creditHours the creditHours to set
     */
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    /**
     * @return the gpa
     */
    public float getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public int getNumClassSchedules(){
        return classSchedule.size();
    }
    public String getClassSchedule(int index){
        return classSchedule.get(index);
    }
    public void setClassSchedule(int index, String item){
        classSchedule.set(index, item);
    }
    public void addClassSchedule(String item){
        classSchedule.add(item);
    }
    public String deleteClassSchedule(int index){
       return classSchedule.remove(index);
    }
    public String toString(){
        String form="";
        form+=super.toString()+System.lineSeparator()+major+", "+creditHours+", "+gpa+System.lineSeparator();
        for(int i=0;i<classSchedule.size();i++){
            form+=classSchedule.get(i);
            if (i +1!=classSchedule.size()) {
                form+=",";
            }
        }
        return form;
    }
}
