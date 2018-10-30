package videoshop.customer;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class CustomerNewMail {
  
    private final JavaMailSender emailSender;
    private SimpleMailMessage message;
    
    CustomerNewMail (JavaMailSender emailSender) {
    	this.emailSender = emailSender;
    	message = new SimpleMailMessage();
    }
 
    public void sendMessage() {
        emailSender.send(message);
    }
    
    public void setTo(String to) {
    	message.setTo(to);
    }
    
    public void setSubject(String subject) {
    	message.setSubject(subject);
    }
    
    public void setText(String text) {
    	message.setText(text);
    }
}