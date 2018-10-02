package com.cpqi.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.cpqi.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
