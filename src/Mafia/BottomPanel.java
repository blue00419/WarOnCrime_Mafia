package Mafia;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import Group.GroupFrame;
import Inven.InvenFrame;
import Map.MapFrame;
import Stat.StatFrame;

public class BottomPanel extends JPanel{
	
	private StatFrame statframe;
	private GroupFrame groupframe;
	private InvenFrame invenframe;
	private MapFrame mapframe;

	private JButton statbtn;
	private JButton adbtn;
	private JButton inbenbtn;
	private JButton mapbtn;

	public BottomPanel() {

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		setBackground(Color.BLACK);
		
		statbtn = new JButton("능력치");
		statbtn.setBackground(new Color(255, 182, 193));
		statbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				statframe = new StatFrame();
				statframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				statframe.setBounds(650, 150, 388, 610);
				statframe.setVisible(true);
			}
		});
		GridBagConstraints gbc_statbtn = new GridBagConstraints();
		gbc_statbtn.insets = new Insets(0, 0, 0, 5);
		gbc_statbtn.gridx = 0;
		gbc_statbtn.gridy = 0;
		add(statbtn, gbc_statbtn);
		
		adbtn = new JButton("관리");
		adbtn.setBackground(new Color(255, 182, 193));
		adbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				groupframe = new GroupFrame();
				groupframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				groupframe.setBounds(650, 200, 415, 600);
				groupframe.setVisible(true);
			}
		});
		GridBagConstraints gbc_adbtn = new GridBagConstraints();
		gbc_adbtn.insets = new Insets(0, 0, 0, 5);
		gbc_adbtn.gridx = 1;
		gbc_adbtn.gridy = 0;
		add(adbtn, gbc_adbtn);
		
		inbenbtn = new JButton("인벤토리");
		inbenbtn.setBackground(new Color(255, 182, 193));
		inbenbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				invenframe = new InvenFrame();
				invenframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				invenframe.setBounds(550, 100, 625, 800);
				invenframe.setVisible(true);
			}
		});
		GridBagConstraints gbc_inbenbtn = new GridBagConstraints();
		gbc_inbenbtn.insets = new Insets(0, 0, 0, 5);
		gbc_inbenbtn.gridx = 2;
		gbc_inbenbtn.gridy = 0;
		add(inbenbtn, gbc_inbenbtn);
		
		mapbtn = new JButton("지도");
		mapbtn.setBackground(new Color(255, 182, 193));
		mapbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mapframe = new MapFrame();
				mapframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				mapframe.setBounds(570, 150, 500, 650);
				mapframe.setVisible(true);
			}
		});
		GridBagConstraints gbc_mapbtn = new GridBagConstraints();
		gbc_mapbtn.gridx = 3;
		gbc_mapbtn.gridy = 0;
		add(mapbtn, gbc_mapbtn);
	}
}
