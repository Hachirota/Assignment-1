import java.util.ArrayList;

public class Undergraduate extends Student
{
 private String stream;
 private String projectTopic;
 private StringBuffer studentInitials = new StringBuffer();

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
  public void setStream(String streamInput)
  {
    stream = streamInput;
  }

  public void setTopic(String topicInput)
  {
    projectTopic = topicInput;
  }

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

 public void gradeWarning()
 {
   char grade = assignGrade();

   if (grade == 'F')
   {
     System.out.println("WARNING: Student has a failing grade average!");
   }
 }

}
