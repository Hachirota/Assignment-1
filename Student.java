import java.util.ArrayList;

public class Student implements CalculateGrade
{
  protected String studentName;
  protected int studentID;
  protected String course;
  protected int year;
  protected boolean registrationStatus;
  protected ArrayList<Integer> subjectMarks;

  Student ()
 {

 }

  public void setStudentName(String nameInput)
  {
    studentName = nameInput;
  }

  public void setStudentID(int idInput)
  {
    studentID = idInput;
  }

  public void setCourse(String courseInput)
  {
    course = courseInput;
  }

  public void setYear(int currentYear)
  {
    year = currentYear;
  }

  public void setStatus(boolean regIn)
  {
    registrationStatus = regIn;
  }

  public void addMarks(int [] marklist)
  {
    for (int i = 0 ; i < 10 ; i++)
    {
     subjectMarks.add(marklist[i]);
    }
  }


  public String returnName()
  {
    return studentName;
  }

  public int returnID()
  {
    return studentID;
  }

  public String returnCourse()
  {
    return course;
  }

  public int returnYear()
  {
    return year;
  }

  public boolean returnStatus()
  {
    return registrationStatus;
  }

  public int returnGrade(int index)
  {
    return subjectMarks.get(index);
  }

  public ArrayList returnMarks()
  {
    return subjectMarks;
  }

  public int calculateGradeAverage()
  {
    int gradeTotal = 0;
    int gradeAverage = 0;

    for(int i = 0 ; i < 10 ; i++)
    {
      gradeTotal += subjectMarks.get(i);
    }

    gradeAverage = gradeTotal / 10;

    return gradeAverage;

  }

  public char assignGrade()
  {
   int avGrade = calculateGradeAverage();

   if (avGrade >= 80)
   {
    return 'A';
   }
   else if (avGrade >= 70)
   {
    return 'B';
   }
   else if (avGrade >= 60)
   {
    return 'C';
   }
   else if (avGrade >= 50)
   {
    return 'D';
   }
   else if (avGrade >= 40)
   {
    return 'E';
   }
   else
   {
    return 'F';
   }
  }


}
