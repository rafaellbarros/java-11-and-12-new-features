

/**
 * @author  Rafael Barros
 */

public class Test {
    public static void main(String[] args) { 
        var obj = new Child();              // inferred type of var obj 
                                            // is Child 
        obj.whistle(); 
        obj.stand();                     
        obj.run(); 
    }
}