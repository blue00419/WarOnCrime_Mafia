package Mafia;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import Data.Data;
import Data.File;
import Option.OptionFrame;

public class UpPanel extends JPanel{
	
	private OptionFrame optionframe;
	private Data data = new Data();
	private Timer timer;
	
	private int money=0;
	private int monthmoney=0;
	private int year=0;
	private int month=0;
	private int day=0;
	private int hour=0;
	private int minute=0;
	private String time;
	
	private JLabel lb;
	private JLabel moneylb2;
	private JLabel moneylb;
	private JLabel monthmoneylb;
	private JLabel monthmoneylb2;
	private JButton optionbtn;
	private JLabel lblNewLabel;

	public UpPanel() {
		File.loadProperties(data);
		minute = data.GetMinute();
		hour = data.GetHour();
		day = data.GetDay();
		month = data.GetMonth();
		year = data.GetYear();
		timer = new Timer(100, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				File.loadProperties(data);
				minute = minute+3;
				if(minute >= 60) {
					hour+=1;
					minute=0;
				}
				if(hour >= 24) {
					day+=1;
					hour=0;
				}
				
				if(day >= 30) {
					month+=1;
					day=0;
					data.SetMoney(data.GetMoney()+data.GetMonthMoney());
					data.save();
				}
				if(month >= 12) {
					year+=1;
					month=0;
				}
				
				time = year+"년 "+month+"월 "+day+"일 "+hour+"시 "+minute+"분";
				lb.setText(time);
				
				data.SetYear(year);
				data.SetMonth(month);
				data.SetDay(day);
				data.SetHour(hour);
				data.SetMinute(minute);
				
				money = data.GetMoney();
				String money1 = String.valueOf(money);
				moneylb2.setText(money1);
				
				monthmoney = data.GetMonthMoney();
				String monthmoney1 = String.valueOf(monthmoney);
				monthmoneylb2.setText(monthmoney1);
				
				if(data.GetEnding()==16 || data.GetYear() == 20) {
					JOptionPane.showMessageDialog(null, "클리어", "Message", JOptionPane.ERROR_MESSAGE);
					timer.stop();
					return;
				}
				
				
				data.save();
			}
		});
		timer.start();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{60, 60, 60, 60, 80, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		setBackground(Color.BLACK);
		
		moneylb = new JLabel("소지금");
		moneylb.setForeground(Color.WHITE);
		GridBagConstraints gbc_moneylb = new GridBagConstraints();
		gbc_moneylb.insets = new Insets(0, 0, 0, 5);
		gbc_moneylb.gridx = 0;
		gbc_moneylb.gridy = 0;
		add(moneylb, gbc_moneylb);
		
		money = data.GetMoney();
		String money1 = String.valueOf(money);
		moneylb2 = new JLabel(money1);
		moneylb2.setForeground(Color.WHITE);
		GridBagConstraints gbc_moneylb2 = new GridBagConstraints();
		gbc_moneylb2.insets = new Insets(0, 0, 0, 5);
		gbc_moneylb2.gridx = 1;
		gbc_moneylb2.gridy = 0;
		add(moneylb2, gbc_moneylb2);
		
		monthmoneylb = new JLabel("월수입");
		monthmoneylb.setForeground(Color.WHITE);
		GridBagConstraints gbc_monthmoneylb = new GridBagConstraints();
		gbc_monthmoneylb.insets = new Insets(0, 0, 0, 5);
		gbc_monthmoneylb.gridx = 2;
		gbc_monthmoneylb.gridy = 0;
		add(monthmoneylb, gbc_monthmoneylb);
		
		monthmoney = data.GetMonthMoney();
		String monthmoney1 = String.valueOf(monthmoney);
		monthmoneylb2 = new JLabel(monthmoney1);
		monthmoneylb2.setForeground(Color.WHITE);
		GridBagConstraints gbc_monthmoneylb2 = new GridBagConstraints();
		gbc_monthmoneylb2.insets = new Insets(0, 0, 0, 5);
		gbc_monthmoneylb2.gridx = 3;
		gbc_monthmoneylb2.gridy = 0;
		add(monthmoneylb2, gbc_monthmoneylb2);
		
		lblNewLabel = new JLabel("총 플레이시간");
		lblNewLabel.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		time = year+"년 "+month+"달 "+day+"일 "+hour+"시 "+minute+"분";
		lb = new JLabel("0년 0월 0일 0시 0분");
		lb.setForeground(Color.WHITE);
		GridBagConstraints gbc_lb = new GridBagConstraints();
		gbc_lb.insets = new Insets(0, 0, 0, 5);
		gbc_lb.gridx = 5;
		gbc_lb.gridy = 0;
		add(lb, gbc_lb);
		
		optionbtn = new JButton("설정");
		optionbtn.setBackground(new Color(255, 182, 193));
		optionbtn.setForeground(new Color(0, 0, 0));
		optionbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				optionframe = new OptionFrame();
				//optionframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);				
				optionframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				optionframe.setBounds(700, 200, 300, 500);
				optionframe.setVisible(true);
			}
		});
		GridBagConstraints gbc_optionbtn = new GridBagConstraints();
		gbc_optionbtn.gridx = 6;
		gbc_optionbtn.gridy = 0;
		add(optionbtn, gbc_optionbtn);	
	}
	
	public void SetMoney(int money) {
		this.money=money;
	}
	
	public int GetMoney() {
		return money;
	}
	
	public void SetMonthMoney(int monthmoney) {
		this.monthmoney=monthmoney;
	}
	
	public int GetMonthMoney() {
		return monthmoney;
	}
	
	public void SetYear(int year) {
		this.year=year;
	}
	
	public int GetYear() {
		return year;
	}
	
	public void SetMonth(int month) {
		this.month=month;
	}
	
	public int GetMonth() {
		return month;
	}
	
	public void SetDay(int day) {
		this.day=day;
	}
	
	public int GetDay() {
		return day;
	}
	
	public void SetHour(int hour) {
		this.hour=hour;
	}
	
	public int GetHour() {
		return hour;
	}
	
	public void SetMinute(int minute) {
		this.minute=minute;
	}
	
	public int GetMinute() {
		return minute;
	}
}
