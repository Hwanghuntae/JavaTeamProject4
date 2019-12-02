import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class MyPanel3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPanel extends JPanel
{
    private String [] schoolYear = {"1학년", "2학년","3학년","4학년"};
    
    public MyPanel()
    {
        setLayout(new FlowLayout());
        
        JLabel mlName = new JLabel("이름");
        JTextField mtfName = new JTextField(20);
        this.add(mlName); this.add(mtfName);
        
        JLabel mlDept = new JLabel("학과");
        JTextField mtfDept = new JTextField(20);
        this.add(mlDept); this.add(mtfDept);
        
        JLabel mlAddress = new JLabel("주소");
        JTextField mtfAddress = new JTextField(20);
        this.add(mlAddress); this.add(mtfAddress);
        
        JLabel mlSchoolYear = new JLabel("학년");
        
        JComboBox cbSchoolYear = new JComboBox(schoolYear);
        
        this.add(mlSchoolYear); this.add(cbSchoolYear);
        
        JButton mb = new JButton("추가");
        JButton mbclear = new JButton("clear");
        this.add(mb); this.add(mbclear);
        
        JTextArea ta = new JTextArea(15,20);
        this.add(ta);
        
    }

}
