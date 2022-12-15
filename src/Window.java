import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Window
{
  JFrame frame;
  JPanel pane;
  Dimension dim;
  Image background;
  Image cup_img;

  Window() throws IOException{
    frame = new JFrame();
    dim = Toolkit.getDefaultToolkit().getScreenSize();
    background = ImageIO.read(new File("rsc\\background.jpg"));
    cup_img = ImageIO.read(new File("rsc\\Cup.png"));
    
    //init frame
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(dim);
    frame.setVisible(true);

    //init Background
    pane = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.drawImage(background, 0, 0,((int)dim.getWidth()/2),((int)dim.getWidth()/2), null);
      }
    };
    pane.setLayout(null);
    //add background to Frame
    frame.getContentPane().add(pane, BorderLayout.CENTER);

    JLabel cup = new JLabel();
    cup.setBounds(((int)(dim.getWidth()/4.8)),((int)(dim.getHeight()/3.1*1.7)),200,200);
    cup.setVisible(true);
    cup.setOpaque(false);
    cup.setIcon(new ImageIcon(this.cup_img));
    pane.add(cup);

    JButton button = new JButton();
    button.setBounds(0,0,10,10);
    button.setVisible(true);
    button.setOpaque(true);
    pane.add(button);

  }
}