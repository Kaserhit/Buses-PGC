package servidor;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Time implements Runnable {

    String hora, minutos, segundos, ampm, time;
    Calendar calendario;
    Thread h1;

    public Time() {
        h1 = new Thread(this);
        h1.start();
    }

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        
        Capturador();
        
        while (ct == h1) {
            TimeTransform();
        }
    }

    public void Capturador() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
        
        time = (hora + ":" + minutos + ":" + segundos + " " + ampm);
    }
    
    public void TimeTransform(){
        int Thora, Tminutos, Tsegundos;
        
        Thora = Integer.parseInt(hora);
        Tminutos = Integer.parseInt(minutos);
        Tsegundos = Integer.parseInt(segundos);
        
        if (Tsegundos > 59) {
            Tsegundos = 0;
            if (Tminutos > 59) {
                Thora++;
                if (Thora < 24) {
                    Tminutos = 0;
                }
            }else {
                Tminutos++;
            }
        } else {
            try {
                Tsegundos++;
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (Tsegundos < 10) {
            segundos = "0" + Integer.toString(Tsegundos);
        }else {
            segundos = Integer.toString(Tsegundos);
        }
        if (Tminutos < 10) {
            minutos = "0" + Integer.toString(Tminutos);
        }else {
            minutos = Integer.toString(Tminutos);
        }
        if (Thora < 10) {
            hora = "0" + Integer.toString(Thora);
        }else {
            hora = Integer.toString(Thora);
        }
        
        time = (hora + ":" + minutos + ":" + segundos + " " + ampm);
    }
}
