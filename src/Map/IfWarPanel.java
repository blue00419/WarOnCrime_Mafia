package Map;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Data.Data;
import Data.File;

public class IfWarPanel extends JPanel{
	
	private Data data = new Data();
	private MapFrame mapframe;
	private GamePanel gamepanel;
	private boolean occupy = true;
	
	private ImageIcon oldimageicon = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\배경2.jpg");
	private Image oldimage = oldimageicon.getImage();
	private Image newimage = oldimage.getScaledInstance(595, 360, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon = new ImageIcon(newimage);
	
	private ImageIcon oldimageicon1 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\캐릭\\대장.jpg");
	private Image oldimage1 = oldimageicon1.getImage();
	private Image newimage1 = oldimage1.getScaledInstance(240, 240, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon1 = new ImageIcon(newimage1);
	
	private ImageIcon oldimageicon2 = new ImageIcon("C:\\Users\\blue0\\git\\WarOnCrime_Mafia\\picture\\징크스2.jpg");
	private Image oldimage2 = oldimageicon2.getImage();
	private Image newimage2 = oldimage2.getScaledInstance(240, 240, Image.SCALE_SMOOTH);
	private ImageIcon newimageicon2 = new ImageIcon(newimage2);
	
	private ImageIcon oldimageicon3;
	private Image oldimage3;
	private Image newimage3;
	private ImageIcon newimageicon3;
	
	private JLabel mypowerlb;
	private JLabel myhealthlb;
	private JLabel enemypowerlb;
	private JLabel enemyhealthlb;
	private JLabel enemypricelb;
	private JLabel label;
	private JLabel label_1;
	
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLa;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;
	
	public IfWarPanel(MapFrame mapframe) {
		setBackground(new Color(0, 0, 0));
		File.loadProperties(data);

		this.mapframe = mapframe;
		setLayout(null);

		mypowerlb = new JLabel("");
		mypowerlb.setForeground(new Color(255, 255, 255));
		mypowerlb.setHorizontalAlignment(SwingConstants.CENTER);
		mypowerlb.setBounds(147, 281, 57, 15);
		add(mypowerlb);
		
		myhealthlb = new JLabel("");
		myhealthlb.setForeground(new Color(255, 255, 255));
		myhealthlb.setHorizontalAlignment(SwingConstants.CENTER);
		myhealthlb.setBounds(147, 308, 57, 15);
		add(myhealthlb);

		enemypowerlb = new JLabel("");
		enemypowerlb.setForeground(new Color(255, 255, 255));
		enemypowerlb.setHorizontalAlignment(SwingConstants.CENTER);
		enemypowerlb.setBounds(491, 281, 57, 15);
		add(enemypowerlb);
		
		enemyhealthlb = new JLabel("");
		enemyhealthlb.setForeground(new Color(255, 255, 255));
		enemyhealthlb.setHorizontalAlignment(SwingConstants.CENTER);
		enemyhealthlb.setBounds(491, 308, 57, 15);
		add(enemyhealthlb);
		
		enemypricelb = new JLabel("");
		enemypricelb.setForeground(new Color(255, 255, 255));
		enemypricelb.setHorizontalAlignment(SwingConstants.CENTER);
		enemypricelb.setBounds(491, 335, 57, 15);
		add(enemypricelb);
		
		JLabel lblVs = new JLabel("vs");
		lblVs.setHorizontalAlignment(SwingConstants.CENTER);
		lblVs.setForeground(Color.RED);
		lblVs.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblVs.setBounds(239, 120, 112, 50);
		add(lblVs);
		
		label = new JLabel("");
		label.setIcon(newimageicon1);
		label.setBounds(2, 0, 240, 240);
		add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(newimageicon2);
		label_1.setBounds(351, 0, 240, 240);
		add(label_1);
		
		label_2 = new JLabel("공격력");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(26, 281, 57, 15);
		add(label_2);
		
		label_3 = new JLabel("체력");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(26, 308, 57, 15);
		add(label_3);
		
		lblNewLabel = new JLabel("공격력");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(381, 281, 57, 15);
		add(lblNewLabel);
		
		lblNewLa = new JLabel("체력");
		lblNewLa.setForeground(new Color(255, 255, 255));
		lblNewLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLa.setBounds(381, 308, 57, 15);
		add(lblNewLa);
		
		lblNewLabel_1 = new JLabel("수입금");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(381, 335, 57, 15);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("전쟁");
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(occupy==true) {
					gamepanel = new GamePanel(mapframe.GetMapFrame());
					SetGamePanel(gamepanel);
					mapframe.setBounds(400, 100, 859, 759);
					mapframe.setContentPane(gamepanel);
					mapframe.revalidate();
				}
				else {
					setEnabled(true);
				}
			}
		});
		btnNewButton.setBounds(244, 277, 107, 27);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("창 닫기");
		btnNewButton_1.setBackground(new Color(255, 182, 193));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mapframe.dispose();
			}
		});
		btnNewButton_1.setBounds(244, 320, 107, 27);
		add(btnNewButton_1);
	}
	
	public void SetGamePanel(GamePanel gm) {
		this.gamepanel=gm;
	}
	
	public GamePanel GetGamePanel() {
		return gamepanel;
	}
	
	public void SetOccupy(boolean a) {
		this.occupy=a;
	}
	
	public void SetMyPower(int mypower) {
		this.mypowerlb.setText(String.valueOf(mypower));
	}
	
	public int GetMyPower() {
		return Integer.parseInt(mypowerlb.getText());
	}
	
	public void SetMyHealth(int myhealth) {
		this.myhealthlb.setText(String.valueOf(myhealth));
	}
	
	public int GetMyHealth() {
		return Integer.parseInt(myhealthlb.getText());
	}
	
	public void SetEnemyPower(int enemypower) {
		this.enemypowerlb.setText(String.valueOf(enemypower));
	}
	
	public int GetEnemyPower() {
		return Integer.parseInt(enemypowerlb.getText());
	}
	
	public void SetEnemyHealth(int enemyhealth) {
		this.enemyhealthlb.setText(String.valueOf(enemyhealth));
	}
	
	public int GetEnemyHealth() {
		return Integer.parseInt(enemyhealthlb.getText());
	}
		
	public void SetEnemyPrice(int enemyprice) {
		this.enemypricelb.setText(String.valueOf(enemyprice));
	}
	
	public int GetEnemyPrice() {
		return Integer.parseInt(enemypricelb.getText());
	}
}
