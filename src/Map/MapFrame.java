package Map;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Data.Data;
import Data.File;

public class MapFrame extends JFrame{
	
	private ImageIcon oldimageicon = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\지도.jpg");
	private Image oldimage = oldimageicon.getImage();
	private Image newimage = oldimage.getScaledInstance(490, 640, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon = new ImageIcon(newimage);
	private JLabel label;
	private int map=0;
	
	private Data data = new Data();
	private IfWarPanel ifwarpanel = new IfWarPanel(GetMapFrame());
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;

	public IfWarPanel GetIfWarPanel() {
		return ifwarpanel;
	}
	
	public MapFrame GetMapFrame() {
		return this;
	}
	
	public MapFrame() {
		File.loadProperties(data);
		setUndecorated(true);
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.PINK));
		getContentPane().setLayout(null);		
		
		button = new JButton("1");
		button.setForeground(new Color(240, 255, 255));
		button.setBackground(Color.RED);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(data.GetMap1()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				SetMap(1);
				
				ifwarpanel.SetEnemyPower(40);
				ifwarpanel.SetEnemyHealth(400);
				ifwarpanel.SetEnemyPrice(200);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button.setBounds(162, 510, 50, 23);
		getContentPane().add(button);
		
		button_1 = new JButton("2");
		button_1.setForeground(new Color(240, 255, 255));
		button_1.setBackground(Color.RED);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SetMap(2);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap2()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				
				ifwarpanel.SetEnemyPower(100);
				ifwarpanel.SetEnemyHealth(700);
				ifwarpanel.SetEnemyPrice(200);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_1.setBounds(250, 487, 50, 23);
		getContentPane().add(button_1);
		
		button_2 = new JButton("3");
		button_2.setForeground(new Color(240, 255, 255));
		button_2.setBackground(Color.RED);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(3);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap3()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}

				
				ifwarpanel.SetEnemyPower(200);
				ifwarpanel.SetEnemyHealth(1300);
				ifwarpanel.SetEnemyPrice(400);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_2.setBounds(314, 465, 50, 23);
		getContentPane().add(button_2);
		
		button_3 = new JButton("4");
		button_3.setForeground(new Color(240, 248, 255));
		button_3.setBackground(new Color(255, 0, 0));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(4);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap4()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(400);
				ifwarpanel.SetEnemyHealth(2000);
				ifwarpanel.SetEnemyPrice(800);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_3.setBounds(193, 411, 50, 23);
		getContentPane().add(button_3);
		
		button_4 = new JButton("5");
		button_4.setForeground(new Color(240, 255, 255));
		button_4.setBackground(Color.RED);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(5);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap5()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(650);
				ifwarpanel.SetEnemyHealth(3000);
				ifwarpanel.SetEnemyPrice(1600);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_4.setBounds(279, 384, 50, 23);
		getContentPane().add(button_4);
		
		button_5 = new JButton("6");
		button_5.setForeground(new Color(240, 255, 240));
		button_5.setBackground(Color.RED);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(6);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap6()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(1000);
				ifwarpanel.SetEnemyHealth(4200);
				ifwarpanel.SetEnemyPrice(3200);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_5.setBounds(207, 350, 50, 23);
		getContentPane().add(button_5);
		
		button_6 = new JButton("7");
		button_6.setForeground(new Color(240, 248, 255));
		button_6.setBackground(Color.RED);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(7);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap7()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(1500);
				ifwarpanel.SetEnemyHealth(5600);
				ifwarpanel.SetEnemyPrice(6400);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_6.setBounds(269, 307, 50, 23);
		getContentPane().add(button_6);
		
		button_7 = new JButton("8");
		button_7.setForeground(new Color(240, 255, 255));
		button_7.setBackground(Color.RED);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(8);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap8()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(2300);
				ifwarpanel.SetEnemyHealth(7200);
				ifwarpanel.SetEnemyPrice(10000);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_7.setBounds(91, 270, 50, 23);
		getContentPane().add(button_7);
		
		button_8 = new JButton("9");
		button_8.setForeground(new Color(240, 255, 240));
		button_8.setBackground(Color.RED);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(9);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap9()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(3400);
				ifwarpanel.SetEnemyHealth(8800);
				ifwarpanel.SetEnemyPrice(20000);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_8.setBounds(193, 230, 50, 23);
		getContentPane().add(button_8);
		
		button_9 = new JButton("10");
		button_9.setForeground(new Color(240, 255, 240));
		button_9.setBackground(Color.RED);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(10);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap10()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(5000);
				ifwarpanel.SetEnemyHealth(11000);
				ifwarpanel.SetEnemyPrice(35000);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_9.setBounds(91, 177, 50, 23);
		getContentPane().add(button_9);
		
