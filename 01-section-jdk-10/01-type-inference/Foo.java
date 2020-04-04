

/**
 * @author  Rafael Barros
 */

public class Foo {

    public static void main(String[] args) {
        try {
            char[] name = new char[]{'S','t','r','i','n','g'};
            for (var c : name) {
                System.out.println(c + ":" + (c + 1 - 1));
            }
       // } catch (var e) {    // 'var' is not allowed here - The 'var' type can't be used to specify the types of exceptions in the 'catch' handler,
         } catch (Exception e) {
            e.getStackTrace();
        }
    }
}