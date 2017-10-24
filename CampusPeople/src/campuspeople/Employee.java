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
public class Employee extends Person{
    private Date hireDate;
    private String status;
    private String department;
     
    public Employee(){
        
    }
private String dateToString( Date date )
{
       DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
       return df.format(date);
}
    /**
     * @return the hireDate
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    public String toString(){
        String format="";
       return format=super.toString()+System.lineSeparator()+dateToString(hireDate)+", "+status+", "+department;
    }
    
}
