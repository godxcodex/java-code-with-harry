package oopm_in_java;
 class Sidd {
    public int m0(){
        return 3;
    }
    public void m1(){
      System.out.println("hi bro1");
    }

    
}
 class Oshi extends Sidd{
    @Override // when using function over riding // means name of method is same but at different classes and these classes are in realtionship
   public void m1(){
    System.out.println("hi my name is he he ");
   }
}

public class overriding {
    public static void main(String[] args) {
        Sidd si = new Sidd();
        si.m1(); 
        
        Oshi os = new Oshi ();
        os.m1();
    }
    
}
