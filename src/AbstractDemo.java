abstract class Fruits {
    abstract void taste();
}
class Apple extends Fruits{

    @Override
    void taste() {
        System.out.println("Sweet taste");
    }
}
public class AbstractDemo{
    public static void main(String[] args){
        Apple a=new Apple();
        a.taste();
    }
}