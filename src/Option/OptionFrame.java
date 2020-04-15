package Option;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Data.Data;

public class OptionFrame extends JFrame{
	
	private Data data = new Data();
	
	private ImageIcon oldimageicon = new ImageIcon("C:\\\\Users\\\\blue0\\\\git\\\\WarOnCrime_Mafia\\\\picture\\\\마피아2.jpg");
	private Image oldimage = oldimageicon.getImage();
	private Image newimage = oldimage.getScaledInstance(300, 500, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon = new ImageIcon(newimage);
	
	private JButton backbtn;
	private JButton savebtn;
	private JButton exitbtn;

	public OptionFrame() {
		
		setUndecorated(true);
		setTitle("설정");
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.PINK));
		
		getContentPane().setLayout(null);
		
		JButton button = new JButton("돌아가기");
		button.setBackground(new Color(255, 182, 193));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		button.setBounds(104, 141, 97, 23);
		getContentPane().add(button);
		
		JButton btnNewButton = new JButton("저장하기");
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(104, 261, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton button_1 = new JButton("끝내기");
		button_1.setBackground(new Color(255, 182, 193));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(104, 381, 97, 23);
		getContentPane().add(button_1);
		
		JLabel label = new JLabel("");
		label.setIcon(newimageicon);
		label.setBounds(0, 0, 300, 500);
		getContentPane().add(label);
	}
}
