package oopm_in_java.inheritance;
class Papa{
Papa(){
    System.out.println("hi i am 1st constructor");
}
Papa(int x){
    System.out.println("hi i am "+ x);
}
}
class Bacha extends Papa{
    Bacha(int x, int y,int z){
    super(x);
    System.out.println("i am child bacha of papa class with x :"+x +"and y :"+y +" " +z );
    
    }
}
class Bacha1 extends Bacha{
    Bacha1(int x,int y,int z){
        super(x, y,z);
        System.out.println("hi "+ x+" "+" "+ y );
    }
}
public class video46_part4 {
    public static void main(String[] args) {
        Bacha1 bacha = new Bacha1(22, 33,26);
    }
    
}
