import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WindowAbs
{
  JFrame frame;
  JPanel pane;
  Dimension dim;

  Image background;
  Image cup_img;
  Image milk_img;
  Image coffee_img;
  Image water_img;
  Image on_img;
  Image off_img;

  int zustand;

  WindowAbs() throws IOException{
    frame = new JFrame();
    dim = Toolkit.getDefaultToolkit().getScreenSize();
    background = ImageIO.read(new File("rsc\\background.jpg"));
    cup_img = ImageIO.read(new File("rsc\\Cup.png"));
    milk_img = ImageIO.read(new File("rsc\\Milk.jfif"));
    coffee_img = ImageIO.read(new File("rsc\\coffee.jfif"));
    water_img = ImageIO.read(new File("rsc\\Water.jfif"));
    on_img = ImageIO.read(new File("rsc\\On.png"));
    off_img = ImageIO.read(new File("rsc\\Off.png"));
    
    //init frame
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setBounds(0, 0, 900, 600);
    frame.setVisible(true);

    //init Background
    pane = new JPanel() {
      @Override
      protected void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.drawImage(background, 0, 0,600 ,600 , null);
      }
    };
    pane.setLayout(null);
    //add background to Frame
    frame.getContentPane().add(pane, BorderLayout.CENTER);

    
    JLabel txtOutput = new JLabel();
    txtOutput.setBounds(210,165,150,25);
    txtOutput.setText("null");
    txtOutput.setVisible(true);
    txtOutput.setOpaque(true);
    pane.add(txtOutput);

    JLabel cup = new JLabel();
    cup.setBounds(200,300,200,200);
    cup.setVisible(true);
    cup.setBackground(Color.BLACK);
    cup.setOpaque(false);
    cup.setIcon(new ImageIcon(this.cup_img));
    pane.add(cup);

    JButton onButton = new JButton();
    onButton.setBounds(250,500,50,50);
    onButton.setVisible(true);
    onButton.setIcon(new ImageIcon(this.off_img));
    onButton.setOpaque(true);
    onButton.setBorderPainted(false);
    onButton.setContentAreaFilled(false);
    onButton.setFocusable(false);
    onButton.addActionListener(new ActionListener(){  
      boolean on;
      public void actionPerformed(ActionEvent e){  
        if(on) {
          on=false;
          onButton.setIcon(new ImageIcon(off_img));
        }else{
          on=true;
          onButton.setIcon(new ImageIcon(on_img));
        }
      }  
      }); 
    pane.add(onButton);

    JButton button1 = new JButton();
    button1.setBounds(300,185,50,50);
    button1.setVisible(true);
    button1.setIcon(new ImageIcon(this.cup_img));
    button1.setOpaque(true);
    pane.add(button1);

    JButton button2 = new JButton();
    button2.setBounds(250,185,50,50);
    button2.setVisible(true);
    button2.setIcon( new ImageIcon(this.cup_img));
    button2.setOpaque(true);
    pane.add(button2);

    JButton button3 = new JButton();
    button3.setBounds(200,185,50,50);
    button3.setVisible(true);
    button3.setIcon(new ImageIcon(this.cup_img));
    button3.setOpaque(true);
    pane.add(button3);

    JButton milkButton = new JButton();
    milkButton.setBounds(550,185,70,300);
    milkButton.setVisible(true);
    milkButton.setIcon(new ImageIcon(this.milk_img));
    milkButton.setOpaque(false);
    milkButton.setBorderPainted(false);
    milkButton.setContentAreaFilled(false);
    milkButton.setFocusable(false);
    milkButton.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
              txtOutput.setText("Welcome to Javatpoint.");  
      }  
      });  
    pane.add(milkButton);

    JButton coffeeButton = new JButton();
    coffeeButton.setBounds(650,185,70,300);
    coffeeButton.setVisible(true);
    coffeeButton.setIcon(new ImageIcon(this.coffee_img));
    coffeeButton.setOpaque(true);
    coffeeButton.setBorderPainted(false);
    coffeeButton.setContentAreaFilled(false);
    coffeeButton.setFocusable(false);
    coffeeButton.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
              txtOutput.setText("Welcome to Javatpoint.");  
      }  
      }); 
    pane.add(coffeeButton);

    JButton waterButton = new JButton();
    waterButton.setBounds(750,185,70,300);
    waterButton.setVisible(true);
    waterButton.setIcon(new ImageIcon(this.water_img));
    waterButton.setOpaque(true);
    waterButton.setBorderPainted(false);
    waterButton.setContentAreaFilled(false);
    waterButton.setFocusable(false);
    waterButton.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
              txtOutput.setText("Welcome to Javatpoint.");  
      }  
      }); 
    pane.add(waterButton);

  }
}