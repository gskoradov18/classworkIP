import java.util.Scanner;

public class Main {
    String language;



    Main(String lang){
        language = lang;
        System.out.println(language + " Programming Language");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main obj1 = new Main("Java");
        Main obj2 = new Main("C");
        Main obj3 = new Main("Python");
    }
}