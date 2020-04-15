package Map;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WarPanel extends JPanel{
	
	private MapFrame mapframe;
	private Timer timer;
	
	class job extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			mapframe.dispose();
		}
		
	}
	
	public WarPanel(MapFrame mapframe) {
		this.mapframe = mapframe;
		setLayout(null);
		job job = new job();
		timer = new Timer();
		timer.schedule(job, 3000);
		
		
		JLabel label = new JLabel("");
		label.setIcon(mapframe.GetIfWarPanel().GetGamePanel().GetImage());
		label.setBounds(0, 0, 595, 400);
		add(label);
	}
}
