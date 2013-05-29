package GameUser;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

 public class GameUser1 extends JPanel {
	 
	 private int WIDTH=200;
	 private int HIGHT=180;
	 
	
	 JLabel ID;
	 JLabel Level;
	 JLabel Status;
	 JRadioButton Avatar;

	 public GameUser1()
	 {
		 this.setSize(new Dimension (WIDTH, HIGHT));
		 this.setBorder(new TitledBorder(new EtchedBorder(),"User1"));
		 
		 this.setLayout(null);   
		 
		 ID = new JLabel();
		 Level = new JLabel();
		 Status = new JLabel();
		 Avatar = new JRadioButton(); 			// 메시지를 보여주는 영역

		 ID.setBounds(110, 10, 80, 20);
		 Level.setBounds(110, 35, 80, 20);
		 Status.setBounds(110, 60, 80, 20);
		 Avatar.setBounds(10, 10, 100, 100);
		 Avatar.setIcon(new ImageIcon("images/Avatar1.gif"));

		 ID.add(this);
		 Level.add(this);
		 Status.add(this);
		 Avatar.add(this);
	 }
	 
	 public void SetUserInfo(String id, String level, String status,String avatar)
	 {
		 
	 }
}
