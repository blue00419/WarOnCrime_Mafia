package Group;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
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
import Stat.StatFrame;

public class GroupFrame extends JFrame{
	
	private Data data = new Data();
	private StatFrame statframe = new StatFrame();
	private AddPanel addpanel;
	
	private ImageIcon oldimageicon3;
	private Image oldimage3;
	private Image newimage3;
	private ImageIcon newimageicon3 ;
	
	private ImageIcon oldimageicon = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\캐릭\\대장.jpg");
	private Image oldimage = oldimageicon.getImage();
	private Image newimage = oldimage.getScaledInstance(180, 170, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon = new ImageIcon(newimage);
	
	private ImageIcon oldimageicon1 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\캐릭\\부대장.jpg");
	private Image oldimage1 = oldimageicon1.getImage();
	private Image newimage1 = oldimage1.getScaledInstance(180, 170, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon1 = new ImageIcon(newimage1);
	
	private ImageIcon oldimageicon2 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\캐릭\\부하.jpg");
	private Image oldimage2 = oldimageicon2.getImage();
	private Image newimage2 = oldimage2.getScaledInstance(180, 170, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon2 = new ImageIcon(newimage2);
	
	private JLabel caplb;
	private JLabel lblNewLabel;
	private JLabel offlb;
	private JLabel offlb1;
	private JLabel label;
	private JLabel offpricelb;
	private JButton offbtn1;
	private JLabel zzollb;
	private JLabel zzollb2;
	private JLabel label_1;
	private JLabel zzolprice1;
	private JButton zzolbtn;
	private JButton btnNewButton;
	
	public GroupFrame getGroupFrame() {
		return this;
	}
	
	public void SetImage(ImageIcon image) {
		this.newimageicon3 = image;
	}
	
	public ImageIcon GetImage() {
		return newimageicon3;
	}
	
	public GroupFrame() {
		setUndecorated(true);
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.PINK));
		getContentPane().setBackground(new Color(0, 0, 0));
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(0, 0, 0));
		File.loadProperties(data);
		
		setTitle("부하관리");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		btnNewButton = new JButton("관리 창 닫기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setForeground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 0;
		getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		caplb = new JLabel("대장");
		caplb.setForeground(new Color(255, 255, 255));
		caplb.setHorizontalAlignment(SwingConstants.CENTER);
		caplb.setFont(new Font("굴림", Font.BOLD, 40));
		caplb.setVerticalTextPosition(SwingConstants.BOTTOM);
		GridBagConstraints gbc_caplb = new GridBagConstraints();
		gbc_caplb.gridheight = 2;
		gbc_caplb.gridwidth = 2;
		gbc_caplb.fill = GridBagConstraints.BOTH;
		gbc_caplb.insets = new Insets(0, 0, 5, 5);
		gbc_caplb.gridx = 0;
		gbc_caplb.gridy = 1;
		getContentPane().add(caplb, gbc_caplb);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(newimageicon);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridheight = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		offlb = new JLabel("부대장");
		offlb.setForeground(new Color(255, 255, 255));
		offlb.setHorizontalAlignment(SwingConstants.CENTER);
		offlb.setFont(new Font("굴림", Font.BOLD, 20));
		GridBagConstraints gbc_offlb = new GridBagConstraints();
		gbc_offlb.fill = GridBagConstraints.BOTH;
		gbc_offlb.insets = new Insets(0, 0, 5, 5);
		gbc_offlb.gridx = 0;
		gbc_offlb.gridy = 3;
		getContentPane().add(offlb, gbc_offlb);
		
		String off = Integer.toString(data.GetOff());
		String offs = off+" / 9";
		offlb1 = new JLabel(offs);
		offlb1.setForeground(new Color(255, 255, 255));
		offlb1.setFont(new Font("굴림", Font.BOLD, 20));
		offlb1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_offlb1 = new GridBagConstraints();
		gbc_offlb1.fill = GridBagConstraints.BOTH;
		gbc_offlb1.insets = new Insets(0, 0, 5, 5);
		gbc_offlb1.gridx = 1;
		gbc_offlb1.gridy = 3;
		getContentPane().add(offlb1, gbc_offlb1);
		
		label = new JLabel("");
		label.setIcon(newimageicon1);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridwidth = 2;
		gbc_label.gridheight = 2;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 2;
		gbc_label.gridy = 3;
		getContentPane().add(label, gbc_label);
		
		String offprice = Integer.toString(data.GetOffPrice());
		offpricelb = new JLabel(offprice);
		offpricelb.setForeground(new Color(255, 255, 255));
		offpricelb.setFont(new Font("굴림", Font.BOLD, 20));
		GridBagConstraints gbc_offpricelb = new GridBagConstraints();
		gbc_offpricelb.insets = new Insets(0, 0, 5, 5);
		gbc_offpricelb.gridx = 0;
		gbc_offpricelb.gridy = 4;
		getContentPane().add(offpricelb, gbc_offpricelb);
		
		offbtn1 = new JButton("영입하기");
		offbtn1.setBackground(new Color(105, 105, 105));
		offbtn1.setForeground(new Color(255, 255, 255));
		offbtn1.setFont(new Font("굴림", Font.PLAIN, 20));
		offbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				if(data.GetBs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetOff() == 9){
					JOptionPane.showMessageDialog(null, "최대인원입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetMoney() < data.GetOffPrice()) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					int money = data.GetMoney()-data.GetOffPrice();
					data.SetMoney(money);

					int a = data.GetOff()+1;
					data.SetOff(a);
					int b = data.GetOffPrice()+1000;
					data.SetOffPrice(b);
					data.SetBs(1);
					
					String off = Integer.toString(data.GetOff());
					String offs = off+" / 9";
					offlb1.setText(offs);
					
					String offprice = Integer.toString(data.GetOffPrice());
					offpricelb.setText(offprice);
					
					statframe.SetOff(data.GetOff()+1);

					int capgrouppowers = data.GetCapPower()+data.GetCapInvenPower()+(data.GetZzolPower()+data.GetZzolInvenPower())*data.GetZzol();
					String capgrouppower = Integer.toString(capgrouppowers);
					data.SetCapGroupPower(capgrouppowers);
					
					int capgrouphealths = data.GetCapHealth()+data.GetCapInvenHealth()+(data.GetZzolHealth()+data.GetZzolInvenHealth())*data.GetZzol();
					String capgrouphealth = Integer.toString(capgrouphealths);
					data.SetCapGroupHealth(capgrouphealths);
					
					int offgrouppowers = data.GetOffPower()+data.GetOffInvenPower()+(data.GetOffInvenPower()+data.GetZzolPower())*data.GetZzol();
					String offgrouppower = Integer.toString(offgrouppowers);
					data.SetOffGroupPower(offgrouppowers);
					
					int offgrouphealths = data.GetOffHealth()+data.GetOffInvenHealth()+(data.GetZzolInvenHealth()+data.GetZzolHealth())*data.GetZzol();
					String offgrouphealth = Integer.toString(offgrouphealths);
					data.SetOffGroupHealth(offgrouphealths);
					
					int allgrouppowers = data.GetCapGroupPower()+data.GetOff()*data.GetOffGroupPower();
					String allgrouppower = Integer.toString(allgrouppowers);
					data.SetAllPower(allgrouppowers);
					
					int allgrouphealths = data.GetCapGroupHealth()+data.GetOff()*data.GetOffGroupHealth();
					String allgrouphealth = Integer.toString(allgrouphealths);
					data.SetAllHealth(allgrouphealths);
					
					oldimageicon3 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\캐릭\\부대장.jpg");
					oldimage3 = oldimageicon3.getImage();
					newimage3 = oldimage3.getScaledInstance(410, 600, Image.SCALE_SMOOTH);
					newimageicon3 = new ImageIcon(newimage3);
					SetImage(newimageicon3);
					
					
					addpanel = new AddPanel(getGroupFrame());

					data.save();

					setContentPane(addpanel);
					revalidate();
				}
			}
		});
		GridBagConstraints gbc_offbtn1 = new GridBagConstraints();
		gbc_offbtn1.fill = GridBagConstraints.BOTH;
		gbc_offbtn1.insets = new Insets(0, 0, 5, 5);
		gbc_offbtn1.gridx = 1;
		gbc_offbtn1.gridy = 4;
		getContentPane().add(offbtn1, gbc_offbtn1);
		
