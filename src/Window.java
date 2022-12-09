import javax.imageio.ImageIO;
import javax.swing.*;
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

  Window() throws IOException{
    frame = new JFrame();
    dim = Toolkit.getDefaultToolkit().getScreenSize();
    background = ImageIO.read(new File("rsc\\R.png"));
    
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
    //add background to Frame
    frame.getContentPane().add(pane, BorderLayout.CENTER);

  }
}