public class carlBoyle
{


  public static void main(String[] args)
  {
   int[] gradesIn = {30, 60, 10, 30, 10, 70, 74, 65, 20, 10};
   Undergraduate cboyle = new Undergraduate("Carl Boyle", 123456789, "DT249", 2, "Registered", gradesIn, "Data Analytics", "Information Studies in Organisations");
   //cboyle.setStudentName("Carl Boyle");
   //cboyle.setStudentID(123456789);
   //cboyle.setCourse("DT249");
   //cboyle.setYear(2);
   //cboyle.setStatus("Registered");
   //cboyle.setInitials();
   //for(int i = 0 ; i < 10 ; i++)
   //{
     //cboyle.addMark(gradesIn[i]);
   //}


   System.out.println(cboyle.returnName());
   System.out.println(cboyle.returnID());
   System.out.println(cboyle.returnCourse());
   System.out.println(cboyle.returnYear());
   System.out.println(cboyle.returnStatus());
   for(int i = 0 ; i < 10 ; i++)
   {
     System.out.println(cboyle.returnGrade(i));
   }

   System.out.println(cboyle.assignGrade());
   cboyle.gradeWarning();
   System.out.println(cboyle.getInitials());
  }


}
