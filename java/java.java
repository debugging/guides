#main
public class TestMain {
  public static void main (String[] args) {
    for (String s: args) {
      System.out.println(s);
    }
  }
}


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

#environment
import java.util.Map;
Map<String, String> env = System.getenv(); // env.keySet() env.get("key")
// ProcessBuilder
// ServiceLoader

#benchmark
long start = System.currentTimeMillis();
long end = System.currentTimeMillis();

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

#threading
ExecutorService es = ExecutorService.newFixedThreadPool(10);
for(int x = 0; x < 100; x++) {
  Runnable worker = new SomeClassImplementingRunnable(params);
  es.execute(worker);
}

es.shutdown();
while(!es.isTerminated()) {
}

#servlets
public class SomeServlet extends HttpServlet {
  public void doPost(HttpServletRequest request, 
          HttpServletResponse response)
            throws ServletException, IOException

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String param1 = request.getParameter("parma1");

    out.close();
}

// filter
@WebFilter(urlPatterns={"/path/*})
public final class MyFilter implements Filter {

  @Override
  public void init(FilterConfig config) throws ServletException {
    // app wide startup
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response,
          FilterChain chain) 
            throws IOException, ServletException {
    chain.doFilter(request, response);
  }

  @Override 
  public void destroy() {
    // app wide shutdown
  }
 }

#startup/shutdown 
@WebListener
public class ApplicationListener implements ServletContextListener {
  @Override
  public void contextInitialized(ServletContextEvent event) {
    // startup

    // app wide vars
    event.getServletContext().setAttribute("foo", foo);
    // retrieve using:  (Foo)getServletContext().getAttribute("foo");
    // jsp via ETL:  ${foo.getProperty1}
  }
  @Override
  public void contextDestroyed(ServletContextEvent event) {
    // shutdown
  }
}

#begin/end request

@WebListener
public class RequestListener implements ServletRequestListener {
  @Override
  public void requestInitialized(ServletRequestEvent event) {
    // request scoped vars
    event.getServletRequest().setAttribute("bar", bar);
    // retrieved via: (Foo) request.getAttribute("bar");
    // jsp etl: ${bar.getProperty1}
  }

  @Override
  public void requestDestroyed(ServletRequestEvent event) {
  
  }
}

#spring

@Controller
public class SomeController {
  @Autowired
  SomeService someService;

  @RequestMapping(value = "/some/url", method = RequestMethod.GET)
  @RequestBody
  public String action1(HttpServletRequest request, HttpServletResponse response) {
  
    return "";
  }
}

#jdbc
KeyHolder keyHolder = new GeneratedKeyHolder();
getJdbcTemplate().update(new preparedStatementCreator() {
  @Override
  public PreparedStatement createPreparedStatement(Connection connection) 
    throws SQLException {
    PreparedStatement ps = connection.preparedStatement(sql, new String[] {"id});

    ps.setInt(1, ..);

    return ps;
  }
},
keyHolder
};
return keyHolder.getKey().intValue();



#intellij idea
global search Ctrl+F/Ctrl+R 

