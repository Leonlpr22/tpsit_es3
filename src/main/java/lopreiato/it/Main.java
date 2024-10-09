package lopreiato.it;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Server in avvio!");

        ServerSocket ss = new ServerSocket(5637);

        Socket mySocket = ss.accept(); //istruzione bloccante (in attesa di un collegamento, se qualcuno si collega ritorna un socket)

        System.out.println("Un client si è collegato");

        BufferedReader in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
        DataOutputStream out = new DataOutputStream(mySocket.getOutputStream());

        String stringaRicevuta = in.readLine();
        System.out.println("La stringa ricevuta:" + stringaRicevuta);

        String stringaMaiuscola = stringaRicevuta.toUpperCase();
        out.writeBytes(stringaMaiuscola + '\n');

        mySocket.close();
        ss.close();
    }
}