import java.util.Scanner;

public class Main {
    int i;
    int a;
    boolean b;
    private Main(){
        i =5;
        System.out.println("Constructor is called");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main ojc = new Main();
        Main obj = new Main();
        System.out.println("Vlue of i: " + ojc.i);
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}