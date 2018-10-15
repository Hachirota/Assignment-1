public class Assignment1
{

  public static void main(String[] args)
  {
    String [] namesList = {"Carl Boyle", "Mark O'Neill"};
    int [] idList = {123456789, 125436789};
    String [] courseList = {
      "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249", "DT249"};

    int [] yearList = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    boolean [] statusList = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
    int [][] gradesList = {
      {30, 60, 10, 30, 10, 70, 74, 65, 20, 10},
      {30, 60, 70, 70, 70, 70, 74, 65, 80, 90}
    };
    String [] streamList = {"Data Analytics", "Database Management"};
    String [] topicList = {"Information Studies in Organisations", "Evaluation of Database Design Approaches"};


   Undergraduate[] Undergradarray;
   Undergradarray = new Undergraduate[2];

   for(int i = 0 ; i < 2 ; i++)
   {
     Undergradarray[i] = new Undergraduate(namesList[i], idList[i], courseList[i], yearList[i], statusList[i], gradesList[i], streamList[i], topicList[i]);
   }

   System.out.println(Undergradarray[1].returnName());
   System.out.println(Undergradarray[1].returnMarks());

  }
}
