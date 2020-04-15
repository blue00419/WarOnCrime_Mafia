package Server;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Data.Data;
import Data.File;

import java.awt.event.ActionListener;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class CheckFrame extends JFrame{
	
	private ServerSendThread serverSendThread;
	private Data data = new Data();
	
	public CheckFrame(ServerSendThread serverSendThread) {
		File.loadProperties(data);
		
		this.serverSendThread = serverSendThread;
		
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("승낙");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = "<Job>M<Connect>Y<Power>"+data.GetAllPower()+"<Health>"+data.GetAllHealth()+"<TheEnd>";
				serverSendThread.send(a);
				dispose();
			}
		});
		btnNewButton.setBounds(74, 110, 105, 27);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("거절");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = "<Job>M<Connect>N<Power>"+data.GetAllPower()+"<Health>"+data.GetAllHealth()+"<TheEnd>";
				serverSendThread.send(a);
				dispose();
			}
		});
		btnNewButton_1.setBounds(241, 110, 105, 27);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("이벤트를 발생시키겠습니까");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(74, 12, 272, 54);
		getContentPane().add(lblNewLabel);
	}
}
