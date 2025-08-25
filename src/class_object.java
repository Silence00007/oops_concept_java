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
        EMP1.ID= 001;
        EMP1.NAME="ALPHA_THANOS";
        EMP1.DEP= "PURCHASE";
        EMP1.GRADE="A+";

        EMP1.display();



    }



}
