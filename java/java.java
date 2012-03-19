#conversions
Integer.toString(i)
new Integer(i).toString()

#loops

for(Entry<String, String> entry : request.getParameters().entrySet()) {

}


#enum
public enum SomeType {
    Name1,
    Name2,
    Name3
}

#exceptions
try {

}
catch(Exception ex) {
}
finally {
}

#resources
InputStream input = getClass().getResourceAsStream(resource);
BufferedReader reader = new BufferedReader(new InputStreamReader(input));

// properties
ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
InputStream input = classLoader.getResourceAsStream("/a.properties");
Properties prop = new Properties();
prop.load(input);
prop.getProperty("key");

#oop
public interface MyInterface {
  public void someMethod(String key);
  public void someMethod2(String key)
      throws MyException, MyException2;
}
public class MyCLient extends BaseClient implements MyInterface {


}

#patterns

// singleton
public enum MySingleton {
  INSTANCE;
  
  private int someThing;
  private MySingleton() {
  
  }
  // getters/setters
}


#logging
private static Log log = LogFactory.getLog(SomeClass.class);
private static final logger = LoggerFactory.getLogger(SomeClass.class);


