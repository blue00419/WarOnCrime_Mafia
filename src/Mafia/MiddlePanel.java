package Mafia;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import Data.Data;
import Data.File;

public class MiddlePanel extends JPanel{
	
	private ImageIcon oldimageicon = new ImageIcon("C:\\\\Users\\\\blue0\\\\git\\\\WarOnCrime_Mafia\\\\picture\\\\훈련소\\11.jpg");
	private Image oldimage = oldimageicon.getImage();
	private Image newimage = oldimage.getScaledInstance(900, 800, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon = new ImageIcon(newimage);
	
	private Data data = new Data();
	private Timer timer;
	private int a=0;
	private int b=0;
	private int c=0;
	
	private JLabel off;
	private JLabel zzol;
	private JProgressBar cappro;
	private JProgressBar offpro;
	private JProgressBar zzolpro;
	private JLabel lb1;
	private JLabel lb3;
	
	public MiddlePanel() {
		File.loadProperties(data);
		setLayout(null);
		timer = new Timer(100, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				File.loadProperties(data);
				
				if (data.GetAs() == 1) {
					a += 1;
					cappro.setValue(a);
				}
				if (data.GetBs() == 1) {
					b += 1;
					offpro.setValue(b);
				}
				if (data.GetCs() == 1) {
					c += 1;
					zzolpro.setValue(c);
				}

				if (a == 100) {
					data.SetAs(0);
					a = 0;
					cappro.setValue(0);
				}
				if (b == 100) {
					data.SetBs(0);
					b = 0;
					offpro.setValue(0);
				}
				if (c == 100) {
					data.SetCs(0);
					c = 0;
					zzolpro.setValue(0);
				}

				off.setText(Integer.toString(data.GetOff()) + " / 9");
				zzol.setText(Integer.toString(data.GetZzol()) + " / 30");
				data.save();
			}
		});
		timer.start();
		
		String offs = Integer.toString(data.GetOff())+" / 9";
		off = new JLabel(offs);
		off.setOpaque(true);
		off.setForeground(new Color(255, 255, 255));
		off.setBackground(new Color(0, 0, 0));
		off.setFont(new Font("굴림", Font.PLAIN, 25));
		off.setHorizontalAlignment(SwingConstants.CENTER);
		off.setBounds(805, 17, 81, 48);
		add(off);
		
		JLabel label_2 = new JLabel("부대장");
		label_2.setBackground(new Color(0, 0, 0));
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setOpaque(true);
		label_2.setFont(new Font("굴림", Font.PLAIN, 25));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(707, 17, 98, 48);
		add(label_2);
		
		JLabel label_3 = new JLabel("부하");
		label_3.setOpaque(true);
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setBackground(new Color(0, 0, 0));
		label_3.setFont(new Font("굴림", Font.PLAIN, 25));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(707, 92, 98, 48);
		add(label_3);
		
		String zzols = Integer.toString(data.GetZzol())+" / 30";
		zzol = new JLabel(zzols);
		zzol.setBackground(new Color(0, 0, 0));
		zzol.setForeground(new Color(255, 255, 255));
		zzol.setOpaque(true);
		zzol.setFont(new Font("굴림", Font.PLAIN, 25));
		zzol.setHorizontalAlignment(SwingConstants.CENTER);
		zzol.setBounds(805, 92, 81, 48);
		add(zzol);
		
		cappro = new JProgressBar();
		cappro.setBounds(37, 170, 146, 14);
		cappro.setMaximum(100);
		cappro.setMinimum(0);
		cappro.setForeground(Color.green);
		cappro.setVisible(true);
		cappro.setStringPainted(true);
		add(cappro);
		
		offpro = new JProgressBar();
		offpro.setBounds(37, 420, 146, 14);
		offpro.setMaximum(100);
		offpro.setMinimum(0);
		offpro.setForeground(Color.green);
		offpro.setVisible(true);
		offpro.setStringPainted(true);
		add(offpro);
		
		zzolpro = new JProgressBar();
		zzolpro.setBounds(37, 670, 146, 14);
		zzolpro.setMaximum(100);
		zzolpro.setMinimum(0);
		zzolpro.setForeground(Color.green);
		zzolpro.setVisible(true);
		zzolpro.setStringPainted(true);
		add(zzolpro);
		
		lb1 = new JLabel("대장 훈련소");
		lb1.setBackground(new Color(0, 0, 0));
		lb1.setForeground(new Color(255, 255, 255));
		lb1.setOpaque(true);
		lb1.setFont(new Font("굴림", Font.BOLD, 20));
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setBounds(37, 184, 146, 37);
		add(lb1);
		
		JLabel lb2 = new JLabel("부대장 훈련소");
		lb2.setOpaque(true);
		lb2.setBackground(new Color(0, 0, 0));
		lb2.setForeground(new Color(245, 255, 250));
		lb2.setFont(new Font("굴림", Font.BOLD, 20));
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		lb2.setBounds(37, 434, 146, 37);
		add(lb2);
		
		lb3 = new JLabel("부하 훈련소");
		lb3.setBackground(new Color(0, 0, 0));
		lb3.setOpaque(true);
		lb3.setForeground(new Color(245, 255, 250));
		lb3.setFont(new Font("굴림", Font.BOLD, 20));
		lb3.setHorizontalAlignment(SwingConstants.CENTER);
		lb3.setBounds(37, 684, 146, 37);
		add(lb3);
		
		JLabel label = new JLabel("");
		label.setIcon(newimageicon);
		label.setBounds(0, 0, 900, 750);
		add(label);
	}
	public void SetOff(int off) {
		this.off.setText(Integer.toString(off)+" / 9");
	}
	
	public void SetZzol(int zzol) {
		this.zzol.setText(Integer.toString(zzol)+" / 30");
	}
}