		button_10 = new JButton("11");
		button_10.setForeground(new Color(240, 255, 240));
		button_10.setBackground(Color.RED);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(11);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap11()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(7500);
				ifwarpanel.SetEnemyHealth(14000);
				ifwarpanel.SetEnemyPrice(60000);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_10.setBounds(162, 133, 50, 23);
		getContentPane().add(button_10);
		
		button_11 = new JButton("12");
		button_11.setForeground(new Color(240, 255, 240));
		button_11.setBackground(Color.RED);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(12);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap12()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(10000);
				ifwarpanel.SetEnemyHealth(17000);
				ifwarpanel.SetEnemyPrice(100000);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_11.setBounds(236, 177, 50, 23);
		getContentPane().add(button_11);
		
		button_12 = new JButton("13");
		button_12.setForeground(new Color(240, 255, 240));
		button_12.setBackground(Color.RED);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(13);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap13()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(13000);
				ifwarpanel.SetEnemyHealth(21000);
				ifwarpanel.SetEnemyPrice(150000);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_12.setBounds(314, 133, 50, 23);
		getContentPane().add(button_12);
		
		button_13 = new JButton("14");
		button_13.setForeground(new Color(240, 255, 240));
		button_13.setBackground(Color.RED);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(14);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap14()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(17000);
				ifwarpanel.SetEnemyHealth(25000);
				ifwarpanel.SetEnemyPrice(210000);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_13.setBounds(377, 45, 50, 23);
		getContentPane().add(button_13);
		
		button_14 = new JButton("15");
		button_14.setForeground(new Color(240, 255, 240));
		button_14.setBackground(Color.RED);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(15);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap15()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(23000);
				ifwarpanel.SetEnemyHealth(30000);
				ifwarpanel.SetEnemyPrice(300000);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_14.setBounds(147, 617, 50, 23);
		getContentPane().add(button_14);
		
		button_15 = new JButton("16");
		button_15.setForeground(new Color(240, 255, 240));
		button_15.setBackground(Color.RED);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SetMap(16);
				if(data.GetEnding()<GetMap()-1) {
					JOptionPane.showMessageDialog(null, "아직 점령지에 다다를수 없습니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMap16()==0) {
					ifwarpanel.SetOccupy(true);
				}
				else {
					ifwarpanel.SetOccupy(false);
				}
				
				ifwarpanel.SetEnemyPower(30000);
				ifwarpanel.SetEnemyHealth(40000);
				ifwarpanel.SetEnemyPrice(400000);
				ifwarpanel.SetMyPower(data.GetAllPower());
				ifwarpanel.SetMyHealth(data.GetAllHealth());
				setBounds(550, 200, 595, 400);
				setContentPane(ifwarpanel);
			}
		});
		button_15.setBounds(440, 336, 50, 23);
		getContentPane().add(button_15);
		
		button_16 = new JButton("지도 창 닫기");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_16.setBackground(new Color(255, 182, 193));
		button_16.setForeground(new Color(0, 0, 0));
		button_16.setBounds(0, 0, 113, 27);
		getContentPane().add(button_16);
		
		label = new JLabel("");
		label.setIcon(newimageicon);
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setAlignmentX(Component.CENTER_ALIGNMENT);
		label.setBounds(0, 0, 490, 640);
		getContentPane().add(label);
		
		if(data.GetMap1()==1) 
			button.setBackground(Color.BLUE);
		if(data.GetMap2()==1) 
			button_1.setBackground(Color.BLUE);
		if(data.GetMap3()==1)
			button_2.setBackground(Color.BLUE);
		if(data.GetMap4()==1) 
			button_3.setBackground(Color.BLUE);
		if(data.GetMap5()==1) 
			button_4.setBackground(Color.BLUE);
		if(data.GetMap6()==1) 
			button_5.setBackground(Color.BLUE);
		if(data.GetMap7()==1) 
			button_6.setBackground(Color.BLUE);
		if(data.GetMap8()==1) 
			button_7.setBackground(Color.BLUE);
		if(data.GetMap9()==1) 
			button_8.setBackground(Color.BLUE);
		if(data.GetMap10()==1) 
			button_9.setBackground(Color.BLUE);
		if(data.GetMap11()==1) 
			button_10.setBackground(Color.BLUE);
		if(data.GetMap12()==1) 
			button_11.setBackground(Color.BLUE);
		if(data.GetMap13()==1) 
			button_12.setBackground(Color.BLUE);
		if(data.GetMap14()==1) 
			button_13.setBackground(Color.BLUE);
		if(data.GetMap15()==1) 
			button_14.setBackground(Color.BLUE);
		if(data.GetMap16()==1) 
			button_15.setBackground(Color.BLUE);
	}
	
	public void SetMap(int map) {
		this.map = map;
	}

	public int GetMap() {
		return map;
	}
}
