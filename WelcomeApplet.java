import javax.swing.*;
import java.awt.*;

public class WelcomeApplet extends JApplet {
    @Override
    public void init() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                setLayout(new BorderLayout());
                JLabel label=new JLabel(getParameter("greeting"),
                        SwingConstants.CENTER);
                label.setFont(new Font("Serif",Font.BOLD,18));
                add(label,BorderLayout.CENTER);
                JPanel panel=new JPanel();
                JButton cayButton=new JButton("Cay Horstmann");
            }
        });
    }
}
