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
        Person p = new Person();
        Department d = new Department();
        Student u = new Student();
        GraduateStudent g = new GraduateStudent();
        Staff s = new Staff();
        Faculty f = new Faculty();
        Date birthDate = new Date();

        d.readDepartment(args[0]);
        
        Scanner keyboard= new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "INPUT FILE NAME");
        String filename=keyboard.next();
        d.writeDepartment(filename);

    }

    // TODO code application logic here
}
