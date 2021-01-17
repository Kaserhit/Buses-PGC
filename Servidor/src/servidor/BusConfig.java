package servidor;

public class BusConfig implements Runnable {
    
    Time t = new Time();
    
    Thread Bus;
    
    String p[];
    
    int v = 0;
    int count;
    
    static String message = "";
    static String busName = "";
    
    static Server s = new Server();
    //Construye un nuevo hilo.

    BusConfig(String nombre, String parada[], int position) {
        p = parada;
        count = position;
        Bus = new Thread(this, nombre);
        busName = nombre;
    }

    //Un método de fábrica que crea e inicia un hilo.
    
    public static BusConfig crearYComenzar(String nombre, String parada[], int position) {
        BusConfig bc = new BusConfig(nombre, parada, position);
        bc.Bus.start(); //Inicia el hilo
        return bc;
    }

    //Punto de entrada de hilo.
    
    
    public void run() {
        System.out.println("El recorrido del " + Bus.getName() + " ha inciado.");
        for (int i = 0; i < 5; i++) {
            Rutas();
        }
        s.close++;
    }
    
    public void Rutas() {
        try {
            while (count < p.length) {
                Thread.sleep(5000);
                if (count < 9) {
                    message = Bus.getName() + ": " + t.time + " - Parada Actual: " + p[count] + " - Siguente Parada es: " + p[count + 1];
                    System.out.println(message);
                } else {
                    message = Bus.getName() + ": " + t.time + " - Parada Actual: " + p[count] + " - Siguente Parada es: " + p[0];
                    System.out.println(message);
                }
                synchronized(this){
                    if (s.client == true) {
                        s.sendMessage(message);
                    }
                }
                count++;
            }
            count = 0;
        } catch (InterruptedException exc) {
            System.out.println(Bus.getName() + " interrumpudo.");
        }
        System.out.println("El recorrido del " + Bus.getName() + " ha terminado.");
    }
}
