package Stat;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Data.Data;
import Data.File;

public class StatFrame extends JFrame{
	
	private StatFrame statframe;
	private Container previous;
	private Data data = new Data();
	private String Url;
	private int delay;
	
	private ImageIcon oldimageicon = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\배경2.jpg");
	private Image oldimage = oldimageicon.getImage();
	private Image newimage = oldimage.getScaledInstance(405, 570, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon = new ImageIcon(newimage);
	
	private JLabel label_10;
	private JLabel slb1;
	private JLabel plb1;
	private JLabel slb2;
	private JLabel plb2;
	private JLabel off1;
	private JLabel slb3;
	private JLabel plb3;
	private JLabel caplb;
	private JLabel label_3;
	private JLabel label_6;
	private JButton button_5;
	private JLabel label_4;
	private JLabel label_7;
	private JButton button_4;
	private JLabel offlb;
	private JLabel label;
	private JLabel label_8;
	private JButton button_3;
	private JLabel label_2;
	private JLabel slb4;
	private JLabel label_9;
	private JLabel plb4;
	private JButton button_2;
	private JLabel zzollb;
	private JLabel zzol1;
	private JLabel label_1;
	private JLabel slb5;
	private JLabel plb5;
	private JButton button_1;
	private JLabel label_5;
	private JLabel slb6;
	private JLabel label_11;
	private JLabel plb6;
	private JButton button;
	private JLabel capgrouplb;
	private JLabel offgrouplb;
	private JLabel capglb1;
	private JLabel label_13;
	private JLabel capglb2;
	private JLabel label_15;
	private JLabel offglb1;
	private JLabel label_17;
	private JLabel offglb2;
	private JLabel allgrouplb;
	private JLabel label_14;
	private JLabel label_16;
	private JLabel allglb1;
	private JLabel allglb2;
	private JLabel lblNewLabel;
	
	public StatFrame(){
		getContentPane().setBackground(new Color(0, 0, 0));
		File.loadProperties(data);

		statframe = this;
		setUndecorated(true);
		getContentPane().setLayout(null);
		getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.PINK));
		
		caplb = new JLabel("대장");
		caplb.setForeground(new Color(255, 255, 255));
		caplb.setBackground(new Color(255, 255, 255));
		caplb.setHorizontalAlignment(SwingConstants.CENTER);
		caplb.setBounds(30, 12, 62, 18);
		getContentPane().add(caplb);
		
		label_3 = new JLabel("공격력");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setBackground(new Color(255, 255, 255));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(0, 42, 62, 18);
		getContentPane().add(label_3);
		
		String cappower = Integer.toString(data.GetCapPower()+data.GetCapInvenPower());
		slb1 = new JLabel(cappower);
		slb1.setForeground(new Color(255, 255, 255));
		slb1.setHorizontalAlignment(SwingConstants.CENTER);
		slb1.setBounds(58, 42, 47, 18);
		getContentPane().add(slb1);
		
		label_2 = new JLabel("업그레이드 비용");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(105, 42, 111, 18);
		getContentPane().add(label_2);
		
		String cappowerprice = Integer.toString(data.GetCapPowerPrice());
		plb1 = new JLabel(cappowerprice);
		plb1.setForeground(new Color(255, 255, 255));
		plb1.setHorizontalAlignment(SwingConstants.CENTER);
		plb1.setBounds(213, 42, 62, 18);
		getContentPane().add(plb1);
		
		label_4 = new JLabel("체력");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(0, 86, 62, 18);
		getContentPane().add(label_4);
		
		String caphealth = Integer.toString(data.GetCapHealth()+data.GetCapInvenHealth());
		slb2 = new JLabel(caphealth);
		slb2.setForeground(new Color(255, 255, 255));
		slb2.setHorizontalAlignment(SwingConstants.CENTER);
		slb2.setBounds(58, 86, 47, 18);
		getContentPane().add(slb2);
		
		String caphealthprice = Integer.toString(data.GetCapHealthPrice());
		
		label_6 = new JLabel("업그레이드 비용");
		label_6.setForeground(new Color(255, 255, 255));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(105, 86, 111, 18);
		getContentPane().add(label_6);
		plb2 = new JLabel(caphealthprice);
		plb2.setForeground(new Color(255, 255, 255));
		plb2.setHorizontalAlignment(SwingConstants.CENTER);
		plb2.setBounds(213, 86, 62, 18);
		getContentPane().add(plb2);
		
