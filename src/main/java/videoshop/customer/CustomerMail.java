package videoshop.customer;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class CustomerMail {

	private String mailText;
	private String reciever;
	private SimpleMailMessage msg;
	private JavaMailSenderImpl mailSender;
	
	CustomerMail() {
		mailText = "Vielen Dank für ihre Registrierung. Se schuldne uns seear fiel gelt!";	
		mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.mailtrap.io");

		mailSender.setPort(2525);
		mailSender.setUsername("0c84e9b0d90249");
		mailSender.setPassword("424f47843a6368");
	}
	
	public void setReciever(String reciever) {
		this.reciever = reciever;
	}
	
	public void sendMsg() {
		msg = new SimpleMailMessage();
		
		msg.setTo(reciever);
		msg.setText(mailText);
		msg.setSubject("Drei Chinesen");
		
		try {
            this.mailSender.send(msg);
        }
        catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }
	}
	
}