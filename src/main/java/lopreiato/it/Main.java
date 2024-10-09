package lopreiato.it;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        ServerSocket ss = new ServerSocket(5637);

        Socket mySocket = ss.accept(); //istruzione bloccante (in attesa di un collegamento, se qualcuno si collega ritorna un socket)

        System.out.println("Qualcuno si è collegato");
    }
}