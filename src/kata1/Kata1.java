
package kata1;

import java.util.Date;

public class Kata1 {
    
    public static void main(String[] args) {
        Person pau = new Person("Pau", new Date(87,3,10));
        System.out.println(pau.getName());
        System.out.println(pau.getAge());
                
    }
    
}
