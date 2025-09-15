package oops_c;

class  secA{
    static void  SecAstu(){
        System.out.println("Hello we are students from the section A");

    }
    static void SecAavg(int a){
        System.out.println("Average Score of the student of the section A is : " +a);
    }
}

class  secB extends secA{
    static void  SecBstu(){
        System.out.println("Hello we are students from the section B");

    }
    static void SecBavg(int y){
        System.out.println("Average Score of the student of the section B is : " +y);
    }
}

class  secC extends secB {
    static Void SecCstu(){
        System.out.println("Hello we are students from the section C");
        return null;
    }
    static void SecCavg(int Z){
        System.out.println("Average Score of the student of the section C is : " +Z);
    }
}
class tenth extends secC {
    static void Ten(){
        System.out.println("Welcome to the class 10th ");
    }
}



public class milti_level_inheritance extends tenth{

    public static void main (String args [])
    {
        Ten();
        System.out.println("...............................................................");
      SecAstu();
      SecAavg(96);
        System.out.println("...............................................................");
      SecBstu();
      SecBavg(91);
        System.out.println("...............................................................");
      SecCstu();
      SecCavg(92);
        System.out.println("******************************************************************");


    }
}
