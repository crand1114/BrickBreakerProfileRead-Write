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
import javax.swing.JOptionPane;

/**
 *
 * @author charles randall
 */
public class CampusPeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p=new Person();
        Student u=new Student();
        GraduateStudent g=new GraduateStudent();
        Staff s=new Staff();
        Faculty f=new Faculty();
        Date birthDate=new Date();
       p.setBirthDate(birthDate);
       p.setFirstname("Charles");
       p.setLastname("Randall");
       p.setPhoneNumber("phoneNumber");
       p.setStudentId("Id");


       
 
       u.classSchedule=new ArrayList<>(4);
       g.classSchedule=new ArrayList<>(4);
       f.currentCourses=new ArrayList<>(4);
       u.setCreditHours(3);
       g.setCreditHours(3);
       for(int i=0;i<3;i++){
        f.setBirthDate(birthDate);   //shows current date
        f.setLastname("LastName");
        f.setFirstname("Faculty");
        f.setPhoneNumber("phone");
        f.setDepartment("department");
        f.setStatus("status");
        f.setStudentId("facultyId");
        f.setRank("rank");
        if(i==0){
        f.addCurrentCourses("comp167");
        }
        if(i==1){
         f.addCurrentCourses("geen");
        }
        if(i==2){
         f.addCurrentCourses("math");
         f.setRank("rank");
         f.setResearchArea("researchArea");
         f.setHireDate(birthDate);
        
        }
      }
       
        s.setBirthDate(birthDate);   //shows current date
        s.setLastname("LastName");
        s.setFirstname("Staff");
        s.setPhoneNumber("phone");
        s.setCareerBand("careerBand");
        s.setDepartment("department");
        s.setJobTitle("jobTitle");
        s.setSupervisor("supervisor");
        s.setStatus("status");
        s.setStudentId("staffId");
        s.setHireDate(birthDate);
      
      for(int i=0;i<u.getCreditHours();i++){
        u.setBirthDate(birthDate);   //shows current date
        if(i==0){
        u.addClassSchedule("comp167");
        }
        if(i==1){
         u.addClassSchedule("geen");
        }
        if(i==2){
         u.addClassSchedule("math");
        }
        u.setCreditHours(29);
        u.setLastname("Grad");
        u.setFirstname("Under");
        u.setGpa(4);
        u.setMajor("Engineering");
        u.setPhoneNumber("phone");
        u.setStudentId("studentId");
      }
       for(int i=0;i<g.getCreditHours();i++){
        g.setBirthDate(birthDate);   //shows current date
       if(i==0){
        g.addClassSchedule("comp167");
        }
        if(i==1){
         g.addClassSchedule("geen");
        }
        if(i==2){
         g.addClassSchedule("math");
        }
        g.setCreditHours(29);
        g.setLastname("Student");
        g.setFirstname("Grad");
        g.setGpa(4);
        g.setAssistanceType("TA");
        g.setConcentration("Computer Science");
        g.setMajor("Comp Sci");
        g.setThesis("thesis");
        g.setPhoneNumber("phone");
        g.setStudentId("gradId");
      }
      
        JOptionPane.showMessageDialog(null,p.toString()+System.lineSeparator()+ u.toString()+System.lineSeparator()+g.toString()+System.lineSeparator()+f.toString()+System.lineSeparator()+s.toString());
      /* next line of code is used to make sure I have the correct output*/
      System.out.println(p.toString()+System.lineSeparator()+System.lineSeparator()+g.toString()+System.lineSeparator()+System.lineSeparator()+u.toString()+System.lineSeparator()+System.lineSeparator()+f.toString()+System.lineSeparator()+System.lineSeparator()+s.toString());
        
/* ArrayList<Person> p = new ArrayList<>();
        try {
            Scanner input = new Scanner(new File(args[0]));

            while (input.hasNext()) {
                String personType = input.nextLine().trim();
                if (personType.equals("U")) {
                    
                    Student u = new Student();
                    u.setFirstname(input.next());
                    u.setLastname(input.next());
                    u.setStudentId(Integer.parseInt(input.next()));
                   // Date birthDate=new Date();
                    private Date stringToDate(String sDate) {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

        try {
            return df.parse(sDate);
        } catch (java.text.ParseException ex) {
            Date birthDate = new Date(input.next());
            System.err.println("Could not convert input date to Date object: " + sDate);
            System.exit(-1);
        } 
        return null;
    }

                    
                    u.setBirthDate(stringToDate(input.next()));
                    u.setPhoneNumber("369-555-2468");
                    u.setMajor(input.next());
                    u.setCreditHours(input.nextInt());
                    u.setGpa(input.nextFloat());
                    u.addClassSchedule("Comp167");

                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CampusPeople.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    private Date stringToDate(String sDate) {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

        try {
            return df.parse(sDate);
        } catch (java.text.ParseException ex) {
            Date birthDate = new Date(input.next());
            System.err.println("Could not convert input date to Date object: " + sDate);
            System.exit(-1);
        } 
        return null;
    }*/
       
    
}

     
       
       
       
        // TODO code application logic here
       
}
