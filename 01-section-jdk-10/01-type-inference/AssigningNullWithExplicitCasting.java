
public class AssigningNullWithExplicitCasting {

    public static void main(String[] args) {
        var name = (String)null;             // Code compiles
        System.out.println(name);
    }
}