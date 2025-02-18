package messaging;

public class MarketingMessageSender {
    public static void main(String[] args) {
        // Mensagem de marketing a ser enviada
        String marketingMessage = "Check out our latest offers!";

        // Usando lambdas para instanciar os serviços e enviar a mensagem
        MessagingService smsService = new SMSService();
        MessagingService emailService = new EmailService();
        MessagingService socialMediaService = new SocialMediaService();
        MessagingService whatsAppService = new WhatsAppService();

        // Enviando a mensagem para os diferentes serviços
        smsService.sendMessage(marketingMessage);
        emailService.sendMessage(marketingMessage);
        socialMediaService.sendMessage(marketingMessage);
        whatsAppService.sendMessage(marketingMessage);
    }
}
