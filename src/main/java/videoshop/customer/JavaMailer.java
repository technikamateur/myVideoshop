package videoshop.customer;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class JavaMailer {
  
    private final JavaMailSender emailSender;
    
    public JavaMailer (JavaMailSender emailSender) {
    	this.emailSender = emailSender;
    }
    
    public void sendCustomerRegistrationMessage(String email) {
        SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("Registrierung");
		message.setText("Sie haben sich erfolgreich registriert!");
		sendMail(message);
    }
    
    private void sendMail (SimpleMailMessage message) {
    	emailSender.send(message);
    }
}