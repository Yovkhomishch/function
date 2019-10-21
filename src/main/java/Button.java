import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by igor on 2/28/19
 *
 * @author Yovkhomishch I.A.
 */
public class Button extends JPanel implements ActionListener {

    private JButton f1, f2, f3, ex;
    private ButtonGroup buttonGroup;

    public JButton getF1() {
        return f1;
    }

    public JButton getF2() {
        return f2;
    }

    public JButton getF3() {
        return f3;
    }

    private Function function;

    public Button(Function f) {
        setLayout(new FlowLayout());
        function = f;
        //driver = new Driver();
        f1 = new JButton("y = kx + b");
        f2 = new JButton("y = ax^2 + bx + c");
        f3 = new JButton("y = √ ax + b ");
        ex = new JButton("Exit");

        buttonGroup = new ButtonGroup();
        f1.addActionListener(this);
        f2.addActionListener(this);
        f3.addActionListener(this);
        ex.addActionListener(this);

        buttonGroup.add(f1);
        buttonGroup.add(f2);
        buttonGroup.add(f3);
        buttonGroup.add(ex);
        add(f1);
        add(f2);
        add(f3);
        add(ex);


        //f.add(p,BorderLayout.SOUTH);


    }

    public void actionPerformed(ActionEvent e) {


        if (e.getSource().equals(f1)) {

            function.setSw(1);
            function.setA(1);
            function.setB1(0);
            function.setC(0);
            function.repaint();


        }
        if (e.getSource().equals(f2)) {


            function.setSw(2);
            function.setK(0);
            function.setB(0);
            function.repaint();

        }
        if (e.getSource().equals(f3)) {

            function.setSw(3);
            function.repaint();
        }
        if (e.getSource().equals(ex)) {
            System.exit(0);
        }

    }


}
