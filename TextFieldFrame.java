import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class TextFieldFrame here.
 *
 * @author (2018315009 황훈태, 2018315039 이윤재,2018315040 김선민)
 * @version (2019.12.02)
 */
public class TextFieldFrame extends JFrame
{
    MyPanel mp = new MyPanel();
    public TextFieldFrame() 
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350,250);
        this.setVisible(true);
        this.setTitle("실습_4");
        this.add(mp);
    }
}
