
/**
 * @author  Rafael Barros
 */

public class Test {
    public static void main(String[] args) {
        var obj = new Child();
        obj.whistle();
        obj.stand(); // type of obj inferred as Child
    }
}