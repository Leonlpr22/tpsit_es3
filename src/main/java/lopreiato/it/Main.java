package lopreiato.it;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
       
        ServerSocket ss2 = new ServerSocket(5637);

        do{
            Socket s = ss2.accept();
            MyThread t = new MyThread(s);
            t.start();
        } while(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* 
        
        System.out.println("Server in avvio!");

        ServerSocket ss = new ServerSocket(5637);

        Socket s = ss.accept(); //istruzione bloccante (in attesa di un collegamento, se qualcuno si collega ritorna un socket)

        System.out.println("Un client si è collegato");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        String stringaRicevuta = in.readLine();
        System.out.println("La stringa ricevuta:" + stringaRicevuta);

        String stringaMaiuscola = stringaRicevuta.toUpperCase();
        out.writeBytes(stringaMaiuscola + '\n');

        s.close();
        ss.close();
        */
    }
}