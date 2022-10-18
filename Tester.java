/****
 * Name: Zongxu Li(Victor)
 * Student Number: T00521219
 * Assignment Number: 3
 * Due Date: Oct 18, 2022
 * Program description: We have created a new method called compareTo. We used compareTo method to compare students' 
 * GPA. We also created an array with 10 new student objects and use for loop to find out the student who has highest and lowest GPA.
*/

public class Tester //This is driver class, testing all the methods.
{
     public static void main(String[] args)
     {
          Student s1 = new Student("Abio", "T00123456", "BCS", 3.3); //Creating 10 students stores different infos and GPA
          Student s2 = new Student("Victor", "T00567890", "BBA", 3.3);
          Student s3 = new Student("Adam", "T00541267", "Art", 3.0);
          Student s4 = new Student("Bob", "T00321456", "Math", 2.9);
          Student s5 = new Student("Tom", "T00258741", "Science", 3.1);
          Student s6 = new Student("Bella", "T00357951", "Physics", 2.8);
          Student s7 = new Student("Juliy", "T00256325", "Cook", 2.3);
          Student s8 = new Student("Peter", "T00125412", "Tourism", 2.7);
          Student s9 = new Student("Parker", "T00785547", "Music", 3.9);
          Student s10 = new Student("Nancy", "T00321865", "BTM", 2.6);
          
          System.out.println("Testing S1 to S2");   
          if ((s1.compareTo(s2)) == 0)
          {
               System.out.println("They have same GPA");
          }
          
          System.out.println("Testing S2 to S3");
          if ((s2.compareTo(s3)) > 0)
          {
               System.out.println("s2 has bigger GPA");
          }
          
          System.out.println("Testing S10 to S9");
          if ((s10.compareTo(s9)) < 0)
          {
               System.out.println("s10 has smaller GPA");
          }
          System.out.println();


          System.out.println("Creating arraies for 10 students objects");
          Student[] student = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10}; //Array loop for 10 students objects
          
          for (int i=0; i<student.length; i++)
          {
               System.out.println(student[i]);
          }
          System.out.println();
          
          int lowIndex = 0, highIndex = 0;     
          
          System.out.println("Using compareTo method to find highest and lowest GPA");
          for (int i=1; i<student.length; i++)     
          {
               if (student[i].compareTo(student[lowIndex]) < 0)
               {
                   lowIndex = i; 
               }
               
               if (student[i].compareTo(student[highIndex]) > 0)
               {
                    highIndex = i;
               }
          }
          
          System.out.println("The lowest GPA is" + " (" + student[lowIndex] + ")");
          System.out.println("The highest GPA is" + " (" + student[highIndex] + ")");
              
     }
          
     
}