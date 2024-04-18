/**
 *Title: A java programme to demonstrate Interface Segregation Principle.
 *Author: Bijoy Kumar Paul, Student ID: 220234 , Discipline: CSE , Khulna University
 * Defines the behavior for a message.
 */
interface Message {
    /**
     * Gets the content of the message.
     *
     * @return The content of the message.
     */
    String getContent();
}

/**
 * Defines the behavior for an email message.
 */
interface EmailMessage extends Message {
    /**
     * Gets the subject of the email.
     *
     * @return The subject of the email.
     */
    String getSubject();
}

/**
 * Defines the behavior for a text message.
 */
interface TextMessage extends Message {
    /**
     * Gets the recipient of the text message.
     *
     * @return The recipient of the text message.
     */
    String getRecipient();
}

/**
 * Represents an email message.
 */
class SimpleEmail implements EmailMessage {
    private String subject;
    private String content;

    public SimpleEmail(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public String getContent() {
        return content;
    }
}

/**
 * Represents a text message.
 */
class SimpleText implements TextMessage {
    private String recipient;
    private String content;

    public SimpleText(String recipient, String content) {
        this.recipient = recipient;
        this.content = content;
    }

    @Override
    public String getRecipient() {
        return recipient;
    }

    @Override
    public String getContent() {
        return content;
    }
}

/**
 * Represents a message sender.
 */
class MessageSender {
    /**
     * Sends a message.
     *
     * @param message The message to send.
     */
    public void sendMessage(Message message) {
        System.out.println("Sending message: " + message.getContent());
    }
}

/**
 * Demonstrates the usage of message sending functionality.
 */
public class MessagingDemo {
    public static void main(String[] args) {
        // Sending an email
        EmailMessage emailMessage = new SimpleEmail("Hello", "This is a test email");
        MessageSender sender = new MessageSender();
        sender.sendMessage(emailMessage);

        // Sending a text message
        TextMessage textMessage = new SimpleText("John", "Hey there!");
        sender.sendMessage(textMessage);
    }
}
/**
*We have defined three interfaces: Message, EmailMessage, and TextMessage.
*Message provides the basic behavior for a message.
*EmailMessage extends Message and adds behavior specific to email messages (in this case, getting the subject).
*TextMessage extends Message and adds behavior specific to text messages (in this case, getting the recipient).
*SimpleEmail and SimpleText are concrete implementations of EmailMessage and TextMessage respectively.
*MessageSender is a class responsible for sending messages. It takes a Message as a parameter, demonstrating that it can work with any type of message without knowing its specific implementation.
*/
