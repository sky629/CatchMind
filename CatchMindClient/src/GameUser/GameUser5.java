package GameUser;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

 public class GameUser5 extends JPanel {
	 
	 private int WIDTH=200;
	 private int HIGHT=180;
	 
	
	 JLabel ID;
	 JLabel Level;
	 public GameUser5()
	 {
		 this.setSize(new Dimension (WIDTH, HIGHT));
		 this.setBorder(new TitledBorder(new EtchedBorder(),"User5"));
		 
		 this.setLayout(null);   
		 
		 ID = new JLabel();
		 Level = new JLabel();
		 ID.setBounds(110, 10, 80, 20);
		 Level.setBounds(110, 35, 80, 20);
		 ID.add(this);
		 Level.add(this);
		 
		 
	 }

}
