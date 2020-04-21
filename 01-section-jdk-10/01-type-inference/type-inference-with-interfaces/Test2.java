
public class Test2 {
    public static MarathonRunner getObject() { 
        return new Child(); 
    } 
    public static void main(String[] args) { 
        var obj = getObject();     // inferred type of var obj is 
                                   // MarathonRunner 
        // obj.whistle(); 
        // obj.stand(); 
        obj.run(); 
    }
}