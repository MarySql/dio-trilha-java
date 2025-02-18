package messaging;

public class SMSService implements MessagingService {
	@Override
	public void sendMessage(String message) {
		System.out.println("Sending SMS: " + message);
	}

}
