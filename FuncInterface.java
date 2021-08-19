package lovebabbar;

@FunctionalInterface
public interface FuncInterface {

    public void display();
    default void print(){
        System.out.println("print in funcInterface");
    }
    
    
}
