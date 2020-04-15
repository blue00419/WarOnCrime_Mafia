package Group;

import java.awt.Color;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class AddPanel extends JPanel{
	
	private Timer timer;
	private GroupFrame groupframe;
	
	class job extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			groupframe.dispose();
		}
		
	}
	
	public AddPanel(GroupFrame groupframe) {
		this.groupframe = groupframe;
		setLayout(null);
		
		JLabel label_1 = new JLabel("영입!");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("굴림", Font.PLAIN, 30));
		label_1.setForeground(new Color(255, 255, 0));
		label_1.setBounds(145, 431, 118, 59);
		add(label_1);
		
		JLabel label = new JLabel("");
		label.setIcon(groupframe.GetImage());
		label.setBounds(0, 0, 410, 600);
		add(label);
		
		job job = new job();
		timer = new Timer();
		timer.schedule(job, 3000);
	}
}
