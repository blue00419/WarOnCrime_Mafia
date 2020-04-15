package Mafia;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Data.Data;
import Data.File;
import Server.Server;

public class MyFrame extends JFrame{
	
	class job extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			setContentPane(new MainPanel());
			revalidate();
		}
		
	}
	
	private Timer timer;
	private Data data = new Data();
	
	private ImageIcon oldimageicon = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\그브.PNG");
	private Image oldimage = oldimageicon.getImage();
	private Image newimage = oldimage.getScaledInstance(900, 800, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon = new ImageIcon(newimage);

	private ImageIcon oldimageicon1 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\배경4.PNG");
	private Image oldimage1 = oldimageicon1.getImage();
	private Image newimage1 = oldimage1.getScaledInstance(900, 800, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon1 = new ImageIcon(newimage1);
	
	public MyFrame() {
		data.load();

		if(data.GetStart()==0) {
			data.SetStart(1);
			job job = new job();
			timer = new Timer();
			timer.schedule(job, 3000);
			setUndecorated(true);
			getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.PINK));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(400, 100, 900, 800);
			getContentPane().setLayout(null);
			
			JLabel lblStartGamr = new JLabel("START GAME~!!!");
			lblStartGamr.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 30));
			lblStartGamr.setForeground(new Color(255, 255, 0));
			lblStartGamr.setBounds(300, 600, 268, 48);
			getContentPane().add(lblStartGamr);
			
			JLabel label = new JLabel("");
			label.setIcon(newimageicon);
			label.setBounds(0, 0, 900, 800);
			getContentPane().add(label);
			

			data.save();
		}
		else {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(400, 100, 900, 800);
			setUndecorated(true);
			getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.PINK));
			getContentPane().setLayout(null);
			
			JButton btnNewButton = new JButton("새 게임");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Data data = new Data();
					File.saveProperties(data);
					data.SetStart(1);
					data.save();
					setContentPane(new MainPanel());
					revalidate();
				}
			});
			btnNewButton.setBounds(410, 200, 105, 27);
			getContentPane().add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("불러오기");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Data data = new Data();
					File.loadProperties(data);
					data.save();
					setContentPane(new MainPanel());
					revalidate();
				}
			});
			btnNewButton_1.setBounds(410, 400, 105, 27);
			getContentPane().add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("끝내기");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnNewButton_2.setBounds(410, 600, 105, 27);
			getContentPane().add(btnNewButton_2);
			
			JLabel label = new JLabel("");
			label.setIcon(newimageicon1);
			label.setBounds(0, 0, 900, 800);
			getContentPane().add(label);
		}		
		
		show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
		Server server = new Server();
	}
}