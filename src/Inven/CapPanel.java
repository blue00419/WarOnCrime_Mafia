package Inven;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Data.Data;
import Data.File;

public class CapPanel extends JPanel{
	
	private Data data = new Data();
	
	private JButton button_5;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_6;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	private JLabel lb4;
	private JLabel lb5;
	private JLabel lb6;
	private JLabel lb7;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel lblNewLabel_6;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JLabel label_31;
	private JLabel label_32;
	
	private String a = "구매완료";
	private String b;
	
	private ImageIcon oldimageicon = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\uzi.PNG");
	private Image oldimage = oldimageicon.getImage();
	private Image newimage = oldimage.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon = new ImageIcon(newimage);

	private ImageIcon oldimageicon1 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\tommy.PNG");
	private Image oldimage1 = oldimageicon1.getImage();
	private Image newimage1 = oldimage1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon1 = new ImageIcon(newimage1);
	
	private ImageIcon oldimageicon2 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\vector.PNG");
	private Image oldimage2 = oldimageicon2.getImage();
	private Image newimage2 = oldimage2.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon2 = new ImageIcon(newimage2);

	private ImageIcon oldimageicon3 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\sks.PNG");
	private Image oldimage3 = oldimageicon3.getImage();
	private Image newimage3 = oldimage3.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon3 = new ImageIcon(newimage3);
	
	private ImageIcon oldimageicon4 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\kar98.PNG");
	private Image oldimage4 = oldimageicon4.getImage();
	private Image newimage4 = oldimage4.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon4 = new ImageIcon(newimage4);

	private ImageIcon oldimageicon5 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\m16.PNG");
	private Image oldimage5 = oldimageicon5.getImage();
	private Image newimage5 = oldimage5.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon5 = new ImageIcon(newimage5);
	
	private ImageIcon oldimageicon6 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\scar.PNG");
	private Image oldimage6 = oldimageicon6.getImage();
	private Image newimage6 = oldimage6.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon6 = new ImageIcon(newimage6);
	
