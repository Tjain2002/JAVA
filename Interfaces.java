
import java.util.*;
interface i1{


public void read();
public void write();

    
}


public class Interfaces implements i1 {
 
    public void read()
    {
System.out.println("write");
    }
    public void write()
    {
System.out.println("write");
    }


public static void main(String[] args) {
    
    Interfaces i2=new Interfaces();
    i2.read();

    i2.write();
    
}

    
}
