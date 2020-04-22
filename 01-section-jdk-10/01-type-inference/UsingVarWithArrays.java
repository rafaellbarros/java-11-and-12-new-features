
/**
 * @author  Rafael Barros 
 */

public class UsingVarWithArrays {

    public static void main(String[] args) {
        char name0[] = {'S', 't', 'r', 'i', 'n', 'g'};

        // var name1[] = {'S', 't', 'r', 'i', 'n', 'g'}; // not compile
        // var[] name2 = {'S', 't', 'r', 'i', 'n', 'g'}; // not compile
        //var name3 = {'S', 't', 'r', 'i', 'n', 'g'}; // not compile

        var name4 = new char[]{'S','t','r','i','n','g'};
    }

}    