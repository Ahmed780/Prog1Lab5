public class Grades {

    public static void main(String[] args) { 

    CourseGrade course1 = new CourseGrade();
    course1.setName("Computer Science");
    course1.setGrade("A");
    
    CourseGrade course2 = new CourseGrade();
    course2.setName("English");
    course2.setGrade("A");
    
        
    CourseGrade course3 = new CourseGrade();
    course3.setName("Math");
    course3.setGrade("B");
  
    System.out.println(course1.toString());
    System.out.println(course2.toString());
    System.out.println(course3.toString());
    
    System.out.println("Are course1 grade and course2 grade the same ? "+course1.equals(course2));
    System.out.println("Are course1 grade and course2 grade the same ? " +course1.equals(course3));
  }
  
}
