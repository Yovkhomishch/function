import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by igor on 3/6/19
 *
 * @author Yovkhomishch I.A.
 */
public class Driver extends JPanel implements ActionListener {
    private JButton ap, am, bp, bm, cp, cm, b1p, b1m, kp, km;
    private Button button;
    private JButton jb1, jb2, jb3, jb4, jb5;


    private Function function;


    public Driver(Button button, Function function) {
        this.button = button;
        this.function = function;

        ap = new JButton("+");
        am = new JButton("-");
        ap.addActionListener(this);
        am.addActionListener(this);

        bp = new JButton("+");
        bm = new JButton("-");
        bp.addActionListener(this);
        bm.addActionListener(this);

        cp = new JButton("+");
        cm = new JButton("-");
        cp.addActionListener(this);
        cm.addActionListener(this);

        b1p = new JButton("+");
        b1m = new JButton("-");
        b1p.addActionListener(this);
        b1m.addActionListener(this);

        kp = new JButton("+");
        km = new JButton("-");
        kp.addActionListener(this);
        km.addActionListener(this);

        jb1 = new JButton("a");
        jb2 = new JButton("b");
        jb3 = new JButton("c");
        jb4 = new JButton("b");
        jb5 = new JButton("k");

        jb4.setVisible(false);
        jb5.setVisible(false);
        jb1.setVisible(false);
        jb2.setVisible(false);
        jb3.setVisible(false);

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);

        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);
        add(jb5);
        add(ap);
        add(am);
        add(bp);
        add(bm);
        add(cp);
        add(cm);
        add(b1p);
        add(b1m);
        add(kp);
        add(km);

        b1p.setVisible(false);
        b1m.setVisible(false);
        kp.setVisible(false);
        km.setVisible(false);

        ap.setVisible(false);
        am.setVisible(false);
        bp.setVisible(false);
        bm.setVisible(false);
        cp.setVisible(false);
        cm.setVisible(false);


        button.getF1().addActionListener(this);
        button.getF2().addActionListener(this);
        button.getF3().addActionListener(this);

    }


    public void actionPerformed(ActionEvent e) {


        if (e.getSource().equals(button.getF1())) {

            cp.setVisible(false);
            cm.setVisible(false);
            bp.setVisible(false);
            bm.setVisible(false);
            ap.setVisible(false);
            am.setVisible(false);
            jb1.setVisible(false);
            jb2.setVisible(false);
            jb3.setVisible(false);
            jb4.setVisible(true);
            jb5.setVisible(true);

        }
        if (e.getSource().equals(jb4)) {
            b1p.setVisible(true);
            b1m.setVisible(true);
            km.setVisible(false);
            kp.setVisible(false);
            bp.setVisible(false);
            bm.setVisible(false);
            ap.setVisible(false);
            am.setVisible(false);
            cp.setVisible(false);
            cm.setVisible(false);

        }

        if (e.getSource().equals(b1p)) {
            function.setB(function.getB() + 1);
            function.repaint();
        }
        if (e.getSource().equals(b1m)) {
            function.setB(function.getB() - 1);
            function.repaint();
        }

        if (e.getSource().equals(jb5)) {
            b1p.setVisible(false);
            b1m.setVisible(false);
            km.setVisible(true);
            kp.setVisible(true);
            bp.setVisible(false);
            bm.setVisible(false);
            ap.setVisible(false);
            am.setVisible(false);
            cp.setVisible(false);
            cm.setVisible(false);


        }

        if (e.getSource().equals(kp)) {
            function.setK(function.getK() + 1);
            function.repaint();
        }
        if (e.getSource().equals(km)) {
            function.setK(function.getK() - 1);
            function.repaint();
        }
        if (e.getSource().equals(button.getF2())) {
            b1p.setVisible(false);
            b1m.setVisible(false);
            km.setVisible(false);
            kp.setVisible(false);
            cp.setVisible(false);
            cm.setVisible(false);
            bp.setVisible(false);
            bm.setVisible(false);
            ap.setVisible(false);
            am.setVisible(false);
            jb1.setVisible(true);
            jb2.setVisible(true);
            jb3.setVisible(true);
            jb4.setVisible(false);
            jb5.setVisible(false);

        }

        if (e.getSource().equals(jb1)) {
            km.setVisible(false);
            kp.setVisible(false);
            bp.setVisible(false);
            bm.setVisible(false);
            ap.setVisible(true);
            am.setVisible(true);
            cp.setVisible(false);
            cm.setVisible(false);
        }
        if (e.getSource().equals(ap)) {
            function.setA(function.getA() + 1);

            function.repaint();
        }
        if (e.getSource().equals(am)) {
            function.setA(function.getA() - 1);
            function.repaint();
        }

        if (e.getSource().equals(jb2)) {
            km.setVisible(false);
            kp.setVisible(false);
            b1p.setVisible(false);
            b1m.setVisible(false);
            bp.setVisible(true);
            bm.setVisible(true);
            ap.setVisible(false);
            am.setVisible(false);
            cp.setVisible(false);
            cm.setVisible(false);
        }
        if (e.getSource().equals(bp)) {
            function.setB1(function.getB1() + 1);
            function.repaint();
        }
        if (e.getSource().equals(bm)) {
            function.setB1(function.getB1() - 1);
            function.repaint();
        }

        if (e.getSource().equals(jb3)) {
            km.setVisible(false);
            kp.setVisible(false);
            b1p.setVisible(false);
            b1m.setVisible(false);
            bp.setVisible(false);
            bm.setVisible(false);
            ap.setVisible(false);
            am.setVisible(false);
            cp.setVisible(true);
            cm.setVisible(true);
        }
        if (e.getSource().equals(cp)) {
            function.setC(function.getC() + 1);
            function.repaint();
        }
        if (e.getSource().equals(cm)) {
            function.setC(function.getC() - 1);
            function.repaint();
        }

        if (e.getSource().equals(button.getF3())) {
            cp.setVisible(false);
            cm.setVisible(false);
            bp.setVisible(false);
            bm.setVisible(false);
            ap.setVisible(false);
            am.setVisible(false);
            jb1.setVisible(false);
            jb2.setVisible(false);
            jb3.setVisible(false);
            jb4.setVisible(false);
            jb5.setVisible(false);
        }


    }
}






