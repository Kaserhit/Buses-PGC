package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server implements Runnable {

    public static Scanner v = new Scanner(System.in);

    ServerSocket servidor = null;
    Socket sc = null;
    DataInputStream in;
    DataOutputStream out;

    //puerto de nuestro servidor
    final int PUERTO = 5000;

    String mensaje = "";

    Thread server;
    
    static int close = 0;
    static boolean stop = true;
    static boolean client = false;
    
    public Server() {
        server = new Thread(this);
        server.start();
    }

    @Override
    public void run() {
        
        BusConfig bc = null;
        
        try {
            //Creamos el socket del servidor

            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");

            //Siempre estara escuchando peticiones
            while (stop) {

                //Espero a que un cliente se conecte
                sc = servidor.accept();

                System.out.println("Cliente conectado");
                
                client = true;
                
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                do {

                    //Leo el mensaje que me envia
                    mensaje = in.readUTF();
                    System.out.println(mensaje);
                    
                    if (close == 5) {
                        out.writeUTF("False");
                    }
                    
                    if (mensaje.equals("False")) {
                        out.writeUTF("False");
                        sc.close();

                        System.out.println("Cliente desconectado");
                        client = false;
                    }
                } while (!mensaje.equals("False") || close != 5);
                stop = false;
            }
            server.stop();
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sendMessage (String Msg){
        try {
            out.writeUTF(Msg);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
