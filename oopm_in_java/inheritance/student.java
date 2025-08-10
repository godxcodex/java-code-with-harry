package oopm_in_java.inheritance;

public class student {
    public static void change(Studentclass s){
        s.name = "Sameeksha";
    }
    public static void main(String[] args) {
        Studentclass st = new Studentclass();
        st.name = "Siddharth";
        System.out.println(st.name);
        change(st);
        System.out.println(st.name);
    }
    
}
