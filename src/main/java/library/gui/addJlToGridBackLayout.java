package library.gui;

import javax.swing.*;
import java.awt.*;


public class addJlToGridBackLayout extends JFrame {
    JLabel jlabel;


    public void addJlHorizontalToGridBackLayout(Container pane, GridBagConstraints c, JLabel jlabel , int gridX, int gridY, double weightX, double weightY, int gridWith, int ipady,  Color colour ) {
      jlabel.setOpaque(true);
      jlabel.setBackground(colour);
      c.fill = GridBagConstraints.HORIZONTAL;
      c.weightx = weightX;
      c.weighty = weightY;
      c.gridwidth = gridWith;
      c.gridx = gridX;
      c.gridy = gridY;
      c.ipady = ipady;
      pane.add(jlabel,c);



    }

    public void addJlWithIconHorizontalToGridBackLayout(Container pane, GridBagConstraints c, ImageIcon icon, int iconWidh, int iconHeight,/* JLabel jlabel ,*/ int gridX, int gridY, double weightX, double weightY, int gridWith, int ipady,  Color colour ) {

        icon.setImage(icon.getImage().getScaledInstance(iconWidh, iconHeight, Image.SCALE_DEFAULT));
        jlabel = new JLabel(icon,JLabel.CENTER);
        jlabel.setOpaque(true);
        jlabel.setBackground(colour);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = weightX;
        c.weighty = weightY;
        c.gridwidth = gridWith;
        c.gridx = gridX;
        c.gridy = gridY;
        c.ipady = ipady;
        pane.add(jlabel,c);



    }
}
