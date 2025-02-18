package messaging;		

public class EmailService implements MessagingService {
	@Override
	public void sendMessage(String message) {
		System.out.println("Sending Email: " + message);
	}
}
