package oopm_in_java;

class Car {
    private int numberPlate;
    private String name;
     Car(){
        name ="bmw";
        numberPlate =24367;
    }
    public void setname( String k){
         name = k;
    }
    public String getName(){
       return name ;
    }
    public void SetNum(int numberPlate){
         this.numberPlate = numberPlate;
    }
    public int getNum(){
        return numberPlate;
    }
}
public class video40getter_setter {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getName());
        System.out.println(car.getNum());
        Car ca = new Car();
        ca.setname("Audi");
        System.out.println(ca.getName());
        System.out.println(ca.getNum());
        Car c = new Car();
        System.out.println(c.getName());
        c.SetNum(4569);
        System.out.println(c.getNum());
    }
    
}
