import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * @author  Rafael Barros 
 */

public class TypeInferenceWithVar2 {
    public static void main(String[] args) {

        var name = "Java Everywhere";            // variable 'name' inferred as String
        var dateTime = LocalDateTime.now();      // variable 'dateTime' inferred as LocalDateTime

        var map = new HashMap<Integer, String>(); 

        System.out.println(name);
        System.out.println(dateTime);
    }
}