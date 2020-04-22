import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Rafael Barros
 */

public class Pen implements Comparable<Pen> {  

    String name;   
    double price;   
    
    public Pen(String name, double price) {   
        this.name = name;   
        this.price = price;   
    }   
    
    public int compareTo(Pen pen) {   
        return ((int)(this.price - pen.price));   
    }   
    
    public String toString() {   
        return name;   
    }   
   
    public static void main(String   args[]) {   
        var pen1 = new Pen("Lateral",   219.9);   
        var pen2 = new Pen("Pinker",   19.9);   
        var pen3 = new Pen("Simplie",   159.9);   

        var penList = new ArrayList<Pen>();
        penList.add(pen1);
        penList.add(pen2);
        penList.add(pen3);
   
        // var penList = List.of(pen1, pen2,   pen3);   // not compile list imutable
   
        Collections.sort(penList);   
        for (var a : penList) System.out.println(a);   
    }   
}