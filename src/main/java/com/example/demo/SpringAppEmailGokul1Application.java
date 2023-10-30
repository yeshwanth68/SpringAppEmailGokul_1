package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.demo.service.EmailSenderService;

import jakarta.mail.MessagingException;

@SpringBootApplication
public class SpringAppEmailGokul1Application {

	@Autowired
	private EmailSenderService senderService;
	public static void main(String[] args) {
		SpringApplication.run(SpringAppEmailGokul1Application.class, args);
	}
	
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		senderService.sendSimpleEmail("gokulr2105@gmail.com",
				"Hi Gokul, This is Mail from Yeshwanth Kumar",
				"Auto Mail by Yeshwanth");

	}

}
