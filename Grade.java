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