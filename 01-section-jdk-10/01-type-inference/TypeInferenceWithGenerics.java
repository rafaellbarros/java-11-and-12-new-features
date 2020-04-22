import java.util.ArrayList;
import java.util.List;

/**
 * @author Rafael
 */

public class TypeInferenceWithGenerics {

    public static void main(String[] args) {
        List<String> names0 = new ArrayList<>();

        var names = new ArrayList<>(); 
        names.add(1); 
        names.add("Rafael"); 
        names.add(10.9); 
        names.add(true);

        names.forEach(System.out::println);
    }

}