		label_8 = new JLabel("부대장");
		label_8.setForeground(new Color(255, 255, 255));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(30, 130, 62, 18);
		getContentPane().add(label_8);
		
		String off = String.valueOf(data.GetOff())+" / 9";
		off1 = new JLabel(off);
		off1.setForeground(new Color(255, 255, 255));
		off1.setHorizontalAlignment(SwingConstants.CENTER);
		off1.setBounds(122, 130, 62, 18);
		getContentPane().add(off1);
		
		label_10 = new JLabel("공격력");
		label_10.setForeground(new Color(255, 255, 255));
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(0, 172, 62, 18);
		getContentPane().add(label_10);
		
		String offpower = Integer.toString(data.GetOffPower()+data.GetOffInvenPower());
		slb3 = new JLabel(offpower);
		slb3.setForeground(new Color(255, 255, 255));
		slb3.setHorizontalAlignment(SwingConstants.CENTER);
		slb3.setBounds(58, 172, 47, 18);
		getContentPane().add(slb3);
		
		label_7 = new JLabel("업그레이드 비용");
		label_7.setForeground(new Color(255, 255, 255));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(105, 172, 111, 18);
		getContentPane().add(label_7);
		
		String offpowerprice = Integer.toString(data.GetOffPowerPrice());
		plb3 = new JLabel(offpowerprice);
		plb3.setForeground(new Color(255, 255, 255));
		plb3.setHorizontalAlignment(SwingConstants.CENTER);
		plb3.setBounds(213, 172, 62, 18);
		getContentPane().add(plb3);
		
		label_14 = new JLabel("체력");
		label_14.setForeground(new Color(255, 255, 255));
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBounds(0, 215, 62, 18);
		getContentPane().add(label_14);
		
		String offhealth = Integer.toString(data.GetOffHealth()+data.GetOffInvenHealth());
		slb4 = new JLabel(offhealth);
		slb4.setForeground(new Color(255, 255, 255));
		slb4.setHorizontalAlignment(SwingConstants.CENTER);
		slb4.setBounds(58, 215, 47, 18);
		getContentPane().add(slb4);
		
		label_16 = new JLabel("업그레이드 비용");
		label_16.setForeground(new Color(255, 255, 255));
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBounds(105, 215, 111, 18);
		getContentPane().add(label_16);
		
		String offhealthprice = Integer.toString(data.GetOffHealthPrice());
		plb4 = new JLabel(offhealthprice);
		plb4.setForeground(new Color(255, 255, 255));
		plb4.setHorizontalAlignment(SwingConstants.CENTER);
		plb4.setBounds(213, 215, 62, 18);
		getContentPane().add(plb4);
		
		offlb = new JLabel("부하");
		offlb.setForeground(new Color(255, 255, 255));
		offlb.setHorizontalAlignment(SwingConstants.CENTER);
		offlb.setBounds(30, 245, 62, 18);
		getContentPane().add(offlb);
		
		String zzol = String.valueOf(data.GetZzol())+" / 30";
		zzol1 = new JLabel(zzol);
		zzol1.setForeground(new Color(255, 255, 255));
		zzol1.setHorizontalAlignment(SwingConstants.CENTER);
		zzol1.setBounds(122, 245, 62, 18);
		getContentPane().add(zzol1);
		
