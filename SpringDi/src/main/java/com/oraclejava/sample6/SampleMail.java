package com.oraclejava.sample6;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class SampleMail {
	private MailSender mailSender; //SMTP
	
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendMail(String from, String to, String subject, String message) {
		SimpleMailMessage smsg = new SimpleMailMessage();
		
		smsg.setFrom(from); //보내는 사람
		smsg.setTo(to); //받는 사람
	    smsg.setSubject(subject); //제목
	    smsg.setText(message); //내용
	    
	    this.mailSender.send(smsg); //전송
	}

}
