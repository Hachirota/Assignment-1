public class Assignment1
{
  public static String BestStudent(Undergraduate [] s){
    String BestStudentName = s[0].returnName();
    int BestStudentMark = s[0].calculateGradeAverage();
    for(int i = 0 ; i < 20 ; i++){
      int BestCheck = s[i].calculateGradeAverage();
      if(BestCheck < BestStudentMark){
        BestStudentMark = BestCheck;
        BestStudentName = s[i].returnName();
      }
    }
    return BestStudentName;
  }

  public static void BestStudentPerStream(Undergraduate [] s){
    String BestStudentNameDA = "";
    int BestStudentMarkDA = 0;
    String BestStudentNameDM = "";
    int BestStudentMarkDM = 0;
    String BestStudentNameSA = "";
    int BestStudentMarkSA = 0;
    String BestStudentNamePr = "";
    int BestStudentMarkPr = 0;

    for (int i = 0 ; i < 20 ; i++){
      if(s[i].getStream() == "Data Analytics"){
        if(s[i].calculateGradeAverage() > BestStudentMarkDA){
          BestStudentNameDA = s[i].returnName();
          BestStudentMarkDA = s[i].calculateGradeAverage();
        }
      }
      else if(s[i].getStream() == "Database Management"){
        if(s[i].calculateGradeAverage() > BestStudentMarkDM){
          BestStudentNameDM = s[i].returnName();
          BestStudentMarkDM = s[i].calculateGradeAverage();
        }
      }
      else if(s[i].getStream() == "System Administration"){
        if(s[i].calculateGradeAverage() > BestStudentMarkSA){
          BestStudentNameSA = s[i].returnName();
          BestStudentMarkSA = s[i].calculateGradeAverage();
       }
      }
      else if(s[i].getStream() == "Programming"){
        if(s[i].calculateGradeAverage() > BestStudentMarkPr){
          BestStudentNamePr = s[i].returnName();
          BestStudentMarkPr = s[i].calculateGradeAverage();
        }
     }
   }
  System.out.println(BestStudentNameDA);
  System.out.println(BestStudentNameDM);
  System.out.println(BestStudentNameSA);
  System.out.println(BestStudentNamePr);


 }

 public static void GradeWarnings(Undergraduate [] s){
   for (int i = 0 ; i < 20 ; i++){
     if (s[i].assignGrade() == 'F'){
       s[i].gradeWarning();
       System.out.format("Student %s has a failing GPA", s[i].getInitials());
     }
   }
 }

  public static void main(String[] args)
  {
    String [] namesList = {"Carl Boyle", "Mark O'Neill","Amy Byrne",
    "David Finn","Terence Johnson","Sarah Davidson","Meadbh O'Sullivan",
    "Lucy Wilson","Chris Smith","John Flynn","Dean Conroy","Marc Andrews",
    "Stephen Iverson","Calvin Johnson","Tom Brady","Steve Smith",
    "Megan O'Connor","Susan Fitzgerald","Ian Curran","Una Leary"};

    int [] idList = {989206607, 900282901, 906386748, 978668118, 969815228,
      961623620, 916154903, 981342434, 918820247, 914102757, 958660915,
      931507209, 971874038, 967105264, 951381878, 926045267, 929529633,
      984846881, 934197092, 928927654};

    String [] courseList = {
      "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249"
      , "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249",
      "DT249", "DT249", "DT249", "DT249", "DT249"};

    int [] yearList = {
      2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

    boolean [] statusList = {true, true, true, true, true, true, true, true,
      true, true, true, true, true, true, true, true, true, true, true, true};

    int [][] gradesList = {
      {45, 60, 89, 50, 56, 70, 74, 65, 20, 56},
      {30, 60, 10, 30, 73, 70, 74, 65, 20, 76},
      {30, 60, 10, 30, 72, 70, 74, 65, 20, 81},
      {30, 60, 10, 30, 32, 70, 74, 65, 20, 70},
      {30, 60, 10, 30, 15, 70, 74, 65, 20, 54},
      {30, 60, 10, 30, 89, 70, 74, 65, 20, 58},
      {30, 60, 10, 30, 90, 70, 74, 65, 20, 69},
      {30, 60, 10, 30, 56, 70, 74, 65, 20, 45},
      {30, 60, 10, 30, 66, 70, 74, 65, 20, 78},
      {30, 60, 10, 30, 54, 70, 74, 65, 20, 32},
      {30, 60, 10, 30, 87, 70, 74, 65, 20, 67},
      {30, 60, 10, 30, 93, 70, 74, 65, 20, 78},
      {30, 60, 10, 30, 78, 70, 74, 65, 20, 74},
      {30, 60, 10, 30, 32, 70, 74, 65, 20, 10},
      {30, 60, 10, 30, 81, 70, 74, 65, 20, 10},
      {30, 60, 10, 30, 56, 70, 74, 65, 20, 10},
      {30, 60, 10, 30, 91, 70, 74, 65, 20, 10},
      {30, 60, 10, 30, 67, 70, 74, 65, 20, 10},
      {0, 0, 1, 0, 3, 0, 4, 5, 0, 0},
      {30, 60, 70, 70, 70, 70, 74, 65, 80, 90}
    };

    String [] streamList = {"Data Analytics", "Database Management",
    "System Administration", "Programming","Data Analytics",
    "Database Management", "System Administration", "Programming",
    "Data Analytics", "Database Management", "System Administration",
    "Programming","Data Analytics", "Database Management",
    "System Administration", "Programming","Data Analytics", "Database Management",
    "System Administration", "Programming","Data Analytics"};

    String [] topicList = {"Information Studies in Organisations",
    "Evaluation of Database Design Approaches","Abundant-data Applications"
    ,"","","","","","","","","","","","","","","","",""};


   Undergraduate[] Undergradarray = new Undergraduate[20];

   for(int i = 0 ; i < 20; i++)
   {
     Undergradarray[i] = new Undergraduate(namesList[i], idList[i], courseList[i], yearList[i], statusList[i], gradesList[i], streamList[i], topicList[i]);
   }

   System.out.println(BestStudent(Undergradarray));
   BestStudentPerStream(Undergradarray);
   GradeWarnings(Undergradarray);

  }
}
