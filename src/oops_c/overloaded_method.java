package oops_c;


class method {
    static void m1(int x, int y) {
        System.out.println("total number of student is :" + (x + y));
    }
    static  void m1(int x){
        System.out.println("total number of teacher is : " +x);
    }
    void m1(double x){
        System.out.println("Average height of the student is : " +x);
    }
    void m1(double x,int y) {
        System.out.println("Average salary of the teacher :" +(x+y));
    }
}


public class overloaded_method {
    static void m1(int a) {
        System.out.println("Method one is: " +a);
            }
    void m2 (String z) {
        System.out.println("i love you like : " +z );
    }

    public static void main (String args[])
    {
        System.out.println("Polymarphisum method overloding");
        m1(10);
        method.m1(30,40);
        method.m1(15);
        method M=new method();
        M.m1(5.2);
        M.m1(25000.90,15000);
        overloaded_method om=new overloaded_method();
        om.m2("kittu baby");

    }




}
