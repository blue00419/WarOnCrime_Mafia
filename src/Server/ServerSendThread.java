package Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerSendThread extends Thread {

	private Socket socket;

	BufferedWriter wr;
	BufferedReader br;

	public void Set() {

		// 서버로부터 소켓 연결
		try {
			wr = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
			close();
		}

	}

	public void send(String str) {

		if (wr != null && br != null && socket != null) {

			try {
				wr.write(str);
				wr.newLine();
				wr.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	private void close() {
		try {
			wr.close(); // 스트림 닫기
			br.close(); // 버퍼 닫기
			socket.close(); // 소켓 닫기
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void setSocket(Socket socket) {
		this.socket = socket;
		Set();
	}
}
