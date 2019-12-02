import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class TextFieldFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TextFieldFrame extends JFrame
{

    public TextFieldFrame()
    {
        setTitle("JAVA_CHAP11");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,150);
        setVisible(true);
        this.setTitle("실습_4");
        this.add(new MyPanel3());
    }
  
}
