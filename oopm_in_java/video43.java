package oopm_in_java;
class Car{
    int engin;
    public void  set(int engin){
     this.engin = engin;

    }
    public int get(){
        return engin;
    }
}
public class video43 {
    public static void main(String[] args) {
        Car car = new Car();
        car.engin = 34;
    }
}
