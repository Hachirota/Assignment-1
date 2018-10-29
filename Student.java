import java.util.ArrayList;

public class Student implements CalculateGrade
{
  // instance variables
  protected String studentName;
  protected int studentID;
  protected String course;
  protected int year;
  protected boolean registrationStatus;
  protected ArrayList<Integer> subjectMarks;

  // constructor
  Student ()
 {

 }

  // Set methods for instance variables
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

  //Get methods for instance variables
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
  //Method to calculate average grade
  public int calculateGradeAverage()
  {
    int gradeTotal = 0;
    int gradeAverage = 0;
    //for loop iterates over array of subject marks and totals them
    for(int i = 0 ; i < 10 ; i++)
    {
      gradeTotal += subjectMarks.get(i);
    }
    // calculate average mark
    gradeAverage = gradeTotal / 10;
    // return average mark
    return gradeAverage;

  }
  // method to assign grade based on average mark
  public char assignGrade()
  {
    // call method to calculate average
   int avGrade = calculateGradeAverage();
   //if statement assigns grade based on calculated average
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
