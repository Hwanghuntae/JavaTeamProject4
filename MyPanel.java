import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class MyPanel here.
 *
 * @author (2018315009 황훈태, 2018315039 이윤재,2018315040 김선민)
 * @version (2019.12.02)
 */
public class MyPanel extends JPanel implements ActionListener
{ 
    private String [] schoolYear = {"1학년", "2학년","3학년","4학년"};
    JTextArea ta;
    JTextField mtfName;
    JTextField mtfDept;
    JTextField mtfAddress;
    JComboBox cbSchoolYear;
    public MyPanel()
    {
        //setLayout(new FlowLayout());
        JLabel mlName = new JLabel("이름");
        mtfName = new JTextField(18);
        this.add(mlName); 
        this.add(mtfName);

        JLabel mlDept = new JLabel("학과");
        mtfDept = new JTextField(18);
        mtfDept.setText("글로벌소프트웨어학과");//TextField 글로벌소프트웨어학과로 설정
        this.add(mlDept); 
        this.add(mtfDept);

        JLabel mlAddress = new JLabel("주소");
        mtfAddress = new JTextField(18);
        mtfAddress.setText("서울시...");
        this.add(mlAddress); 
        this.add(mtfAddress);

        JLabel mlSchoolYear = new JLabel("학년");
        cbSchoolYear = new JComboBox(schoolYear); 
        // Sring List를 파라미터로하는 콤보박스 생성                       
        this.add(mlSchoolYear); 
        this.add(cbSchoolYear);

        JButton mb = new JButton("추가");
        JButton mbclear = new JButton("clear");
        this.add(mb); 
        this.add(mbclear); 
        mb.addActionListener(this); 
        mbclear.addActionListener(this);          

        ta = new JTextArea(10,24);
        this.add(ta);
        this.add(new JScrollPane(ta));
        //TextArea에 스크롤을 부착
    }

    public void actionPerformed(ActionEvent e){
        JButton btn = (JButton)e.getSource();
        if (btn.getText() == "clear"){
            ta.setText("");
            mtfName.setText("");
            mtfDept.setText("");
            mtfAddress.setText("");
            //TextArea, TextField 초기화
        }
        else if (btn.getText() == "추가"){
            String name = mtfName.getText();
            String dept = mtfDept.getText();
            String address = mtfAddress.getText();
            String year = schoolYear[cbSchoolYear.getSelectedIndex()];
            ta.append("이름 : " + name + "\n" + "학과 : "+ dept + "\n" + "학년 : " + year + "\n" + "주소 : "  + address + "\n"
                + "____________________________" );
        }
    }
}