package Stat;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class UpgradePanel extends JPanel {

	private StatFrame statframe;
	private Timer timer;

	private Image image;
	private Image newimage;

	class job extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			statframe.TurnPrevious();
			revalidate();
		}

	}

	public UpgradePanel(StatFrame statframe) throws MalformedURLException {
		this.statframe = statframe;
		setLayout(null);

		image = Toolkit.getDefaultToolkit().createImage(statframe.GetUrl());
		newimage = image.getScaledInstance(405, 610, newimage.SCALE_DEFAULT);
		
		timer = new Timer();
		job job = new job();
		timer.schedule(job, statframe.GetDelay()); // "C:/"
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		if (this.newimage != null) {
			g.drawImage(newimage, 0, 0, this);
		}
	}
}
