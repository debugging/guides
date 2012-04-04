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

// string to int(eger)
int x = Integer.parseInt("123");
Integer x = Integer.valueOf("123");

String s = String.valueOf(x);
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

#collections
- java.util
- List, Set, Queue, and Map

ArrayList list = new ArrayList();
ArrayList<User> users = new ArrayList<User>();
List<User> list = new ArrayList<User>();
List<User> list = new LinkedList<User>();
Collection<Integer> c = new ArrayList<Integer>();

Collection<Integer> c = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
c.addAll(Arrays.asList(6,7,8,9,10);
Collections.addAll(c, 11, 12, 13, 14, 15);

// where Type2, Type3, etc. inherit from BaseType
List<BaseType> l = Arrays.asList(new Type2(), new Type3()); // compiler complains
// explicit type arguement specification
// above works if you give a hint i.e.  Arrays.<BaseType>asList(....);
List<BaseType> l2 = new ArrayList<BaseType>();
l2.addAll(new Type2(), new Type3(), new Type4());  // compiles fine

// lists: ArrrayList, LinkedList
//        ArrayList - fast for random acess, slow insertions/removals to middle of list
//        LinkedList - fast sequential access, and insert/removals to middle of list
//                     slow random access
// sets: HashSet, TreeSet, LinkedHashSet
//       HashSet - fast retrieval
//       TreeSet - ascending comparison order
//       LinkedHashSet - inserted order

List
    .contains()
    .remove()
    .indexOf()
    .subList()
    .containsAll()
    .sort()
    .shuffle()
    .retainAll() // set intersection
    .set() // replaces
    .isEmpty()
    .clear()
    .toArray()

// iterator
List<Integer> list = new List<Integer>();
Iterator<Integer> it = list.iterator();
while(it.hasNext()) {
    Integer i = it.next();
}
// bidirectional iterator => listiterator
ListIterator<User> li = list.listIterator();
while(li.hasNext()) {
  it.next();
  it.nextIndex();
  it.previousIndex();
}

// LinkedList
    .getFirst() // doesn't remove element
    .element() // same as getFirst(), both throw NoSuchElementException if empty list
    .peek() // same as getFirst and element(), returns null if empty

    .removeFirst()
    .remove() // same as removeFirst()
    .poll() // same as remoteFirst/remove, returns null

    .addFirst // adds to beg. of list

    .offer()
    .add()
    .addLast() // all 3 add to tail/end of a list



    .addFirst // adds to beg. of list

    .offer()
    .add()
    .addLast() // all 3 add to tail/end of a list

    .removeLast()

// stack (lifo)
// holds unique objects
// TreeSet - sorted elements (red-black tree data structure)
Set<Integer> s = new HashSet<Integer>();
s.add(100);

SortedSet<Integer> ss = new TreeSet<Integer>(); // String.CASE_INSENSITIVE_ORDER
Collections.addAll(ss, "1 2 3 4 5".split(" "));
    .contains()
    .containsAll(otherSet);
    .remove()
    .removeAll


// Map
// maps objects to objects
Map<Integer, Integer> m = new HashMap<Integer, Integer>();
m.put(1, 100);

    .put("key", "value")
    .get("key")
    .containsKey()
    .containsValue

    .keySet() // set of keys
     // collection of values
     // set of k/v paairs

// Queue (fifo)
// linkedlist implements queue interface

Queue<Integer> q = new LinkedList<Integer>();
q.offer(10);
    .offer
    .peek .element
    .poll .remove

// PriorityQueue
// most important goes next
// default sort is natural order, override with own Comparator

PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
pq = new PriorityQueue<Integer>(10, Collections.reverseOrder());

// Collection -- foreach works for all collections
// Iterator - foreach works when implementing an interator
// AbstractCollection -- both collection and interator interfaces



List<Item> items() {
  return Arrays.asList(
    new Item("...")
  );
}

// concurrency
// thread - single sequential flow of control within a given process
//        - runnable interface describes the task the thread will run

public class SomeTask implements Runnable {
  public void run() {
    // ...
  }
}
SomeTask t = new SomeTask().run();  // running on main thread

// seperate thread
Thread t = new Thread(new SomeTask());
t.start();

// executors simplify concurrent programming, provide a layer for executing tasks
// builds context for runnable objects

ExecutorService es = Executors.newCachedThreadPool();
for(...)
    es.execute(new SomeTask());

es.shutdown(); // prevents new tasks from being submitted

    .newFixedThreadPool(10);
    .newSingleThreadExecutor() // single thread, if multiple tasks submitted, tasks will be serialized

// runnable doesn't return a value
// callable interface returns a value from method call()

class SomeTaskWithResult implements Callable<String> {
  public String call() {
    return "hello";
  }
}

public static void main(String[] args) {
  ExecutorService es = Executors.newCachedThreadPool();
  ArrayList<Future<String>> results = new ArrayList<Future<String>>();

  for(....)
      results.add(es.submit(new SomeTaskWithResult(x)));

  for(Future<String> f : results) {
    try {
      f.get(); // blocks till result
    }
    ..
    finally {
      es.shutdown();
    }
  }
}
  future#isDOne()
    .get() // blocks
    .get(timeout)

// thread sleeping
thread.sleep(100); // old style
TimeUnit.MILLISECONDS.sleep(100);

// thread doesn't do anything but drive the task.  
// tasks and threads should be thought of seperately
//

    t.join() // calling thread is suspended until t finishes i.e. t.isAlive() is false
    t.join(timeout) // will return if it doesn't respond in x milliseconds
    t.interrupt() // aborts join() call, flag is cleared in exception InterruptedException

// exceptions in threads
// blead into the main method, solved with executor



    // use CyclicBarrier instead of join()

#file io
File newFile = new File("filename");
boolean isCreated = newfile.createNewFile();

BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
writer.out("hello");
writer.close();

#trywithresource: http://www.oracle.com/technetwork/articles/java/trywithresources-401775.html

#guid
java.util.UUID.randomUUID();

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

<bean id="myBean" class="com.some.where" />
<bean id="myBean class="com.some.where"
      scope="singleton"
    >
    <constructor-arg value="5" />
    <constructor-arg ref="otherBean" />

</bean>

<bean id="myBean" class="..">
    <property name="prop1" value="value1" />
    <property name="bean1" ref="otherBean" />
</bean>

ApplicationContext ctx = new ClassPathXmlApplicationContext("/path/to/xml.xml");

Bean1 bean1 = (Bean1)ctx.getBean("bean1");

// inner beans
<property name="prop2">
  <bean class="com.some.bean" />
</property>

<constructor-arg>
    <bean class="com.some.bean" />
</constructor-arg>

::Scope
// default scope is singleton
prototype
request
session
global-session

::Lifecycle
// initialization and cleanup of bean lifecycle
init-method=""
destroy-method=""

// or have your bean implement InitializingBean and DisposableBean 
// interfaces, overriding afterPropertiesSet and destory() method

       

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
global search       Ctrl+F/Ctrl+R 
quick doc           ^J (control-J)

tomcat stop  command-f2

next line           shift + return
duplication line    cmd + d
code block start/end    cmd + [ (or ])
next word           option + right/left arrow

tests

