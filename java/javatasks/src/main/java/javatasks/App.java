package javatasks;

import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
          
        // guid
        UUID guid = java.util.UUID.randomUUID();
        
        System.out.println( "Hello World! " + guid );
    }
}
