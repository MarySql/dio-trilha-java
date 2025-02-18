package messaging;

public class WhatsAppService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending WhatsApp message: " + message);
    }
}