		zzollb = new JLabel("부하");
		zzollb.setForeground(new Color(255, 255, 255));
		zzollb.setHorizontalAlignment(SwingConstants.CENTER);
		zzollb.setFont(new Font("굴림", Font.BOLD, 20));
		GridBagConstraints gbc_zzollb = new GridBagConstraints();
		gbc_zzollb.fill = GridBagConstraints.BOTH;
		gbc_zzollb.insets = new Insets(0, 0, 5, 5);
		gbc_zzollb.gridx = 0;
		gbc_zzollb.gridy = 5;
		getContentPane().add(zzollb, gbc_zzollb);
		
		String zzol = Integer.toString(data.GetZzol());
		String zzols = zzol+" / 30";
		zzollb2 = new JLabel(zzols);
		zzollb2.setForeground(new Color(255, 255, 255));
		zzollb2.setFont(new Font("굴림", Font.BOLD, 20));
		zzollb2.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_zzollb2 = new GridBagConstraints();
		gbc_zzollb2.fill = GridBagConstraints.BOTH;
		gbc_zzollb2.insets = new Insets(0, 0, 5, 5);
		gbc_zzollb2.gridx = 1;
		gbc_zzollb2.gridy = 5;
		getContentPane().add(zzollb2, gbc_zzollb2);
		
