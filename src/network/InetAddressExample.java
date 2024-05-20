package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP주소: " + local.getHostAddress());

			InetAddress[] iaArr = InetAddress.getAllByName("www.bumgu.com");
			for (InetAddress remote : iaArr) {
				System.out.println("www.goolge.com IP주소: " + remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