	public CapPanel() {
		setBackground(new Color(255, 255, 153));
		setForeground(new Color(139, 69, 19));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{50, 80, 80, 80, 80, 80, 80, 80, 0};
		gridBagLayout.rowHeights = new int[]{80, 25, 25, 25, 25, 25, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		button_5 = new JButton("");
		button_5.setIcon(newimageicon);
		button_5.setBorderPainted(false);
		button_5.setBackground(new Color(255, 255, 153));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				int cappowerlimit1 = 15;
				int caphealthlimit1 = 110;
				
				if(data.GetAs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 100) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetCapPower() < cappowerlimit1 && data.GetCapHealth() < caphealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if (data.GetCapLimit1() == 0) {
						int money = data.GetMoney() - 100;
						data.SetMoney(money);
						data.SetCapLimit1(1);
						lb1.setText("구매완료");
					}
					data.SetAs(1);
					data.SetCapInvenPower(5);
					data.SetCapInvenHealth(10);
					data.save();
				}
			}
		});
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 1;
		gbc_button_5.gridy = 0;
		add(button_5, gbc_button_5);
		
		button = new JButton("");
		button.setIcon(newimageicon1);
		button.setBorderPainted(false);
		button.setBackground(new Color(255, 255, 153));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				int cappowerlimit1 = 25;
				int caphealthlimit1 = 150;
				
				if(data.GetAs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 200) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetCapPower() < cappowerlimit1 && data.GetCapHealth() < caphealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetCapLimit2()==0) {
					int money = data.GetMoney()-200;
					data.SetMoney(money);
					data.SetCapLimit2(1);
					lb2.setText("구매완료");
					}
					data.SetAs(1);
					data.SetCapInvenPower(10);
					data.SetCapInvenHealth(20);
					data.save();
				}
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 0;
		add(button, gbc_button);
		
		button_1 = new JButton("");
		button_1.setIcon(newimageicon2);
		button_1.setBorderPainted(false);
		button_1.setBackground(new Color(255, 255, 153));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File.loadProperties(data);
				int cappowerlimit1 = 40;
				int caphealthlimit1 = 200;
				
				if(data.GetAs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 350) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetCapPower() < cappowerlimit1 && data.GetCapHealth() < caphealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetCapLimit3()==0) {
					int money = data.GetMoney()-350;
					data.SetMoney(money);
					data.SetCapLimit3(1);
					lb3.setText("구매완료");
					}
					data.SetAs(1);
					data.SetCapInvenPower(20);
					data.SetCapInvenHealth(40);
					data.save();
				}
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 0;
		add(button_1, gbc_button_1);
		
		button_2 = new JButton("");
		button_2.setIcon(newimageicon3);
		button_2.setBorderPainted(false);
		button_2.setBackground(new Color(255, 255, 153));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				int cappowerlimit1 = 50;
				int caphealthlimit1 = 250;
				
				if(data.GetAs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 500) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetCapPower() < cappowerlimit1 && data.GetCapHealth() < caphealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetCapLimit4()==0) {
					int money = data.GetMoney()-500;
					data.SetMoney(money);
					data.SetCapLimit4(1);
					lb4.setText("구매완료");
					}
					data.SetAs(1);
					data.SetCapInvenPower(35);
					data.SetCapInvenHealth(80);
					data.save();
				}
			}
		});
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 4;
		gbc_button_2.gridy = 0;
		add(button_2, gbc_button_2);
		
		button_3 = new JButton("");
		button_3.setIcon(newimageicon4);
		button_3.setBorderPainted(false);
		button_3.setBackground(new Color(255, 255, 153));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				int cappowerlimit1 = 60;
				int caphealthlimit1 = 300;
				
				if(data.GetAs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 700) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetCapPower() < cappowerlimit1 && data.GetCapHealth() < caphealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetCapLimit5()==0) {
					int money = data.GetMoney()-700;
					data.SetMoney(money);
					data.SetCapLimit5(1);
					lb3.setText("구매완료");
					}
					data.SetAs(1);
					data.SetCapInvenPower(50);
					data.SetCapInvenHealth(140);
					data.save();
				}
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 5;
		gbc_button_3.gridy = 0;
		add(button_3, gbc_button_3);
		
		button_4 = new JButton("");
		button_4.setIcon(newimageicon5);
		button_4.setBorderPainted(false);
		button_4.setBackground(new Color(255, 255, 153));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				int cappowerlimit1 = 70;
				int caphealthlimit1 = 350;
				
				if(data.GetAs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 900) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetCapPower() < cappowerlimit1 && data.GetCapHealth() < caphealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetCapLimit6()==0) {
					int money = data.GetMoney()-900;
					data.SetMoney(money);
					data.SetCapLimit6(1);
					lb6.setText("구매완료");
					}
					data.SetAs(1);
					data.SetCapInvenPower(70);
					data.SetCapInvenHealth(200);
					data.save();
				}
			}
		});
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 6;
		gbc_button_4.gridy = 0;
		add(button_4, gbc_button_4);
		
		button_6 = new JButton("");
		button_6.setIcon(newimageicon6);
		button_6.setBorderPainted(false);
		button_6.setBackground(new Color(255, 255, 153));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				int cappowerlimit1 = 100;
				int caphealthlimit1 = 500;
				
				if(data.GetAs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 1300) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetCapPower() < cappowerlimit1 && data.GetCapHealth() < caphealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetCapLimit7()==0) {
					int money = data.GetMoney()-1300;
					data.SetMoney(money);
					data.SetCapLimit7(1);
					lb7.setText("구매완료");
					}
					data.SetAs(1);
					data.SetCapInvenPower(120);
					data.SetCapInvenHealth(400);
					data.save();
				}
			}
		});
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 0);
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.gridx = 7;
		gbc_button_6.gridy = 0;
		add(button_6, gbc_button_6);
		
		lblNewLabel_2 = new JLabel("공격력 제한");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		lblNewLabel = new JLabel("15");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		label = new JLabel("25");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 1;
		add(label, gbc_label);
		
		label_1 = new JLabel("40");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 3;
		gbc_label_1.gridy = 1;
		add(label_1, gbc_label_1);
		
		label_2 = new JLabel("50");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 4;
		gbc_label_2.gridy = 1;
		add(label_2, gbc_label_2);
		
		label_3 = new JLabel("60");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 5;
		gbc_label_3.gridy = 1;
		add(label_3, gbc_label_3);
		
		label_4 = new JLabel("70");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 6;
		gbc_label_4.gridy = 1;
		add(label_4, gbc_label_4);
		
		label_5 = new JLabel("100");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 0);
		gbc_label_5.gridx = 7;
		gbc_label_5.gridy = 1;
		add(label_5, gbc_label_5);
		
		lblNewLabel_3 = new JLabel("체력 제한");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("110");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 2;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		label_12 = new JLabel("150");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 2;
		gbc_label_12.gridy = 2;
		add(label_12, gbc_label_12);
		
		label_13 = new JLabel("200");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 3;
		gbc_label_13.gridy = 2;
		add(label_13, gbc_label_13);
		
		label_14 = new JLabel("250");
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 4;
		gbc_label_14.gridy = 2;
		add(label_14, gbc_label_14);
		
		label_15 = new JLabel("300");
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 5;
		gbc_label_15.gridy = 2;
		add(label_15, gbc_label_15);
		
		label_16 = new JLabel("350");
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.insets = new Insets(0, 0, 5, 5);
		gbc_label_16.gridx = 6;
		gbc_label_16.gridy = 2;
		add(label_16, gbc_label_16);
		
		label_17 = new JLabel("500");
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.insets = new Insets(0, 0, 5, 0);
		gbc_label_17.gridx = 7;
		gbc_label_17.gridy = 2;
		add(label_17, gbc_label_17);
		
		lblNewLabel_4 = new JLabel("금액");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		File.loadProperties(data);
		
		if(data.GetCapLimit1()==0)
			b="100원";
		else
			b=a;
		
		lb1 = new JLabel(b);
		GridBagConstraints gbc_lb1 = new GridBagConstraints();
		gbc_lb1.insets = new Insets(0, 0, 5, 5);
		gbc_lb1.gridx = 1;
		gbc_lb1.gridy = 3;
		add(lb1, gbc_lb1);
		
		if(data.GetCapLimit2()==0)
			b="200원";
		else
			b=a;
		
		lb2 = new JLabel(b);
		GridBagConstraints gbc_lb2 = new GridBagConstraints();
		gbc_lb2.insets = new Insets(0, 0, 5, 5);
		gbc_lb2.gridx = 2;
		gbc_lb2.gridy = 3;
		add(lb2, gbc_lb2);
		
		if(data.GetCapLimit3()==0)
			b="350원";
		else
			b=a;
		
		lb3 = new JLabel(b);
		GridBagConstraints gbc_lb3 = new GridBagConstraints();
		gbc_lb3.insets = new Insets(0, 0, 5, 5);
		gbc_lb3.gridx = 3;
		gbc_lb3.gridy = 3;
		add(lb3, gbc_lb3);
		
		if(data.GetCapLimit4()==0)
			b="500원";
		else
			b=a;
		
		lb4 = new JLabel(b);
		GridBagConstraints gbc_lb4 = new GridBagConstraints();
		gbc_lb4.insets = new Insets(0, 0, 5, 5);
		gbc_lb4.gridx = 4;
		gbc_lb4.gridy = 3;
		add(lb4, gbc_lb4);
		
		if(data.GetCapLimit5()==0)
			b="700원";
		else
			b=a;
		
		lb5 = new JLabel(b);
		GridBagConstraints gbc_lb5 = new GridBagConstraints();
		gbc_lb5.insets = new Insets(0, 0, 5, 5);
		gbc_lb5.gridx = 5;
		gbc_lb5.gridy = 3;
		add(lb5, gbc_lb5);
		
		if(data.GetCapLimit6()==0)
			b="900원";
		else
			b=a;
		
		lb6 = new JLabel(b);
		GridBagConstraints gbc_lb6 = new GridBagConstraints();
		gbc_lb6.insets = new Insets(0, 0, 5, 5);
		gbc_lb6.gridx = 6;
		gbc_lb6.gridy = 3;
		add(lb6, gbc_lb6);
		
		if(data.GetCapLimit7()==0)
			b="1300원";
		else
			b=a;
		
		lb7 = new JLabel(b);
		GridBagConstraints gbc_lb7 = new GridBagConstraints();
		gbc_lb7.insets = new Insets(0, 0, 5, 0);
		gbc_lb7.gridx = 7;
		gbc_lb7.gridy = 3;
		add(lb7, gbc_lb7);
		
		lblNewLabel_6 = new JLabel("공격력 증가");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 4;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		label_18 = new JLabel("5");
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 1;
		gbc_label_18.gridy = 4;
		add(label_18, gbc_label_18);
		
		label_21 = new JLabel("10");
		GridBagConstraints gbc_label_21 = new GridBagConstraints();
		gbc_label_21.insets = new Insets(0, 0, 5, 5);
		gbc_label_21.gridx = 2;
		gbc_label_21.gridy = 4;
		add(label_21, gbc_label_21);
		
		label_23 = new JLabel("20");
		GridBagConstraints gbc_label_23 = new GridBagConstraints();
		gbc_label_23.insets = new Insets(0, 0, 5, 5);
		gbc_label_23.gridx = 3;
		gbc_label_23.gridy = 4;
		add(label_23, gbc_label_23);
		
		label_25 = new JLabel("35");
		GridBagConstraints gbc_label_25 = new GridBagConstraints();
		gbc_label_25.insets = new Insets(0, 0, 5, 5);
		gbc_label_25.gridx = 4;
		gbc_label_25.gridy = 4;
		add(label_25, gbc_label_25);
		
		label_27 = new JLabel("50");
		GridBagConstraints gbc_label_27 = new GridBagConstraints();
		gbc_label_27.insets = new Insets(0, 0, 5, 5);
		gbc_label_27.gridx = 5;
		gbc_label_27.gridy = 4;
		add(label_27, gbc_label_27);
		
		label_29 = new JLabel("70");
		GridBagConstraints gbc_label_29 = new GridBagConstraints();
		gbc_label_29.insets = new Insets(0, 0, 5, 5);
		gbc_label_29.gridx = 6;
		gbc_label_29.gridy = 4;
		add(label_29, gbc_label_29);
		
		label_31 = new JLabel("120");
		GridBagConstraints gbc_label_31 = new GridBagConstraints();
		gbc_label_31.insets = new Insets(0, 0, 5, 0);
		gbc_label_31.gridx = 7;
		gbc_label_31.gridy = 4;
		add(label_31, gbc_label_31);
		
		label_19 = new JLabel("체력 증가");
		GridBagConstraints gbc_label_19 = new GridBagConstraints();
		gbc_label_19.insets = new Insets(0, 0, 0, 5);
		gbc_label_19.gridx = 0;
		gbc_label_19.gridy = 5;
		add(label_19, gbc_label_19);
		
		label_20 = new JLabel("10");
		GridBagConstraints gbc_label_20 = new GridBagConstraints();
		gbc_label_20.insets = new Insets(0, 0, 0, 5);
		gbc_label_20.gridx = 1;
		gbc_label_20.gridy = 5;
		add(label_20, gbc_label_20);
		
		label_22 = new JLabel("20");
		GridBagConstraints gbc_label_22 = new GridBagConstraints();
		gbc_label_22.insets = new Insets(0, 0, 0, 5);
		gbc_label_22.gridx = 2;
		gbc_label_22.gridy = 5;
		add(label_22, gbc_label_22);
		
		label_24 = new JLabel("40");
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.insets = new Insets(0, 0, 0, 5);
		gbc_label_24.gridx = 3;
		gbc_label_24.gridy = 5;
		add(label_24, gbc_label_24);
		
		label_26 = new JLabel("80");
		GridBagConstraints gbc_label_26 = new GridBagConstraints();
		gbc_label_26.insets = new Insets(0, 0, 0, 5);
		gbc_label_26.gridx = 4;
		gbc_label_26.gridy = 5;
		add(label_26, gbc_label_26);
		
		label_28 = new JLabel("140");
		GridBagConstraints gbc_label_28 = new GridBagConstraints();
		gbc_label_28.insets = new Insets(0, 0, 0, 5);
		gbc_label_28.gridx = 5;
		gbc_label_28.gridy = 5;
		add(label_28, gbc_label_28);
		
		label_30 = new JLabel("200");
		GridBagConstraints gbc_label_30 = new GridBagConstraints();
		gbc_label_30.insets = new Insets(0, 0, 0, 5);
		gbc_label_30.gridx = 6;
		gbc_label_30.gridy = 5;
		add(label_30, gbc_label_30);
		
		label_32 = new JLabel("400");
		GridBagConstraints gbc_label_32 = new GridBagConstraints();
		gbc_label_32.gridx = 7;
		gbc_label_32.gridy = 5;
		add(label_32, gbc_label_32);
	}

}
