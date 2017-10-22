/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campuspeople;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
    
    public Department() {
        students = new ArrayList<>();
        employees = new ArrayList<>();
        
    }
    
    public Department(String name, String location) {
        this.name = name;
        this.location = location;
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
    
    public void readDepartment(String filename) {
        try {
            Scanner input = new Scanner(new File(filename));
            setName(input.nextLine());
            setLocation(input.nextLine());
            while (input.hasNext()) {
                char personType = input.nextLine().charAt(0);
                if (personType == ('F')) {
                    Faculty fac = new Faculty();
                    String[] person = input.nextLine().split(",");
                    String[] employee = input.nextLine().split(",");
                    String[] faculty = input.nextLine().split(",");
                    String[] courses = input.nextLine().split(",");
                    fac.setFirstname(person[0].trim());
                    fac.setLastname(person[1].trim());
                    fac.setStudentId(person[2].trim());
                    fac.setBirthDate(stringToDate(person[3].trim()));
                    fac.setPhoneNumber(person[4].trim());
                    fac.setHireDate(stringToDate(employee[0].trim()));
                    fac.setStatus(employee[1].trim());
                    fac.setDepartment(employee[2].trim());
                    fac.setRank(faculty[0].trim());
                    fac.setResearchArea(faculty[1].trim());
                    for (int i = 0; i < courses.length; i++) {
                        fac.addCurrentCourses(courses[i].trim());
                    }
                    employees.add(fac);
                }
                if (personType == ('U')) {
                    Student s = new Student();
                    String[] person = input.nextLine().split(",");
                    String[] student = input.nextLine().split(",");
                    String[] courses = input.nextLine().split(",");
                    s.setFirstname(person[0].trim());
                    s.setLastname(person[1].trim());
                    s.setStudentId(person[2].trim());
                    s.setBirthDate(stringToDate(person[3].trim()));
                    s.setPhoneNumber(person[4].trim());
                    s.setMajor(student[0].trim());
                    s.setCreditHours(Integer.parseInt(student[1].trim()));
                    s.setGpa(Float.parseFloat(student[2].trim()));
                    for (int i = 0; i < courses.length; i++) {
                        s.addClassSchedule(courses[i].trim());
                    }
                    students.add(s);
                    
                }
                if (personType == ('G')) {
                    GraduateStudent g = new GraduateStudent();
                    String[] person = input.nextLine().split(",");
                    String[] student = input.nextLine().split(",");
                    String[] courses = input.nextLine().split(",");
                    String[] grad = input.nextLine().split(",");
                    g.setFirstname(person[0].trim());
                    g.setLastname(person[1].trim());
                    g.setStudentId(person[2].trim());
                    g.setBirthDate(stringToDate(person[3].trim()));
                    g.setPhoneNumber(person[4].trim());
                    g.setMajor(student[0].trim());
                    g.setCreditHours(Integer.parseInt(student[1].trim()));
                    g.setGpa(Float.parseFloat(student[2].trim()));
                    for (int i = 0; i < courses.length; i++) {
                        g.addClassSchedule(courses[i].trim());
                    }
                    g.setThesis(grad[0].trim());
                        g.setConcentration(grad[1].trim());
                        g.setAssistanceType(grad[2].trim());
                    
                    students.add(g);
                    
                }
                if (personType == ('S')) {
                    Staff s = new Staff();
                    String[] person = input.nextLine().split(",");
                    String[] employee = input.nextLine().split(",");
                    String[] staff = input.nextLine().split(",");
                    s.setFirstname(person[0].trim());
                    s.setLastname(person[1].trim());
                    s.setStudentId(person[2].trim());
                    s.setBirthDate(stringToDate(person[3].trim()));
                    s.setPhoneNumber(person[4].trim());
                    s.setHireDate(stringToDate(employee[0].trim()));
                    s.setStatus(employee[1].trim());
                    s.setDepartment(employee[2].trim());
                    s.setJobTitle(staff[0].trim());
                    s.setSupervisor(staff[1].trim());
                    s.setCareerBand(staff[2].trim());
                    employees.add(s);
                }
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void writeDepartment(String filename) {
        
        try {
            PrintWriter output = new PrintWriter(new File(filename));
            output.print(toString());
            
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Department.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public int getEmployees() {
        return employees.size();
    }
    
    public Employee getEmployees(int index) {
        return employees.get(index);
    }
    
    public void setEmployees(int index, Employee item) {
        employees.set(index, item);
    }
    
    public void addEmployees(Employee item) {
        employees.add(item);
    }
    
    public Employee deleteClassSchedule(int index) {
        return employees.remove(index);
    }
    
    public int getNumStudents() {
        return students.size();
    }
    
    public Student getStudents(int index) {
        return students.get(index);
    }
    
    public void setStudents(int index, Student item) {
        students.set(index, item);
    }
    
    public void addStudents(Student item) {
        students.add(item);
    }
    
    public Student deleteStudents(int index) {
        return students.remove(index);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String toString() {
        String format = "";
        format += name + System.lineSeparator() + location + System.lineSeparator();
        for (int i = 0; i < employees.size(); i++) {
            
            if (employees.get(i) instanceof Faculty) {
                format += "F";
            } else {
                format += "S";
            }
            
            format += System.lineSeparator() + employees.get(i)+System.lineSeparator();
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) instanceof GraduateStudent) {
                format += "G";
            } else {
                format += "U";
            }
            
            format += System.lineSeparator() + students.get(i)+System.lineSeparator();
            
        }
        return format;
        
    }
}
