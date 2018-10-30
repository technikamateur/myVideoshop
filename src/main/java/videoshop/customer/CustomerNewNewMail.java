package videoshop.customer;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class CustomerNewNewMail {
  
    private final JavaMailSender emailSender;
    
    public CustomerNewNewMail (JavaMailSender emailSender) {
    	this.emailSender = emailSender;
    }
    
    public void sendMessage(SimpleMailMessage message) {
        emailSender.send(message);
    }
}