package oops_c;

class comp {
    void employe(){
        System.out.println("Hello welcome to the Single Inheritance");}
    void  zing (){
        System.out.println("class comp has been extended by the class Inheritance ");
    }
    static  void love(){
        System.out.println("This is the static method of LOVE ");
    }

        }

public class Inheritance extends comp {

    public static void main (String args[]) {

        System.out.println("--------------------------------------------------------------");
        System.out.println("here we will learn inheritance ans its type");
        System.out.println("--------------------------------------------------------------");
        System.out.println("1. single inherirance");
        System.out.println("--------------------------------------------------------------");
        System.out.println("2. multilevel inheritance");
        System.out.println("--------------------------------------------------------------");
        System.out.println("3. heriracy inheritance");
        System.out.println("--------------------------------------------------------------");
        System.out.println("4. Multiple inheitance");
        System.out.println("--------------------------------------------------------------");
        Inheritance I=new Inheritance();
        I.employe();
        I.zing();
        love(); /*this is a static method and present in the another class but can access it
        without class name, because the class comp extended to the Inheritance class so  all the
        methods are come into the class Inheritance */
    }
}
