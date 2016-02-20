package com.mailspring.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mailspring.common.MailSender;

@RestController
public class RootController {

	private MailSender mailSender;

	@Autowired
	public RootController(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	@RequestMapping("/")
	public String home() throws MessagingException {

		mailSender.send("mesutsaritas24@gmail.com", "Mail Example", "Mail from spring");
		return "Send Mail Example";

	}

}
