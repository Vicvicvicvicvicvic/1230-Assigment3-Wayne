/****
 * Name: Zongxu Li(Victor)
 * Student Number: T00521219
 * Assignment Number: 3
 * Due Date: Oct 18, 2022
 * Program description: Student class implements the interface Comparable <Student>, and compareTo method.
*/

public class Student extends Person implements Comparable <Student> 
{
     private String degree;
     private double gpa;
     
     public Student()
     {
          super();
          degree = "not define";
          gpa = 0.0;      
     }

     public Student(String newName, String newId, String newDegree, double newGpa)
     {
          super(newName, newId);
          degree = newDegree;
          gpa = newGpa;
     }
     
     public String getDegree()
     {
          return degree;
     }
     
     public double getGpa()
     {
          return gpa;
     }
     
     public void setDegree(String newDegree)
     {
          degree = newDegree;
     }
     
     public void setGpa(double newGpa)
     {
          gpa = newGpa;
     }
     
     public void set(String newName, String newId, String newDegree, double newGpa)
     {
          super.set(newName,newId);
          degree = newDegree;
          gpa = newGpa;
     }
     
     public String toString()
     {
          return super.toString() + " " + "Degree = " + degree + " " + "GPA = " + gpa;
     }
     
     public int compareTo(Student s) //compareTo method. Because we compare the double values, and the return only returns
     {                               //3 varaibles, which are -1, 0, 1
          if (this.gpa < s.gpa)    
          {
               return -1;
          }   
          
          else if (this.gpa > s.gpa)
          {
               return 1;
          }
          
          else
          {
               return 0;
          }
     }
         
}