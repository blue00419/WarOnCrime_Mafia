package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.WindowConstants;

import Data.Data;
import Data.File;

public class ServerReceiveThread extends Thread{
	
	private Socket socket;
	private CheckFrame checkframe;
	private Data data = new Data();
	
	private ServerSendThread serversendthread;
	
	public ServerReceiveThread(ServerSendThread serversendthread) {
		this.serversendthread = serversendthread;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		File.loadProperties(data);
		super.run();
		try {
			InetAddress clientAddress = socket.getInetAddress(); // 클라이언트의 주소를 가져온다.
            System.out.println(getTime() + clientAddress + " 에서 클라이언트가 접속했습니다.");

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            String myMsg = "sdadasd"; //전달 메시지
            
            while((myMsg = br.readLine()) != null){
				if(myMsg.equals("/q")){
					break; //연결 해제
				}
				System.out.println(getTime() + " 클라이언트로부터 받은 문자열 : " + myMsg);
				
				if(myMsg.startsWith("<Money>")) {
					String a = myMsg.substring(7, myMsg.length()-8);
					int b = Integer.parseInt(a);
					data.SetMoney(data.GetMoney()+b);
					data.save();
					serversendthread.send(b+"원을 받았습니다.");
				}
				else if (myMsg.equals("<Request>Y")) {
					checkframe = new CheckFrame(serversendthread);
					checkframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
					checkframe.setBounds(650, 150, 400, 400);
					checkframe.setVisible(true);
				} 
				else {
					serversendthread.send("'<Request>Y'을 입력하세요.");
				}
			}
            br.close();            
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	
    static String getTime(){
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]"); //날짜 출력
        return f.format(new Date());
    }
}
