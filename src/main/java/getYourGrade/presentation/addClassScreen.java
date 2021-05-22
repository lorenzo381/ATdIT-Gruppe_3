package getYourGrade.presentation;
import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class addClassScreen extends JFrame {
    Color gr = new Color(0,60,0);
    ResourceBundle resourcebundle = ResourceBundle.getBundle("presentation");

    public  void addWhiteJlToClassScreen(JPanel jp) {


       JLabel jl = new JLabel("");
        jl.setBackground(Color.white);
        jl.setOpaque(true);
        jp.add(jl);

    }

    public void addBordWithTextJpToClassScreen(JPanel jp) {

        JLabel whiteboard= new JLabel("");
        whiteboard.setBackground(Color.white);
        whiteboard.setOpaque(true);

        JPanel bord = new JPanel(new GridLayout(2,1));
        JLabel greenboardJL = new JLabel(resourcebundle.getString("Board"), JLabel.CENTER);
        greenboardJL.setForeground(Color.white);
        greenboardJL.setBackground(gr);
        greenboardJL.setOpaque(true);
        bord.add(whiteboard);
        bord.add(greenboardJL);

        jp.add(bord);


    }

    public void addBordJpToClassScreen(JPanel jp) {

        JLabel whiteboard= new JLabel("");
        whiteboard.setBackground(Color.white);
        whiteboard.setOpaque(true);

        JPanel bord = new JPanel(new GridLayout(2,1));
        JLabel greenboardJL = new JLabel();
        greenboardJL.setBackground(gr);
        greenboardJL.setOpaque(true);
        bord.add(whiteboard);
        bord.add(greenboardJL);

        jp.add(bord);


    }

}
