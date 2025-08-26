 class student{
    int rollnum;
    String name;
    int cls;
    String section;
    String stutype;

     void stu(){
         System.out.println("details of the student is: " );
         System.out.println("Name of the student is : " +name);
         System.out.println("Roll number of the student is : " + rollnum);
         System.out.println("Class name of the student is : " +cls);
         System.out.println("Section of the student studied is  : " +section);
         System.out.println("Students study type eg:[good, poor, excelent] : " +stutype);

     }

}

public class class_object {
    public  static class employee {
        int ID;
        String NAME;
        String DEP;
        String GRADE;

        void display() {
            System.out.println("details of the employee :-");
            System.out.println("EMP ID : " + ID);
            System.out.println("EMP Name : " + NAME);
            System.out.println("EMP Department : " + DEP);
            System.out.println("EMP GRADE : " + GRADE);
        }
    }


    public static void main(String [] args)
    {
        employee EMP1 =new employee();
        EMP1.ID= 1;
        EMP1.NAME="ALPHA_THANOS";
        EMP1.DEP= "PURCHASE";
        EMP1.GRADE="A+";

        EMP1.display();
        System.out.println("------------------------------------------------------------------");

        student st1= new student();
        st1.name= "jimmy";
        st1.cls= 10;
        st1.rollnum=18;
        st1.section= "10B";
        st1.stutype= "Good";
        st1.stu();

        System.out.println("------------------------------------------------------------------");
        student st2= new student();
        st2.name= "jimmy_1";
        st2.cls= 20;
        st2.rollnum=13;
        st2.section= "20B";
        st2.stutype= "Good";
        st2.stu();

        System.out.println("------------------------------------------------------------------");

        employee EMP2 = new employee();
        //employee EMP2 =new employee();
        EMP2.ID =5;
        EMP2.NAME = "JACUB BSDK";
        EMP2.DEP = "DOCTOR";
        EMP2.GRADE= "A+";
        EMP2.display();



    }





}
