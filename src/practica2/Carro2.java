package practica2;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Carro2 extends Thread {

    Viajes viaje;
    Rectangle rec_muro, rec_carro;
    int PosXCarro;

    public Carro2(Viajes my_viaje, int posX) {
        this.viaje = my_viaje;
        this.PosXCarro = posX;
        this.rec_carro = this.viaje.lblCarro2.getBounds();
        this.rec_muro = this.viaje.lblMuro.getBounds();
    }

    private volatile boolean running = true;

    public void run() {
        try {
            while (running) {

                sleep(250);
                if (this.rec_muro.intersects(this.rec_carro)) {
                    stopThead();
                } else {
                    this.PosXCarro += 20;
                    this.viaje.lblCarro2.setLocation(this.PosXCarro, this.viaje.lblCarro2.getY());
                    this.rec_carro = this.viaje.lblCarro2.getBounds();
                    this.viaje.repaint();
                }

            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void stopThead() {
        this.running = false;
    }
}
