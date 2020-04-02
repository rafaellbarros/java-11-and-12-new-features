import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * @author  Rafael Barros 
 */

public class TypeInferenceWithVar1 {
    public static void main(String[] args) {
        
        String name = "Java Everywhere"; 
        LocalDateTime dateTime = LocalDateTime.now();
        
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        System.out.println(name);
        System.out.println(dateTime);
        
    }
}