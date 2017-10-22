/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campuspeople;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDOGG_000
 */
public class Department {
    private String name;
    private String location;
    private ArrayList<Employee> employees;
    private ArrayList<Student> students;
    
    public Department(){
        
    }
    public Department(String name, String location){
        this.name=name;
        this.location=location;
    }
    private Date stringToDate(String sDate) {
   DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
 
   try {
      return df.parse(sDate);
   } catch (java.text.ParseException ex) {
      System.err.println("Could not convert input date to Date object: " + sDate);
      System.exit(-1);
   }
 
   return null;
}
    public void readDepartment(String filename){
        try {
            Scanner input=new Scanner(new File(filename));
        name =input.nextLine();
        location=input.nextLine();
        while(input.hasNext()){
        char personType=input.next().charAt(0);
        input.nextLine();
        if(personType==('F')){
            Faculty fac=new Faculty();
            String[] person = input.nextLine().split(",");
            String[] employee=input.nextLine().split(",");
            String[] faculty=input.nextLine().split(",");
            String[]courses=input.nextLine().split(",");
            fac.setFirstname(person[0]);
            fac.setLastname(person[1]);
            fac.setStudentId(person[2]);
            fac.setBirthDate(stringToDate(person[3]));
            fac.setPhoneNumber(person[4]);
            fac.setHireDate(stringToDate(employee[0]));
            fac.setStatus(employee[1]);
            fac.setDepartment(employee[2]);
            fac.setRank(faculty[0]);
            fac.setResearchArea(faculty[1]);
            fac.addCurrentCourses(courses[0]);
        }
        if(personType==('S')){
            Student s=new Student();
            String[] person = input.nextLine().split(",");
            String[] employee=input.nextLine().split(",");
            String[] faculty=input.nextLine().split(",");
            String[]courses=input.nextLine().split(",");
            s.setFirstname(person[0]);
            s.setLastname(person[1]);
            s.setStudentId(person[2]);
            s.setBirthDate(stringToDate(person[3]));
            s.setPhoneNumber(person[4]);
            s.setHireDate(stringToDate(employee[0]));
            s.setStatus(employee[1]);
            s.setDepartment(employee[2]);
            s.setRank(faculty[0]);
            s.setResearchArea(faculty[1]);
            s.addCurrentCourses(courses[0]);
        }
        
        }
        
        
        
        
        
        }
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
