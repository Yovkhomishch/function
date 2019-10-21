import javax.swing.*;
import java.awt.*;

/**
 * Created by igor on 1/13/19
 *
 * @author Yovkhomishch I.A.
 */
public class Function extends JPanel {


    int sw = 1;
    int k = 0;
    int j = 10;
    int b = 0;
    int a = 1;
    int a1 = 1;
    int b1 = 0;
    int c = 0;


    void paintPole(Graphics gh) {
        Graphics2D drp = (Graphics2D) gh;
        int y = 10;
        int x = 0;


        drp.drawLine(350, 0, 350, 700);
        drp.drawLine(0, 350, 700, 350);


        drp.drawLine(350, 0, 347, 7);
        drp.drawLine(350, 0, 353, 7);
        drp.drawLine(700, 350, 693, 347);
        drp.drawLine(700, 350, 693, 353);

        drp.drawString("Y", 340, 20);
        drp.drawString("X", 685, 365);
        drp.drawString("0", 352, 361);

        for (int i = 0; i < 70; i++) {
            drp.drawLine(348, y, 352, y);
            drp.drawLine(x, 348, x, 352);

            y += 10;
            x += 10;
        }


    }


    void funcLine(Graphics drp) {
        Graphics2D drp1 = (Graphics2D) drp;


        drp1.drawLine(0 + (k * 10), 710 - j + (b * 10), 700 - (k * 10), 10 - j + (b * 10));


    }


    void funcPar(Graphics drp) {
        Graphics2D drp1 = (Graphics2D) drp;


        int b2 = (int) Math.sqrt((int) Math.pow((double) b1, 2));

        int x1 = 350 - (b1 * 10);
        int x2 = 350 - (b1 * 10);
        int y1 = (350 + (-c * 10)) + (b2 * 10);
        int y2 = 0;


        while (x1 < 700 && y1 > 0) {


            drp1.drawLine(x1, y1, x1 - (y2 + 1), (int) (y1 - (a * (Math.pow(y2, 2)))));
            drp1.drawLine(x2, y1, x2 + (y2 + 1), (int) (y1 - (a * (Math.pow(y2, 2)))));
            y1 -= ((a * (Math.pow(y2, 2))));
            x1 -= (y2 + 1);
            x2 += (y2 + 1);
            y2++;
        }
    }

    void funcStep(Graphics drp) {
        Graphics2D drp1 = (Graphics2D) drp;
        int x = 350;
        int y = 350;
        int step = 0;


        while (x < 700 && y > 0) {

            drp1.drawLine(x, y, (int) (x + (a1 * (Math.pow(step, 2)))), (y - (step + 1)));
            x += (a1 * (Math.pow(step, 2)));
            y -= (step + 1);
            step++;

        }
    }

    public void paint(Graphics g) {
        super.paint(g);


        switch (sw) {
            case 1:
                paintPole(g);
                funcLine(g);

                break;

            case 2:
                paintPole(g);
                funcPar(g);

                break;

            case 3:
                paintPole(g);
                funcStep(g);

                break;
        }
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getK() {
        return k;
    }


    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getSw() {
        return sw;
    }

    public void setSw(int sw) {
        this.sw = sw;
    }
}
