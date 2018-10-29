import java.util.ArrayList;
// undergraduate class extending student class
public class Undergraduate extends Student
{
  //instance variables
 private String stream;
 private String projectTopic;
 private StringBuffer studentInitials = new StringBuffer();

  // constructor for class
  Undergraduate (String n, int i, String c, int y, boolean r, int m [], String s, String t)
  {
   studentName = n;
   studentID = i;
   course = c;
   year = y;
   registrationStatus = r;
   subjectMarks = new ArrayList<Integer>();
   addMarks(m);
   stream = s;
   projectTopic = t;
   setInitials();
  }
  //Set methods for variables
  public void setStream(String streamInput)
  {
    stream = streamInput;
  }

  public void setTopic(String topicInput)
  {
    projectTopic = topicInput;
  }
  //set method to work out initials of name
  public void setInitials()
  {
   StringBuffer initials = new StringBuffer();
   int nameLength = studentName.length();
   for (int i = 0 ; i < nameLength ; i++)
   {
     if(Character.isUpperCase(studentName.charAt(i)))
     {
       studentInitials.append(studentName.charAt(i));
     }
   }

  }
  //get methods for variables
 public String getStream()
 {
   return stream;
 }

 public String getTopic()
 {
   return projectTopic;
 }
 public StringBuffer getInitials()
 {
   return studentInitials;
 }
 //method to determine and print a fail warning regarding a student
 public void gradeWarning()
 {
  //call assign grade method
   char grade = assignGrade();
   //publish warning if it is an F grade
   if (grade == 'F')
   {
     System.out.println("WARNING: Student has a failing grade average!");
   }
 }

}
