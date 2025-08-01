import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        System.out.println("Connected to server!");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        String msgToServer, msgFromServer;
        while (true) {
            System.out.print("You: ");
            msgToServer = userInput.readLine();
            out.println(msgToServer);
            if (msgToServer.equalsIgnoreCase("exit")) break;

            msgFromServer = in.readLine();
            System.out.println("Server: " + msgFromServer);
        }

        socket.close();
    }
}