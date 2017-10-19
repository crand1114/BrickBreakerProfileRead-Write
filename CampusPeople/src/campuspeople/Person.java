/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campuspeople;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author charles randall
 */
public class Person {
    private String firstname;
    private String lastname;
    private String studentId;
    private Date birthDate;
    private String phoneNumber;
    
    public Person(){
        
    }
    public Person(String fname, String lname, String sid, String birthDate, String phoneNumber){
     firstname=fname;
     lastname=lname;
     studentId=sid;
     this.phoneNumber=phoneNumber;
    dateToString(this.birthDate);
     
        
        
    }
    private String dateToString( Date date )
{
       DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
       return df.format(date);
}

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String toString(){
        String format="";
        format+=firstname+", "+lastname+", "+studentId+", "+dateToString(birthDate)+", "+phoneNumber;
        return format;
    }
}
