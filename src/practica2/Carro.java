package practica2;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Carro extends Thread {

    Viajes viaje;
    Rectangle rec_muro, rec_carro;
    int PosXCarro;

    public Carro(Viajes my_viaje, int posX) {
        this.viaje = my_viaje;
        this.PosXCarro = posX;
        this.rec_carro = this.viaje.lblCarro.getBounds();
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
                    this.viaje.lblCarro.setLocation(this.PosXCarro, this.viaje.lblCarro.getY());
                    this.rec_carro = this.viaje.lblCarro.getBounds();
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
