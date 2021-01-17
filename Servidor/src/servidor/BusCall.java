package servidor;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BusCall {

    boolean status = true;

    BusConfig miHilo1;
    BusConfig miHilo2;
    BusConfig miHilo3;
    BusConfig miHilo4;
    BusConfig miHilo5;

    public BusCall() {
        String parada[] = {"Ciudad Derpotiva Hatillo", "Cementerio Obrero", "Ministerio Hacienda", "Escuela Juan Rafael Mora",
            "Frente ULACIT", "Betania", "ICE San Pedro", "Jardines de Cascajal", "Totto Outlet", "Liceo Edgar Cervantes"};

        System.out.println("Hilo principal iniciando.");

        try {
            miHilo1 = BusConfig.crearYComenzar("Bus 1", parada, 0);
            Thread.sleep(500);
            miHilo2 = BusConfig.crearYComenzar("Bus 2", parada, 2);
            Thread.sleep(500);
            miHilo3 = BusConfig.crearYComenzar("Bus 3", parada, 4);
            Thread.sleep(500);
            miHilo4 = BusConfig.crearYComenzar("Bus 4", parada, 6);
            Thread.sleep(500);
            miHilo5 = BusConfig.crearYComenzar("Bus 5", parada, 8);
        } catch (InterruptedException ex) {
            Logger.getLogger(BusCall.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            miHilo1.Bus.join();
            miHilo2.Bus.join();
            miHilo3.Bus.join();
            miHilo4.Bus.join();
            miHilo5.Bus.join();
        } catch (InterruptedException exc) {
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado");
        status = false;
    }
}
