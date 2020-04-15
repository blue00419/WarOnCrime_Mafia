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

public class ZzolPanel extends JPanel{
	
	private Data data = new Data();
	
	private JButton button_5;
	private JButton button_4;
	private JButton button_3;
	private JButton button_2;
	private JButton button_1;
	private JButton button;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel lblNewLabel_1;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel lb1;
	private JLabel lb2;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel lb3;
	private JLabel lb4;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JLabel lb5;
	private JLabel lb6;
	private JLabel label_33;
	private JLabel label_34;
	private JLabel label_35;
	private JLabel label_36;
	private JLabel lb7;
	
	private String a="구매완료";
	private String b;
	
	private ImageIcon oldimageicon = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\uzi.PNG");
	private Image oldimage = oldimageicon.getImage();
	private Image newimage = oldimage.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon = new ImageIcon(newimage);

	private ImageIcon oldimageicon1 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\tommy.PNG");
	private Image oldimage1 = oldimageicon1.getImage();
	private Image newimage1 = oldimage1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon1 = new ImageIcon(newimage1);
	
	private ImageIcon oldimageicon2 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\groza.PNG");
	private Image oldimage2 = oldimageicon2.getImage();
	private Image newimage2 = oldimage2.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon2 = new ImageIcon(newimage2);

	private ImageIcon oldimageicon3 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\sks.PNG");
	private Image oldimage3 = oldimageicon3.getImage();
	private Image newimage3 = oldimage3.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon3 = new ImageIcon(newimage3);
	
	private ImageIcon oldimageicon4 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\awm.PNG");
	private Image oldimage4 = oldimageicon4.getImage();
	private Image newimage4 = oldimage4.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon4 = new ImageIcon(newimage4);

	private ImageIcon oldimageicon5 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\m16.PNG");
	private Image oldimage5 = oldimageicon5.getImage();
	private Image newimage5 = oldimage5.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon5 = new ImageIcon(newimage5);
	
	private ImageIcon oldimageicon6 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\무기\\akm.PNG");
	private Image oldimage6 = oldimageicon6.getImage();
	private Image newimage6 = oldimage6.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon6 = new ImageIcon(newimage6);
	
