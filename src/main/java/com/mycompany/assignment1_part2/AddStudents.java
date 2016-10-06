/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1_part2;

import com.github.ekeane21.CourseProgramme;
import com.github.ekeane21.Module;
import com.github.ekeane21.Student;
import org.joda.time.DateTime;

/**
 *
 * @author Paraic
 */
public class AddStudents {
    
    String data;
    public AddStudents(String data){
    this.data=data;
        }
    
    public static void main(String[] args){
        Student[] people1 = new Student[5];
            people1[0]= new Student("Bob","010296",20);   
            people1[1]= new Student("Ruth","141195",20);  
            people1[2]= new Student("James","020595",21);  
            people1[3]= new Student("Liz","030394",22);  
            people1[4]= new Student("Daisy","030493",23);  
                   
                   
        Student[] people2 = new Student[3];
            people2[0]= new Student("James","020595",21);  
            people2[1]= new Student("Liz","030394",22);  
            people2[2]= new Student("Daisy","030493",23);
            
        Student[] people3 = new Student[3];
            people3[0]= new Student("John","020595",21);  
            people3[1]= new Student("Mary","030394",22);  
            people3[2]= new Student("Petunia","030493",23);
                  
        Module[] Engineering = new Module[3];
        Engineering[0] = new Module("Programming", "CT101", people1);
        Engineering[1] = new Module("Elnics Design", "EE123", people2);
        Engineering[2] = new Module("Algebra", "QR145", people3);
        
        DateTime startdate = new DateTime(2013, 3, 10, 1, 58);
        DateTime enddate = new DateTime(2013, 3, 10, 1, 58);
        
               CourseProgramme programme1 = new CourseProgramme("Engineering", Engineering, startdate, enddate);
                     
               System.out.println("Course Name: " +programme1.getCourseName());
               System.out.println("Start Date: " +programme1.getStart());
               System.out.println("End Date: " +programme1.getEnd());
               for (int i=0; i<Engineering.length; i++){
                    System.out.println("Module Name: "+Engineering[i].getModule());
                    System.out.println("Module ID: "+Engineering[i].getID()); 
                    int len = Engineering[i].getStudent().length;
                    Student[] arry= Engineering[i].getStudent();
                    System.out.println("Students: ");
                        int ken= arry.length;
                        for( int k=0;k<ken; k++){
                            System.out.println("    "+arry[k].getusername());
                        }
               
                    
        }
               
               
        }
    
}
