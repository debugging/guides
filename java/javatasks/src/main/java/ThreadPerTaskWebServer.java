import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by IntelliJ IDEA.
 * User: snad
 * Date: Dec 11, 2011
 * Time: 9:15:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class ThreadPerTaskWebServer {

    /**
     * thread per request
     *
     * @param args
     * @throws java.io.IOException
     */
    public static void execute(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(80);
        while (true) {
            final Socket connection = socket.accept();
            Runnable task = new Runnable() {
                public void run() {
                    handleRequest(connection);
                }
            };
        }
    }

    private static void handleRequest(Socket connection) {

    }

}
