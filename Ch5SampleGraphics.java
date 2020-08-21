import javax.swing.*;
import java.awt.*;

/*
*
* drawing rectangle
* */
public class Ch5SampleGraphics extends JFrame {

    public static void main(String[] args) {
        JFrame win;
        Container containerPane;
        Graphics graphics;
        Color pinkColor;

        win =new JFrame("My First Rectangle");
        win.setSize(300,200);
        win.setLocation(200,200);
        win.setVisible(true);
        win.setLayout(new FlowLayout());
        pinkColor=new Color(255,22,175);

        containerPane=win.getContentPane();
        graphics=containerPane.getGraphics();
        graphics.drawRect(50,50,100,30);
        //graphics.draw3DRect(80,80,200,50,true);
    }
}
