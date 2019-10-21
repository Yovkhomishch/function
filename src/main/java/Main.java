import javax.swing.*;
import java.awt.*;


/**
 * Created by igor on 3/1/19
 *
 * @author Yovkhomishch I.A.
 */
public class Main extends JFrame {

    private Function f = new Function();
    private Button b = new Button(f);
    private Driver d = new Driver(b, f);


    Main() {
        super("Graphic of function");

        JPanel jcp = new JPanel(new BorderLayout());


        setContentPane(jcp);
        jcp.add(f, BorderLayout.CENTER);
        jcp.add(b, BorderLayout.EAST);
        jcp.add(d, BorderLayout.AFTER_LAST_LINE);
        jcp.setBackground(Color.gray);
        setSize(1366, 733);

        setLocationRelativeTo(b);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }


    public static void main(String... args) {
        new Main().setVisible(true);

    }

}

