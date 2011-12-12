import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by IntelliJ IDEA.
 * User: snad
 * Date: Dec 11, 2011
 * Time: 9:24:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class TaskExecutionWebServer {
    private static final int NUMBER_OF_THREADS = 100;
    private static final Executor exec = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
    

    public static void execute(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(80);
        while(true) {
            final Socket connection = socket.accept();
            Runnable task = new Runnable() {
                public void run() {
                    handleRequest(connection);
                }


            };
            exec.execute(task);
        }
    }

    private static void handleRequest(Socket connection) {
    }
}

// modify implementation to thread per task or single threaded
//
//public class ThreadPerTaskExecutor implements Executor {
//    public void execute(Runnable r) {
//        new Thread(r).start();
//    }
//}
//
//public class SingleThreadTaskExecutor implements Executor {
//    public void execute(Runnable r) {
//        r.run();
//    }
//}
