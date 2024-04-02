package practica2;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Carro3 extends Thread{
    Viajes viaje;
    Rectangle rec_muro, rec_carro;
    int PosXCarro;

    public Carro3(Viajes my_viaje, int posX) {
        this.viaje = my_viaje;
        this.PosXCarro = posX;
        this.rec_carro = this.viaje.lblCarro3.getBounds();
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
                    this.viaje.lblCarro3.setLocation(this.PosXCarro, this.viaje.lblCarro3.getY());
                    this.rec_carro = this.viaje.lblCarro3.getBounds();
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