	public ZzolPanel() {
		setBackground(new Color(255, 255, 153));
		
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
			public void actionPerformed(ActionEvent arg0) {
				File.loadProperties(data);
				int zzolpowerlimit1 = 5;
				int zzolhealthlimit1 = 20;
				
				if(data.GetCs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 400) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetZzolPower() < zzolpowerlimit1 && data.GetZzolHealth() < zzolhealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetZzolLimit1()==0) {
					int money = data.GetMoney()-400;
					data.SetMoney(money);
					data.SetZzolLimit1(1);
					lb1.setText("구매완료");
					}
					data.SetCs(1);
					data.SetZzolInvenPower(3);
					data.SetZzolInvenHealth(10);
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
		
		button_4 = new JButton("");
		button_4.setIcon(newimageicon1);
		button_4.setBorderPainted(false);
		button_4.setBackground(new Color(255, 255, 153));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				int zzolpowerlimit1 = 10;
				int zzolhealthlimit1 = 35;
				
				if(data.GetCs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 700) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetZzolPower() < zzolpowerlimit1 && data.GetZzolHealth() < zzolhealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetZzolLimit2()==0) {
					int money = data.GetMoney()-700;
					data.SetMoney(money);
					data.SetZzolLimit2(1);
					lb2.setText("구매완료");
					}
					data.SetCs(1);
					data.SetZzolInvenPower(7);
					data.SetZzolInvenHealth(15);
					data.save();
				}
			}
		});
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 2;
		gbc_button_4.gridy = 0;
		add(button_4, gbc_button_4);
		
		button_3 = new JButton("");
		button_3.setIcon(newimageicon2);
		button_3.setBorderPainted(false);
		button_3.setBackground(new Color(255, 255, 153));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				int zzolpowerlimit1 =20;
				int zzolhealthlimit1 = 55;
				
				if(data.GetCs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 1200) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetZzolPower() < zzolpowerlimit1 && data.GetZzolHealth() < zzolhealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetZzolLimit3()==0) {
					int money = data.GetMoney()-1200;
					data.SetMoney(money);
					data.SetZzolLimit3(1);
					lb3.setText("구매완료");
					}
					data.SetCs(1);
					data.SetZzolInvenPower(15);
					data.SetZzolInvenHealth(25);
					data.save();
				}
			}
		});
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 3;
		gbc_button_3.gridy = 0;
		add(button_3, gbc_button_3);
		
		button_2 = new JButton("");
		button_2.setIcon(newimageicon3);
		button_2.setBorderPainted(false);
		button_2.setBackground(new Color(255, 255, 153));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				int zzolpowerlimit1 = 35;
				int zzolhealthlimit1 = 80;

				if(data.GetCs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() <2000) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetZzolPower() < zzolpowerlimit1 && data.GetZzolHealth() < zzolhealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetZzolLimit4()==0) {
					int money = data.GetMoney()-2000;
					data.SetMoney(money);
					data.SetZzolLimit4(1);
					lb4.setText("구매완료");
					}
					data.SetCs(1);
					data.SetZzolInvenPower(25);
					data.SetZzolInvenHealth(40);
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
		
		button_1 = new JButton("");
		button_1.setIcon(newimageicon4);
		button_1.setBorderPainted(false);
		button_1.setBackground(new Color(255, 255, 153));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				int zzolpowerlimit1 = 55;
				int zzolhealthlimit1 = 140;
				
				if(data.GetCs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 3000) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetZzolPower() < zzolpowerlimit1 && data.GetZzolHealth() < zzolhealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetZzolLimit5()==0) {
					int money = data.GetMoney()-3000;
					data.SetMoney(money);
					data.SetZzolLimit5(1);
					lb5.setText("구매완료");
					}
					data.SetCs(1);
					data.SetZzolInvenPower(40);
					data.SetZzolInvenHealth(55);
					data.save();
				}
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 5;
		gbc_button_1.gridy = 0;
		add(button_1, gbc_button_1);
		
		button = new JButton("");
		button.setIcon(newimageicon5);
		button.setBorderPainted(false);
		button.setBackground(new Color(255, 255, 153));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				int zzolpowerlimit1 = 80;
				int zzolhealthlimit1 = 240;
				
				if(data.GetCs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 4500) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetZzolPower() < zzolpowerlimit1 && data.GetZzolHealth() < zzolhealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetZzolLimit6()==0) {
					int money = data.GetMoney()-4500;
					data.SetMoney(money);
					data.SetZzolLimit6(1);
					lb6.setText("구매완료");
					}
					data.SetCs(1);
					data.SetZzolInvenPower(55);
					data.SetZzolInvenHealth(70);
					data.save();
				}
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 6;
		gbc_button.gridy = 0;
		add(button, gbc_button);
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(newimageicon6);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(255, 255, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				int zzolpowerlimit1 = 110;
				int zzolhealthlimit1 = 400;
				
				if(data.GetCs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < 7000) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetZzolPower() < zzolpowerlimit1 && data.GetZzolHealth() < zzolhealthlimit1){
					JOptionPane.showMessageDialog(null, "능력치가 부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					if(data.GetZzolLimit7()==0) {
					int money = data.GetMoney()-7000;
					data.SetMoney(money);
					data.SetZzolLimit7(1);
					lb7.setText("구매완료");
					}
					data.SetCs(1);
					data.SetZzolInvenPower(80);
					data.SetZzolInvenHealth(100);
					data.save();
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 7;
		gbc_btnNewButton.gridy = 0;
		add(btnNewButton, gbc_btnNewButton);
		
		lblNewLabel_1 = new JLabel("공격력 제한");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		lblNewLabel = new JLabel("5");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		label = new JLabel("10");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 2;
		gbc_label.gridy = 1;
		add(label, gbc_label);
		
		label_1 = new JLabel("20");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 3;
		gbc_label_1.gridy = 1;
		add(label_1, gbc_label_1);
		
		label_2 = new JLabel("35");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 4;
		gbc_label_2.gridy = 1;
		add(label_2, gbc_label_2);
		
		label_3 = new JLabel("55");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 5;
		gbc_label_3.gridy = 1;
		add(label_3, gbc_label_3);
		
		label_4 = new JLabel("80");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 6;
		gbc_label_4.gridy = 1;
		add(label_4, gbc_label_4);
		
		label_5 = new JLabel("110");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 0);
		gbc_label_5.gridx = 7;
		gbc_label_5.gridy = 1;
		add(label_5, gbc_label_5);
		
		label_13 = new JLabel("체력 제한");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 0;
		gbc_label_13.gridy = 2;
		add(label_13, gbc_label_13);
		
		label_6 = new JLabel("20");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 2;
		add(label_6, gbc_label_6);
		
		label_7 = new JLabel("35");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 2;
		gbc_label_7.gridy = 2;
		add(label_7, gbc_label_7);
		
		label_8 = new JLabel("55");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 3;
		gbc_label_8.gridy = 2;
		add(label_8, gbc_label_8);
		
		label_9 = new JLabel("80");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 4;
		gbc_label_9.gridy = 2;
		add(label_9, gbc_label_9);
		
		label_10 = new JLabel("140");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 5;
		gbc_label_10.gridy = 2;
		add(label_10, gbc_label_10);
		
		label_11 = new JLabel("240");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 6;
		gbc_label_11.gridy = 2;
		add(label_11, gbc_label_11);
		
		label_12 = new JLabel("400");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.insets = new Insets(0, 0, 5, 0);
		gbc_label_12.gridx = 7;
		gbc_label_12.gridy = 2;
		add(label_12, gbc_label_12);
		
		label_14 = new JLabel("금액");
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 0;
		gbc_label_14.gridy = 3;
		add(label_14, gbc_label_14);
		
		File.loadProperties(data);
		
		if(data.GetZzolLimit1()==1)
			b=a;
		else
			b="400원";
		
		lb1 = new JLabel(b);
		GridBagConstraints gbc_lb1 = new GridBagConstraints();
		gbc_lb1.insets = new Insets(0, 0, 5, 5);
		gbc_lb1.gridx = 1;
		gbc_lb1.gridy = 3;
		add(lb1, gbc_lb1);
		
		if(data.GetZzolLimit2()==1)
			b=a;
		else
			b="700원";
		
		lb2 = new JLabel(b);
		GridBagConstraints gbc_lb2 = new GridBagConstraints();
		gbc_lb2.insets = new Insets(0, 0, 5, 5);
		gbc_lb2.gridx = 2;
		gbc_lb2.gridy = 3;
		add(lb2, gbc_lb2);
		
		if(data.GetZzolLimit3()==1)
			b=a;
		else
			b="1200원";
		
		lb3 = new JLabel(b);
		GridBagConstraints gbc_lb3 = new GridBagConstraints();
		gbc_lb3.insets = new Insets(0, 0, 5, 5);
		gbc_lb3.gridx = 3;
		gbc_lb3.gridy = 3;
		add(lb3, gbc_lb3);
		
		if(data.GetZzolLimit4()==1)
			b=a;
		else
			b="2000원";
		
		lb4 = new JLabel(b);
		GridBagConstraints gbc_lb4 = new GridBagConstraints();
		gbc_lb4.insets = new Insets(0, 0, 5, 5);
		gbc_lb4.gridx = 4;
		gbc_lb4.gridy = 3;
		add(lb4, gbc_lb4);
		
		if(data.GetZzolLimit5()==1)
			b=a;
		else
			b="3000원";
		
		lb5 = new JLabel(b);
		GridBagConstraints gbc_lb5 = new GridBagConstraints();
		gbc_lb5.insets = new Insets(0, 0, 5, 5);
		gbc_lb5.gridx = 5;
		gbc_lb5.gridy = 3;
		add(lb5, gbc_lb5);
		
		if(data.GetZzolLimit6()==1)
			b=a;
		else
			b="4500원";
		
		lb6 = new JLabel(b);
		GridBagConstraints gbc_lb6 = new GridBagConstraints();
		gbc_lb6.insets = new Insets(0, 0, 5, 5);
		gbc_lb6.gridx = 6;
		gbc_lb6.gridy = 3;
		add(lb6, gbc_lb6);
		
		if(data.GetZzolLimit7()==1)
			b=a;
		else
			b="7000원";
		
		lb7 = new JLabel(b);
		GridBagConstraints gbc_lb7 = new GridBagConstraints();
		gbc_lb7.insets = new Insets(0, 0, 5, 0);
		gbc_lb7.gridx = 7;
		gbc_lb7.gridy = 3;
		add(lb7, gbc_lb7);
		
		label_15 = new JLabel("공격력 증가");
		GridBagConstraints gbc_label_15 = new GridBagConstraints();
		gbc_label_15.insets = new Insets(0, 0, 5, 5);
		gbc_label_15.gridx = 0;
		gbc_label_15.gridy = 4;
		add(label_15, gbc_label_15);
		
		label_18 = new JLabel("3");
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 1;
		gbc_label_18.gridy = 4;
		add(label_18, gbc_label_18);
		
		label_21 = new JLabel("7");
		GridBagConstraints gbc_label_21 = new GridBagConstraints();
		gbc_label_21.insets = new Insets(0, 0, 5, 5);
		gbc_label_21.gridx = 2;
		gbc_label_21.gridy = 4;
		add(label_21, gbc_label_21);
		
		label_24 = new JLabel("15");
		GridBagConstraints gbc_label_24 = new GridBagConstraints();
		gbc_label_24.insets = new Insets(0, 0, 5, 5);
		gbc_label_24.gridx = 3;
		gbc_label_24.gridy = 4;
		add(label_24, gbc_label_24);
		
		label_27 = new JLabel("25");
		GridBagConstraints gbc_label_27 = new GridBagConstraints();
		gbc_label_27.insets = new Insets(0, 0, 5, 5);
		gbc_label_27.gridx = 4;
		gbc_label_27.gridy = 4;
		add(label_27, gbc_label_27);
		
		label_30 = new JLabel("40");
		GridBagConstraints gbc_label_30 = new GridBagConstraints();
		gbc_label_30.insets = new Insets(0, 0, 5, 5);
		gbc_label_30.gridx = 5;
		gbc_label_30.gridy = 4;
		add(label_30, gbc_label_30);
		
		label_33 = new JLabel("55");
		GridBagConstraints gbc_label_33 = new GridBagConstraints();
		gbc_label_33.insets = new Insets(0, 0, 5, 5);
		gbc_label_33.gridx = 6;
		gbc_label_33.gridy = 4;
		add(label_33, gbc_label_33);
		
		label_36 = new JLabel("80");
		GridBagConstraints gbc_label_36 = new GridBagConstraints();
		gbc_label_36.insets = new Insets(0, 0, 5, 0);
		gbc_label_36.gridx = 7;
		gbc_label_36.gridy = 4;
		add(label_36, gbc_label_36);
		
		label_16 = new JLabel("체력 증가");
		GridBagConstraints gbc_label_16 = new GridBagConstraints();
		gbc_label_16.insets = new Insets(0, 0, 0, 5);
		gbc_label_16.gridx = 0;
		gbc_label_16.gridy = 5;
		add(label_16, gbc_label_16);
		
		label_17 = new JLabel("10");
		GridBagConstraints gbc_label_17 = new GridBagConstraints();
		gbc_label_17.insets = new Insets(0, 0, 0, 5);
		gbc_label_17.gridx = 1;
		gbc_label_17.gridy = 5;
		add(label_17, gbc_label_17);
		
		label_22 = new JLabel("15");
		GridBagConstraints gbc_label_22 = new GridBagConstraints();
		gbc_label_22.insets = new Insets(0, 0, 0, 5);
		gbc_label_22.gridx = 2;
		gbc_label_22.gridy = 5;
		add(label_22, gbc_label_22);
		
		label_23 = new JLabel("25");
		GridBagConstraints gbc_label_23 = new GridBagConstraints();
		gbc_label_23.insets = new Insets(0, 0, 0, 5);
		gbc_label_23.gridx = 3;
		gbc_label_23.gridy = 5;
		add(label_23, gbc_label_23);
		
		label_28 = new JLabel("40");
		GridBagConstraints gbc_label_28 = new GridBagConstraints();
		gbc_label_28.insets = new Insets(0, 0, 0, 5);
		gbc_label_28.gridx = 4;
		gbc_label_28.gridy = 5;
		add(label_28, gbc_label_28);
		
		label_29 = new JLabel("55");
		GridBagConstraints gbc_label_29 = new GridBagConstraints();
		gbc_label_29.insets = new Insets(0, 0, 0, 5);
		gbc_label_29.gridx = 5;
		gbc_label_29.gridy = 5;
		add(label_29, gbc_label_29);
		
		label_34 = new JLabel("70");
		GridBagConstraints gbc_label_34 = new GridBagConstraints();
		gbc_label_34.insets = new Insets(0, 0, 0, 5);
		gbc_label_34.gridx = 6;
		gbc_label_34.gridy = 5;
		add(label_34, gbc_label_34);
		
		label_35 = new JLabel("100");
		GridBagConstraints gbc_label_35 = new GridBagConstraints();
		gbc_label_35.gridx = 7;
		gbc_label_35.gridy = 5;
		add(label_35, gbc_label_35);
	}

}
