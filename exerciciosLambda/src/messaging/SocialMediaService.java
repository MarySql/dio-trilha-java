package messaging;

public class SocialMediaService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Posting on Social Media: " + message);
    }
}
