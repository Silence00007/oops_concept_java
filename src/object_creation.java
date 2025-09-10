import java.sql.SQLOutput;
class  company{
    String COMPANYNAME;
    int Total_Employee;
    int Total_Department;
    int Maximum_salary;
    int Minimum_salary;
    String Regards;

    void Greetings(){
        System.out.println("Good Morning Every One, I am representing the Company details");
    }
void compprint(){
    System.out.println("Name of the Company is : "+ COMPANYNAME);
    System.out.println("Total number of the Employee of the " +COMPANYNAME+ " " +Total_Employee );
    System.out.println("Total number of the Department of the Company " +COMPANYNAME+ " " +Total_Department);
    System.out.println("The Maximum salary of the " +COMPANYNAME+ " is " +Maximum_salary);
    System.out.println("The Minimum Salary of the " +COMPANYNAME+ " is " + Minimum_salary);
    System.out.println("The Greeting used in the " +COMPANYNAME+ " is " +Regards);
}
}
public class object_creation {

    public static void main (String args[])
    {
        company com =new company();
        com.COMPANYNAME= "Rings";
        com.Total_Department=4;
        com.Minimum_salary= 10000;
        com.Maximum_salary=100000;
        com.Total_Employee=400;
        com.Regards= "RAM RAM JI";
        com.Greetings();
        com.compprint();


    }

}
