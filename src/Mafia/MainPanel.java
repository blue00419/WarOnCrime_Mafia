package Mafia;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	
	public MainPanel() {
		setLayout(new BorderLayout(0, 0));
		this.add(new UpPanel(), BorderLayout.NORTH);
		this.add(new MiddlePanel(), BorderLayout.CENTER);
		this.add(new BottomPanel(), BorderLayout.SOUTH);
	}

}
