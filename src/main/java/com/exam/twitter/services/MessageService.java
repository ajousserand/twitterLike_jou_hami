package com.exam.twitter.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exam.twitter.configuration.SecurityConfig;
import com.exam.twitter.dtos.MessageDTO;
import com.exam.twitter.models.Message;
import com.exam.twitter.repositories.MessageRepository;


@Service
public class MessageService {
	
	private MessageRepository messageRepository;
	
	public MessageService(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}
	
	public List<MessageDTO> getMessages() {
		List<Message> messages = messageRepository.getMessages();
		List<MessageDTO> messagesDtos = new ArrayList<>();
		
		messages.forEach((message) -> { 
					messagesDtos.add(new MessageDTO(message.getId().toString(), message.getContent(), message.getCategory())); 
				});
		
		return messagesDtos;
	}
	
	public void addMessage(MessageDTO messageDTO) {
		Message message = new Message();
		message.setContent(messageDTO.content());
		message.setCategory(messageDTO.category());
		message.setAuthorName(SecurityConfig.getUserName());
		messageRepository.save(message);
	}
	
}