		label_1 = new JLabel("");
		label_1.setIcon(newimageicon2);
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.gridwidth = 2;
		gbc_label_1.gridheight = 2;
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 5;
		getContentPane().add(label_1, gbc_label_1);
		
		String zzolprice = Integer.toString(data.GetZzolPrice());
		zzolprice1 = new JLabel(zzolprice);
		zzolprice1.setForeground(new Color(255, 255, 255));
		zzolprice1.setFont(new Font("굴림", Font.BOLD, 20));
		zzolprice1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_zzolprice1 = new GridBagConstraints();
		gbc_zzolprice1.insets = new Insets(0, 0, 0, 5);
		gbc_zzolprice1.gridx = 0;
		gbc_zzolprice1.gridy = 6;
		getContentPane().add(zzolprice1, gbc_zzolprice1);
		
		zzolbtn = new JButton("영입하기");
		zzolbtn.setForeground(new Color(248, 248, 255));
		zzolbtn.setBackground(new Color(105, 105, 105));
		zzolbtn.setFont(new Font("굴림", Font.PLAIN, 20));
		zzolbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				if(data.GetCs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetZzol() == 30){
					JOptionPane.showMessageDialog(null, "최대인원입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else if(data.GetMoney() < data.GetZzolPrice()) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					int money = data.GetMoney()-data.GetZzolPrice();
					data.SetMoney(money);
					
					int a = data.GetZzol()+1;
					data.SetZzol(a);
					int b = data.GetZzolPrice()+1000;
					data.SetZzolPrice(b);
					data.SetCs(1);
					
					String zzol = Integer.toString(data.GetZzol());
					String zzols = zzol+" / 30";
					zzollb2.setText(zzols);
					
					String zzolprice = Integer.toString(data.GetZzolPrice());
					zzolprice1.setText(zzolprice);
					
					statframe.SetZzol(data.GetZzol()+1);
					
					int capgrouppowers = data.GetCapPower()+data.GetCapInvenPower()+(data.GetZzolPower()+data.GetZzolInvenPower())*data.GetZzol();
					String capgrouppower = Integer.toString(capgrouppowers);
					data.SetCapGroupPower(capgrouppowers);
					
					int capgrouphealths = data.GetCapHealth()+data.GetCapInvenHealth()+(data.GetZzolHealth()+data.GetZzolInvenHealth())*data.GetZzol();
					String capgrouphealth = Integer.toString(capgrouphealths);
					data.SetCapGroupHealth(capgrouphealths);
					
					int offgrouppowers = data.GetOffPower()+data.GetOffInvenPower()+(data.GetOffInvenPower()+data.GetZzolPower())*data.GetZzol();
					String offgrouppower = Integer.toString(offgrouppowers);
					data.SetOffGroupPower(offgrouppowers);
					
					int offgrouphealths = data.GetOffHealth()+data.GetOffInvenHealth()+(data.GetZzolInvenHealth()+data.GetZzolHealth())*data.GetZzol();
					String offgrouphealth = Integer.toString(offgrouphealths);
					data.SetOffGroupHealth(offgrouphealths);
					
					int allgrouppowers = data.GetCapGroupPower()+data.GetOff()*data.GetOffGroupPower();
					String allgrouppower = Integer.toString(allgrouppowers);
					data.SetAllPower(allgrouppowers);
					
					int allgrouphealths = data.GetCapGroupHealth()+data.GetOff()*data.GetOffGroupHealth();
					String allgrouphealth = Integer.toString(allgrouphealths);
					data.SetAllHealth(allgrouphealths);
					
					oldimageicon3 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\캐릭\\부하.jpg");
					oldimage3 = oldimageicon3.getImage();
					newimage3 = oldimage3.getScaledInstance(410, 600, Image.SCALE_SMOOTH);
					newimageicon3 = new ImageIcon(newimage3);
					SetImage(newimageicon3);
					
					
					addpanel = new AddPanel(getGroupFrame());

					data.save();

					setContentPane(addpanel);
					revalidate();
				}
			}
		});
		GridBagConstraints gbc_zzolbtn = new GridBagConstraints();
		gbc_zzolbtn.fill = GridBagConstraints.BOTH;
		gbc_zzolbtn.insets = new Insets(0, 0, 0, 5);
		gbc_zzolbtn.gridx = 1;
		gbc_zzolbtn.gridy = 6;
		getContentPane().add(zzolbtn, gbc_zzolbtn);
	}
}
