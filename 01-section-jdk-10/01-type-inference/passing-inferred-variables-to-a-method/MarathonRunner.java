
/**
 * @author  Rafael Barros
 */

public interface MarathonRunner {
    default void run() { 
        System.out.println("I'm a marathon runner"); 
    }
}