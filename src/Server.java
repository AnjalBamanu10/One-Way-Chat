import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept();
        System.out.println("New client connected");


        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream, true);

      while(true){
          System.out.print("Enter your message: ");
          Scanner scanner = new Scanner(System.in);
          String message = scanner.nextLine();
          printWriter.println(message);
      }


    }
}