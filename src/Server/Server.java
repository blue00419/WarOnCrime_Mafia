package Server;

import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
	
    public Server() {
        ServerSocket serverSocket = null; //서버의 소켓
        int port = 10001; //포트 번호

        try{
			System.out.println(getTime() + " 서버가 준비되었습니다.");
            serverSocket = new ServerSocket(port); //포트에 서버소켓을 붙인다(Bind)
            
			while (true) {
				Socket socket = serverSocket.accept(); // 클라이언트의 접속을 허가한다.(Accept)
				
				
				
				ServerSendThread serversendthread = new ServerSendThread();
				serversendthread.setSocket(socket);
				serversendthread.start();
				
				ServerReceiveThread serverreceivethread = new ServerReceiveThread(serversendthread);
				serverreceivethread.setSocket(socket);
				
				serverreceivethread.start();
			}
            
        }catch(Exception e){
            e.printStackTrace(); //예외 처리
        }
    }
    
    static String getTime(){
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]"); //날짜 출력
        return f.format(new Date());
    }

}
