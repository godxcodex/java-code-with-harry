package simple_math;

public class gcd {
    public static void main(String[] args) {
        int x = 24;
        int y = 15;
        while(x%y !=0){
            int remindre = x%y;
            x = y;
            y = remindre;
        }
        System.out.println(y);
    }
}
