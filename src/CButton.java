import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class CButton extends JButton {
    CButton(int x,int y, int width,int hight){

    this.setBounds(x,y,width,hight);
    this.setIcon(new ImageIcon());

    this.setVisible(true);
    this.setOpaque(true);
    this.setBorderPainted(false);
    this.setContentAreaFilled(false);
    this.setFocusable(false);
    this.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
              txtOutput.setText("Welcome to Javatpoint.");  
      }  
      }); 
    }
}
