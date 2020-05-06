import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Rafael Barros
 */

public class TypeInferenceInEarlierJavaVersions {

    void typeInferenceInJava5() {
        System.out.println("****** Type Inference In Java 5 ******");
        List<Integer> myListOfIntegers = Collections.<Integer>emptyList(); // old
        List<Integer> myListOfIntegers2 = Collections.emptyList(); // new
    }

    void typeInferenceInJava7() {
        System.out.println("****** Type Inference In Java 7 ******");
        List<String> myThings = new ArrayList<String>();

        List<String> myThings2 = new ArrayList<>();

        List<String> myThings3 = new ArrayList();

        MyClass<String> myClass = new MyClass<>();
        myClass.<Boolean>print(new Boolean("true"));
        myClass.print(new Boolean("true"));

    }

    public class MyClass<T> {
        public <X> void print(X x) {
            System.out.println(x.getClass());
        }
    }

    void typeInferenceInJava8() {
        System.out.println("****** Type Inference In Java 8 ******");
        Consumer<String> consumer = (String s) -> System.out.println(s);
        Consumer<String> consumer2 = s -> System.out.print(s);
    }

}