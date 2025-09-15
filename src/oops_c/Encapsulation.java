package oops_c;

public class Encapsulation {
    /*static int x;
    static int y;*/
    private  int a;
    private double b;
    private String name;
    private int salary;

    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary (){
        return salary;
    }
    public void seta(int a) {
        this.a=a;
    }
    public int geta(){
        return a;
    }

    public void setb (double b){
        this.b=b;
    }
    public double getb(){
        return b;
    }

    public static void main (String args [])
    {
        System.out.println("welcome to the Encapsulation");
        /* x=10;
        y=100;
        	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}


        System.out.println( "alph  " +(x+y));*/

        Encapsulation E=new Encapsulation();
        E.seta(10);
        E.setb(500.50);
       int g= E.geta();
        System.out.println("get of a :" +g);
        System.out.println("getting of b : "+ E.getb());
        E.setname("Scotty");
        E.setSalary(500000);
        System.out.println("the name of the user is : " +E.getname());
        System.out.println("the salary of the user is : " +E.getSalary());

    }
}