		label = new JLabel("공격력");
		label.setForeground(new Color(255, 255, 255));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 275, 62, 18);
		getContentPane().add(label);
		
		String zzolpower = Integer.toString(data.GetZzolPower()+data.GetZzolInvenPower());
		slb5 = new JLabel(zzolpower);
		slb5.setForeground(new Color(255, 255, 255));
		slb5.setHorizontalAlignment(SwingConstants.CENTER);
		slb5.setBounds(58, 275, 47, 18);
		getContentPane().add(slb5);
		
		label_9 = new JLabel("업그레이드 비용");
		label_9.setForeground(new Color(255, 255, 255));
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(105, 275, 111, 18);
		getContentPane().add(label_9);
		
		String zzolpowerprice = Integer.toString(data.GetZzolPowerPrice());
		plb5 = new JLabel(zzolpowerprice);
		plb5.setForeground(new Color(255, 255, 255));
		plb5.setHorizontalAlignment(SwingConstants.CENTER);
		plb5.setBounds(213, 275, 62, 18);
		getContentPane().add(plb5);
		
		zzollb = new JLabel("체력");
		zzollb.setForeground(new Color(255, 255, 255));
		zzollb.setHorizontalAlignment(SwingConstants.CENTER);
		zzollb.setBounds(0, 319, 62, 18);
		getContentPane().add(zzollb);
		
		String zzolhealth = Integer.toString(data.GetZzolHealth()+data.GetZzolInvenHealth());
		slb6 = new JLabel(zzolhealth);
		slb6.setForeground(new Color(255, 255, 255));
		slb6.setHorizontalAlignment(SwingConstants.CENTER);
		slb6.setBounds(58, 319, 47, 18);
		getContentPane().add(slb6);
		
		label_1 = new JLabel("업그레이드 비용");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(105, 319, 111, 18);
		getContentPane().add(label_1);
		
		String zzolhealthprice = Integer.toString(data.GetZzolHealthPrice());
		plb6 = new JLabel(zzolhealthprice);
		plb6.setForeground(new Color(255, 255, 255));
		plb6.setHorizontalAlignment(SwingConstants.CENTER);
		plb6.setBounds(213, 319, 62, 18);
		getContentPane().add(plb6);
		
		label_5 = new JLabel("대장 그룹");
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(30, 361, 96, 18);
		getContentPane().add(label_5);
		
		label_11 = new JLabel("총 공격력");
		label_11.setForeground(new Color(255, 255, 255));
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(14, 404, 62, 18);
		getContentPane().add(label_11);
		
		int capgrouppowers = data.GetCapPower()+data.GetCapInvenPower()+(data.GetZzolPower()+data.GetZzolInvenPower())*data.GetZzol();
		String capgrouppower = Integer.toString(capgrouppowers);
		capglb1 = new JLabel(capgrouppower);
		capglb1.setForeground(new Color(255, 255, 255));
		capglb1.setHorizontalAlignment(SwingConstants.CENTER);
		capglb1.setBounds(105, 404, 62, 18);
		getContentPane().add(capglb1);
		
		capgrouplb = new JLabel("총 체력");
		capgrouplb.setForeground(new Color(255, 255, 255));
		capgrouplb.setHorizontalAlignment(SwingConstants.CENTER);
		capgrouplb.setBounds(192, 404, 62, 18);
		getContentPane().add(capgrouplb);
		
		int capgrouphealths = data.GetCapHealth()+data.GetCapInvenHealth()+(data.GetZzolHealth()+data.GetZzolInvenHealth())*data.GetZzol();
		String capgrouphealth = Integer.toString(capgrouphealths);
		capglb2 = new JLabel(capgrouphealth);
		capglb2.setForeground(new Color(255, 255, 255));
		capglb2.setHorizontalAlignment(SwingConstants.CENTER);
		capglb2.setBounds(296, 404, 62, 18);
		getContentPane().add(capglb2);
		
		allgrouplb = new JLabel("부대장 그룹");
		allgrouplb.setForeground(new Color(255, 255, 255));
		allgrouplb.setHorizontalAlignment(SwingConstants.CENTER);
		allgrouplb.setBounds(30, 450, 96, 18);
		getContentPane().add(allgrouplb);
		
		label_13 = new JLabel("총 공격력");
		label_13.setForeground(new Color(255, 255, 255));
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(14, 494, 62, 18);
		getContentPane().add(label_13);
		
		int offgrouppowers = data.GetOffPower()+data.GetOffInvenPower()+(data.GetOffInvenPower()+data.GetZzolPower())*data.GetZzol();
		String offgrouppower = Integer.toString(offgrouppowers);
		offglb1 = new JLabel(offgrouppower);
		offglb1.setForeground(new Color(255, 255, 255));
		offglb1.setHorizontalAlignment(SwingConstants.CENTER);
		offglb1.setBounds(105, 494, 62, 18);
		getContentPane().add(offglb1);
		
		label_17 = new JLabel("총 체력");
		label_17.setForeground(new Color(255, 255, 255));
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setBounds(192, 494, 62, 18);
		getContentPane().add(label_17);
		
		int offgrouphealths = data.GetOffHealth()+data.GetOffInvenHealth()+(data.GetZzolInvenHealth()+data.GetZzolHealth())*data.GetZzol();
		String offgrouphealth = Integer.toString(offgrouphealths);
		offglb2 = new JLabel(offgrouphealth);
		offglb2.setForeground(new Color(255, 255, 255));
		offglb2.setHorizontalAlignment(SwingConstants.CENTER);
		offglb2.setBounds(296, 494, 62, 18);
		getContentPane().add(offglb2);
		
		label_15 = new JLabel("전체 그룹");
		label_15.setForeground(new Color(255, 255, 255));
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(30, 537, 96, 18);
		getContentPane().add(label_15);
		
		offgrouplb = new JLabel("총 공격력");
		offgrouplb.setForeground(new Color(255, 255, 255));
		offgrouplb.setHorizontalAlignment(SwingConstants.CENTER);
		offgrouplb.setBounds(14, 578, 62, 18);
		getContentPane().add(offgrouplb);
		
		int allgrouppowers = data.GetCapGroupPower()+data.GetOff()*data.GetOffGroupPower();
		String allgrouppower = Integer.toString(allgrouppowers);
		allglb1 = new JLabel(allgrouppower);
		allglb1.setForeground(new Color(255, 255, 255));
		allglb1.setHorizontalAlignment(SwingConstants.CENTER);
		allglb1.setBounds(105, 578, 62, 18);
		getContentPane().add(allglb1);
		
		lblNewLabel = new JLabel("총 체력");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(192, 578, 62, 18);
		getContentPane().add(lblNewLabel);
		
		int allgrouphealths = data.GetCapGroupHealth()+data.GetOff()*data.GetOffGroupHealth();
		String allgrouphealth = Integer.toString(allgrouphealths);
		allglb2 = new JLabel(allgrouphealth);
		allglb2.setForeground(new Color(255, 255, 255));
		allglb2.setHorizontalAlignment(SwingConstants.CENTER);
		allglb2.setBounds(296, 578, 62, 18);
		getContentPane().add(allglb2);
		
		button_5 = new JButton("업그레이드");
		button_5.setBackground(new Color(105, 105, 105));
		button_5.setForeground(new Color(255, 255, 255));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				File.loadProperties(data);
				
				if(data.GetAs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < data.GetCapPowerPrice()) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					int money = data.GetMoney()-data.GetCapPowerPrice();
					data.SetMoney(money);
					int a = data.GetCapPower()+5;
					data.SetCapPower(a);
					int b = data.GetCapPowerPrice()+50;
					data.SetCapPowerPrice(b);
					data.SetAs(1);

					SetStatFrame(statframe);
					previous = getContentPane();
					try {
						String URL = "C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\사격3.gif";
						SetUrl(URL);
						delay = 1500;
						UpgradePanel upgradepanel = new UpgradePanel(statframe);
						setContentPane(upgradepanel);
						
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					revalidate();
					
					String cappower = Integer.toString(data.GetCapPower()+data.GetCapInvenPower());
					slb1.setText(cappower);
					String cappowerprice = Integer.toString(data.GetCapPowerPrice());
					plb1.setText(cappowerprice);
					
					int capgrouppowers = data.GetCapPower()+data.GetCapInvenPower()+(data.GetZzolPower()+data.GetZzolInvenPower())*data.GetZzol();
					String capgrouppower = Integer.toString(capgrouppowers);
					data.SetCapGroupPower(capgrouppowers);
					capglb1.setText(capgrouppower);
					int capgrouphealths = data.GetCapHealth()+data.GetCapInvenHealth()+(data.GetZzolHealth()+data.GetZzolInvenHealth())*data.GetZzol();
					String capgrouphealth = Integer.toString(capgrouphealths);
					data.SetCapGroupHealth(capgrouphealths);
					capglb2.setText(capgrouphealth);
					
					int offgrouppowers = data.GetOffPower()+data.GetOffInvenPower()+(data.GetOffInvenPower()+data.GetZzolPower())*data.GetZzol();
					String offgrouppower = Integer.toString(offgrouppowers);
					data.SetOffGroupPower(offgrouppowers);
					offglb1.setText(offgrouppower);
					int offgrouphealths = data.GetOffHealth()+data.GetOffInvenHealth()+(data.GetZzolInvenHealth()+data.GetZzolHealth())*data.GetZzol();
					String offgrouphealth = Integer.toString(offgrouphealths);
					data.SetOffGroupHealth(offgrouphealths);
					offglb2.setText(offgrouphealth);
					
					int allgrouppowers = data.GetCapGroupPower()+data.GetOff()*data.GetOffGroupPower();
					String allgrouppower = Integer.toString(allgrouppowers);
					data.SetAllPower(allgrouppowers);
					allglb1.setText(allgrouppower);
					int allgrouphealths = data.GetCapGroupHealth()+data.GetOff()*data.GetOffGroupHealth();
					String allgrouphealth = Integer.toString(allgrouphealths);
					data.SetAllHealth(allgrouphealths);
					allglb2.setText(allgrouphealth);
					
					data.save();
				}
			}
		});
		button_5.setBounds(275, 38, 105, 27);
		getContentPane().add(button_5);
		
		button = new JButton("업그레이드");
		button.setBackground(new Color(105, 105, 105));
		button.setForeground(new Color(255, 255, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				
				if(data.GetAs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < data.GetCapHealthPrice()) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					int money = data.GetMoney()-data.GetCapHealthPrice();
					data.SetMoney(money);
					int a = data.GetCapHealth()+10;
					data.SetCapHealth(a);
					int b = data.GetCapHealthPrice()+50;
					data.SetCapHealthPrice(b);
					data.SetAs(1);
					
					SetStatFrame(statframe);
					previous = getContentPane();
					try {
						String URL = "C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\training3.gif";
						SetUrl(URL);
						delay = 5000;
						UpgradePanel upgradepanel = new UpgradePanel(statframe);
						setContentPane(upgradepanel);
						
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					revalidate();
					
					String caphealth = Integer.toString(data.GetCapHealth()+data.GetCapInvenHealth());
					slb2.setText(caphealth);
					String caphealthprice = Integer.toString(data.GetCapHealthPrice());
					plb2.setText(caphealthprice);

					int capgrouppowers = data.GetCapPower()+data.GetCapInvenPower()+(data.GetZzolPower()+data.GetZzolInvenPower())*data.GetZzol();
					String capgrouppower = Integer.toString(capgrouppowers);
					data.SetCapGroupPower(capgrouppowers);
					capglb1.setText(capgrouppower);
					int capgrouphealths = data.GetCapHealth()+data.GetCapInvenHealth()+(data.GetZzolHealth()+data.GetZzolInvenHealth())*data.GetZzol();
					String capgrouphealth = Integer.toString(capgrouphealths);
					data.SetCapGroupHealth(capgrouphealths);
					capglb2.setText(capgrouphealth);
					
					int offgrouppowers = data.GetOffPower()+data.GetOffInvenPower()+(data.GetOffInvenPower()+data.GetZzolPower())*data.GetZzol();
					String offgrouppower = Integer.toString(offgrouppowers);
					data.SetOffGroupPower(offgrouppowers);
					offglb1.setText(offgrouppower);
					int offgrouphealths = data.GetOffHealth()+data.GetOffInvenHealth()+(data.GetZzolInvenHealth()+data.GetZzolHealth())*data.GetZzol();
					String offgrouphealth = Integer.toString(offgrouphealths);
					data.SetOffGroupHealth(offgrouphealths);
					offglb2.setText(offgrouphealth);
					
					int allgrouppowers = data.GetCapGroupPower()+data.GetOff()*data.GetOffGroupPower();
					String allgrouppower = Integer.toString(allgrouppowers);
					data.SetAllPower(allgrouppowers);
					allglb1.setText(allgrouppower);
					int allgrouphealths = data.GetCapGroupHealth()+data.GetOff()*data.GetOffGroupHealth();
					String allgrouphealth = Integer.toString(allgrouphealths);
					data.SetAllHealth(allgrouphealths);
					allglb2.setText(allgrouphealth);
					
					data.save();
				}
			}
		});
		button.setBounds(275, 82, 105, 27);
		getContentPane().add(button);
		
		button_1 = new JButton("업그레이드");
		button_1.setBackground(new Color(105, 105, 105));
		button_1.setForeground(new Color(255, 255, 255));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				
				if(data.GetBs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < data.GetOffPowerPrice()) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					int money = data.GetMoney()-data.GetOffPowerPrice();
					data.SetMoney(money);
					int a = data.GetOffPower()+3;
					data.SetOffPower(a);
					int b = data.GetOffPowerPrice()+100;
					data.SetOffPowerPrice(b);
					data.SetBs(1);
					
					SetStatFrame(statframe);
					previous = getContentPane();
					try {
						String URL = "C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\사격8.gif";
						SetUrl(URL);
						delay = 2000;
						UpgradePanel upgradepanel = new UpgradePanel(statframe);
						setContentPane(upgradepanel);
						
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					revalidate();
					
					String offpower = Integer.toString(data.GetOffPower()+data.GetOffInvenPower());
					slb3.setText(offpower);
					String offpowerprice = Integer.toString(data.GetOffPowerPrice());
					plb3.setText(offpowerprice);

					int capgrouppowers = data.GetCapPower()+data.GetCapInvenPower()+(data.GetZzolPower()+data.GetZzolInvenPower())*data.GetZzol();
					String capgrouppower = Integer.toString(capgrouppowers);
					data.SetCapGroupPower(capgrouppowers);
					capglb1.setText(capgrouppower);
					int capgrouphealths = data.GetCapHealth()+data.GetCapInvenHealth()+(data.GetZzolHealth()+data.GetZzolInvenHealth())*data.GetZzol();
					String capgrouphealth = Integer.toString(capgrouphealths);
					data.SetCapGroupHealth(capgrouphealths);
					capglb2.setText(capgrouphealth);
					
					int offgrouppowers = data.GetOffPower()+data.GetOffInvenPower()+(data.GetOffInvenPower()+data.GetZzolPower())*data.GetZzol();
					String offgrouppower = Integer.toString(offgrouppowers);
					data.SetOffGroupPower(offgrouppowers);
					offglb1.setText(offgrouppower);
					int offgrouphealths = data.GetOffHealth()+data.GetOffInvenHealth()+(data.GetZzolInvenHealth()+data.GetZzolHealth())*data.GetZzol();
					String offgrouphealth = Integer.toString(offgrouphealths);
					data.SetOffGroupHealth(offgrouphealths);
					offglb2.setText(offgrouphealth);
					
					int allgrouppowers = data.GetCapGroupPower()+data.GetOff()*data.GetOffGroupPower();
					String allgrouppower = Integer.toString(allgrouppowers);
					data.SetAllPower(allgrouppowers);
					allglb1.setText(allgrouppower);
					int allgrouphealths = data.GetCapGroupHealth()+data.GetOff()*data.GetOffGroupHealth();
					String allgrouphealth = Integer.toString(allgrouphealths);
					data.SetAllHealth(allgrouphealths);
					allglb2.setText(allgrouphealth);
					
					data.save();
				}
			}
		});
		button_1.setBounds(275, 168, 105, 27);
		getContentPane().add(button_1);
		
		button_2 = new JButton("업그레이드");
		button_2.setBackground(new Color(105, 105, 105));
		button_2.setForeground(new Color(255, 255, 255));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				
				if(data.GetBs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < data.GetOffHealthPrice()) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					int money = data.GetMoney()-data.GetOffHealthPrice();
					data.SetMoney(money);
					int a = data.GetOffHealth()+5;
					data.SetOffHealth(a);
					int b = data.GetOffHealthPrice()+100;
					data.SetOffHealthPrice(b);
					data.SetBs(1);
										
					SetStatFrame(statframe);
					previous = getContentPane();
					try {
						String URL = "C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\training2.gif";
						SetUrl(URL);
						delay = 10000;
						UpgradePanel upgradepanel = new UpgradePanel(statframe);
						setContentPane(upgradepanel);
						
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					revalidate();
					
					String offhealth = Integer.toString(data.GetOffHealth()+data.GetOffInvenHealth());
					slb4.setText(offhealth);
					String offhealthprice = Integer.toString(data.GetOffHealthPrice());
					plb4.setText(offhealthprice);

					int capgrouppowers = data.GetCapPower()+data.GetCapInvenPower()+(data.GetZzolPower()+data.GetZzolInvenPower())*data.GetZzol();
					String capgrouppower = Integer.toString(capgrouppowers);
					data.SetCapGroupPower(capgrouppowers);
					capglb1.setText(capgrouppower);
					int capgrouphealths = data.GetCapHealth()+data.GetCapInvenHealth()+(data.GetZzolHealth()+data.GetZzolInvenHealth())*data.GetZzol();
					String capgrouphealth = Integer.toString(capgrouphealths);
					data.SetCapGroupHealth(capgrouphealths);
					capglb2.setText(capgrouphealth);
					
					int offgrouppowers = data.GetOffPower()+data.GetOffInvenPower()+(data.GetOffInvenPower()+data.GetZzolPower())*data.GetZzol();
					String offgrouppower = Integer.toString(offgrouppowers);
					data.SetOffGroupPower(offgrouppowers);
					offglb1.setText(offgrouppower);
					int offgrouphealths = data.GetOffHealth()+data.GetOffInvenHealth()+(data.GetZzolInvenHealth()+data.GetZzolHealth())*data.GetZzol();
					String offgrouphealth = Integer.toString(offgrouphealths);
					data.SetOffGroupHealth(offgrouphealths);
					offglb2.setText(offgrouphealth);
					
					int allgrouppowers = data.GetCapGroupPower()+data.GetOff()*data.GetOffGroupPower();
					String allgrouppower = Integer.toString(allgrouppowers);
					data.SetAllPower(allgrouppowers);
					allglb1.setText(allgrouppower);
					int allgrouphealths = data.GetCapGroupHealth()+data.GetOff()*data.GetOffGroupHealth();
					String allgrouphealth = Integer.toString(allgrouphealths);
					data.SetAllHealth(allgrouphealths);
					allglb2.setText(allgrouphealth);
					
					data.save();
				}
			}
		});
		button_2.setBounds(275, 211, 105, 27);
		getContentPane().add(button_2);
		
		button_3 = new JButton("업그레이드");
		button_3.setBackground(new Color(105, 105, 105));
		button_3.setForeground(new Color(255, 255, 255));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				
				if(data.GetCs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < data.GetZzolPowerPrice()) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					int money = data.GetMoney()-data.GetZzolPowerPrice();
					data.SetMoney(money);
					int a = data.GetZzolPower()+1;
					data.SetZzolPower(a);
					int b = data.GetZzolPowerPrice()+200;
					data.SetZzolPowerPrice(b);
					data.SetCs(1);
										
					SetStatFrame(statframe);
					previous = getContentPane();
					try {
						String URL = "C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\사격7.gif";
						SetUrl(URL);
						delay = 1000;
						UpgradePanel upgradepanel = new UpgradePanel(statframe);
						setContentPane(upgradepanel);
						
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					revalidate();
					
					String zzolpower = Integer.toString(data.GetZzolPower()+data.GetZzolInvenPower());
					slb5.setText(zzolpower);
					String zzolpowerprice = Integer.toString(data.GetZzolPowerPrice());
					plb5.setText(zzolpowerprice);

					int capgrouppowers = data.GetCapPower()+data.GetCapInvenPower()+(data.GetZzolPower()+data.GetZzolInvenPower())*data.GetZzol();
					String capgrouppower = Integer.toString(capgrouppowers);
					data.SetCapGroupPower(capgrouppowers);
					capglb1.setText(capgrouppower);
					int capgrouphealths = data.GetCapHealth()+data.GetCapInvenHealth()+(data.GetZzolHealth()+data.GetZzolInvenHealth())*data.GetZzol();
					String capgrouphealth = Integer.toString(capgrouphealths);
					data.SetCapGroupHealth(capgrouphealths);
					capglb2.setText(capgrouphealth);
					
					int offgrouppowers = data.GetOffPower()+data.GetOffInvenPower()+(data.GetOffInvenPower()+data.GetZzolPower())*data.GetZzol();
					String offgrouppower = Integer.toString(offgrouppowers);
					data.SetOffGroupPower(offgrouppowers);
					offglb1.setText(offgrouppower);
					int offgrouphealths = data.GetOffHealth()+data.GetOffInvenHealth()+(data.GetZzolInvenHealth()+data.GetZzolHealth())*data.GetZzol();
					String offgrouphealth = Integer.toString(offgrouphealths);
					data.SetOffGroupHealth(offgrouphealths);
					offglb2.setText(offgrouphealth);
					
					int allgrouppowers = data.GetCapGroupPower()+data.GetOff()*data.GetOffGroupPower();
					String allgrouppower = Integer.toString(allgrouppowers);
					data.SetAllPower(allgrouppowers);
					allglb1.setText(allgrouppower);
					int allgrouphealths = data.GetCapGroupHealth()+data.GetOff()*data.GetOffGroupHealth();
					String allgrouphealth = Integer.toString(allgrouphealths);
					data.SetAllHealth(allgrouphealths);
					allglb2.setText(allgrouphealth);
					
					data.save();
				}
			}
		});
		button_3.setBounds(275, 271, 105, 27);
		getContentPane().add(button_3);
		
		button_4 = new JButton("업그레이드");
		button_4.setBackground(new Color(105, 105, 105));
		button_4.setForeground(new Color(255, 255, 255));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File.loadProperties(data);
				
				if(data.GetCs()==1) {
					JOptionPane.showMessageDialog(null, "훈련중입니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				if(data.GetMoney() < data.GetZzolHealthPrice()) {
					JOptionPane.showMessageDialog(null, "돈이부족합니다.", "Message", JOptionPane.ERROR_MESSAGE); 
					return;
				}
				else {
					int money = data.GetMoney()-data.GetZzolHealthPrice();
					data.SetMoney(money);
					int a = data.GetZzolHealth()+2;
					data.SetZzolHealth(a);
					int b = data.GetZzolHealthPrice()+200;
					data.SetZzolHealthPrice(b);
					data.SetCs(1);
					
					SetStatFrame(statframe);
					previous = getContentPane();
					try {
						String URL = "C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\training.gif";
						SetUrl(URL);
						delay = 5000;
						UpgradePanel upgradepanel = new UpgradePanel(statframe);
						setContentPane(upgradepanel);
						
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					revalidate();
					
					String zzolhealth = Integer.toString(data.GetZzolHealth()+data.GetZzolInvenHealth());
					slb6.setText(zzolhealth);
					String zzolhealthprice = Integer.toString(data.GetZzolHealthPrice());
					plb6.setText(zzolhealthprice);

					int capgrouppowers = data.GetCapPower()+data.GetCapInvenPower()+(data.GetZzolPower()+data.GetZzolInvenPower())*data.GetZzol();
					String capgrouppower = Integer.toString(capgrouppowers);
					data.SetCapGroupPower(capgrouppowers);
					capglb1.setText(capgrouppower);
					int capgrouphealths = data.GetCapHealth()+data.GetCapInvenHealth()+(data.GetZzolHealth()+data.GetZzolInvenHealth())*data.GetZzol();
					String capgrouphealth = Integer.toString(capgrouphealths);
					data.SetCapGroupHealth(capgrouphealths);
					capglb2.setText(capgrouphealth);
					
					int offgrouppowers = data.GetOffPower()+data.GetOffInvenPower()+(data.GetOffInvenPower()+data.GetZzolPower())*data.GetZzol();
					String offgrouppower = Integer.toString(offgrouppowers);
					data.SetOffGroupPower(offgrouppowers);
					offglb1.setText(offgrouppower);
					int offgrouphealths = data.GetOffHealth()+data.GetOffInvenHealth()+(data.GetZzolInvenHealth()+data.GetZzolHealth())*data.GetZzol();
					String offgrouphealth = Integer.toString(offgrouphealths);
					data.SetOffGroupHealth(offgrouphealths);
					offglb2.setText(offgrouphealth);
					
					int allgrouppowers = data.GetCapGroupPower()+data.GetOff()*data.GetOffGroupPower();
					String allgrouppower = Integer.toString(allgrouppowers);
					data.SetAllPower(allgrouppowers);
					allglb1.setText(allgrouppower);
					int allgrouphealths = data.GetCapGroupHealth()+data.GetOff()*data.GetOffGroupHealth();
					String allgrouphealth = Integer.toString(allgrouphealths);
					data.SetAllHealth(allgrouphealths);
					allglb2.setText(allgrouphealth);
					
					data.save();
				}
			}
		});
		button_4.setBounds(275, 315, 105, 27);
		getContentPane().add(button_4);
		
		JButton button_6 = new JButton("능력치 창 닫기");
		button_6.setBackground(new Color(255, 182, 193));
		button_6.setForeground(new Color(0, 0, 0));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_6.setBounds(253, 0, 127, 27);
		getContentPane().add(button_6);

	}
	public void TurnPrevious() {
		setContentPane(previous);
	}
	public void SetStatFrame(StatFrame statframe) {
		this.statframe = statframe;
	}
	
	public void SetOff(int off) {
		this.off1.setText(String.valueOf(off)+" / 9");
	}
	
	public void SetZzol(int zzol) {
		this.zzol1.setText(String.valueOf(zzol)+" / 30");
	}
	
	public void SetCapglb1(int capg) {
		this.capglb1.setText(String.valueOf(capg));
	}
	
	public void SetCapglb2(int capg) {
		this.capglb2.setText(String.valueOf(capg));
	}
	
	public void SetOffglb1(int offg) {
		this.offglb1.setText(String.valueOf(offg));
	}
	
	public void SetOffglb2(int offg) {
		this.offglb2.setText(String.valueOf(offg));
	}
	
	public void SetAllglb1(int allg) {
		this.allglb1.setText(String.valueOf(allg));
	}
	
	public void SetAllglb2(int allg) {
		this.allglb2.setText(String.valueOf(allg));
	}
	
	public void SetUrl(String Url) {
		this.Url = Url;
	}
	
	public String GetUrl() {
		return Url;
	}
	
	public int GetDelay() {
		return delay;
	}
}
