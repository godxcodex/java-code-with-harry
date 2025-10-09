package oopm_in_java;

public class DynamicMethodDespach {
    public static class Phone{
     void mm(){
        System.out.println("hi a am keypad nokiya");
     }   
    }
  public static class SmartPhone extends Phone{
    void ma(){
        System.out.println("hi am smartPhone");

    }
    @Override
    void mm(){
     System.out.println("samsung s24");
    }
  }
  public static void main(String[] args) {
    Phone ph = new SmartPhone();// refrence super class ka ha aur object subclass ka ha to ye kar sakta ho app 
    ph.mm();
  }
    
}
