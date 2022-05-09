import javax.swing.*;
import java.awt.*;

public class JMyFrame extends JFrame{
    // frame size in px
    final int WIDTH = 300;
    final int HEIGHT = 150;

    public JMyFrame(){
        // title, frame size, default close option
        super("Major Bag Alert");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creating the menu bar and adding sub menu's
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m12 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m12);

        // puts menu bar to top of the screen
        getContentPane().add(BorderLayout.NORTH, mb);

        // centers frame on screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);

        // sets frame to visible
        setVisible(true);
    }
}
