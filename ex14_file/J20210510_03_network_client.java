package ex14_file;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class Client{
	private String ip="127.0.0.1"; //서버의 ip
	private int port=33333; //서버의 port번호
	void start() {
		Scanner sc=new Scanner(System.in);
		Socket socket=null;
		PrintWriter pw=null;
		//클라이언트에서 서버의 ip, port 필요
		try {
			socket=new Socket(ip, port);
			System.out.println("클라이언트:Server connected.");
			pw=new PrintWriter(socket.getOutputStream(), true);
			while(true) {
				System.out.print("보낼메세지:");
				String data=sc.nextLine();
				pw.println(data);
				if(data.equals("quit")) {
					System.out.println("Client disconnected."); break;
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pw!=null) pw.close();
				if(socket!=null) socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class J20210510_03_network_client {

	public static void main(String[] args) {
		Client client=new Client();
		client.start();
	}

}
