/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** 
 * This class encapsulates concepts of a course including name and grade.
 * assuming a team has only team name as an attribute. Include a constructor,
 * the accessor and mutator, and methods toString and equals. Write a client
 * class to test all methods.
 * @author Uzair Ahmed 
 */
class CourseGrade {
  
private String name;
private String grade;
  
public void setName(String Name) {
name = Name;
 }
  
public void setGrade(String Grade) {
grade = Grade;
}
  
public String getName() {
return name;
}
  
public String getGrade() {
return grade;
}
 
public String toString() {
return "Course: " + name + ", Grade: " + grade;
}
   
public boolean equals(CourseGrade other){
return grade.equals(other.grade);

 }
  
}
