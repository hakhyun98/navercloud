package fifo.lifo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueExample {
	public static void main(String[] args) {
		Queue<Message> messageQ = new LinkedList<>();
		Stack<Message> messageS = new Stack<>();

		messageQ.offer(new Message("sendMail", "홍길동"));
		messageQ.offer(new Message("sendMail1", "홍길남"));
		messageQ.offer(new Message("sendMail2", "홍길녀"));

		messageS.push(new Message("sendMail", "홍길동"));
		messageS.push(new Message("sendMail1", "홍길남"));
		messageS.push(new Message("sendMail2", "홍길녀"));

		while (!messageQ.isEmpty()) {
			Message message = messageQ.poll();
			switch (message.message) {
			case "sendMail":
				System.out.println(message.to);
				break;
			case "sendMail1":
				System.out.println(message.to);
				break;
			case "sendMail2":
				System.out.println(message.to);
				break;
			}
		}
		System.out.println();

		while (!messageS.isEmpty()) {
			Message message1 = messageS.pop();
			switch (message1.message) {
			case "sendMail":
				System.out.println(message1.to);
				break;
			case "sendMail1":
				System.out.println(message1.to);
				break;
			case "sendMail2":
				System.out.println(message1.to);
				break;
			}
		}
	}
}
