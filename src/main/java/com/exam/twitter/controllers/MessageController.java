package com.exam.twitter.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exam.twitter.dtos.MessageDTO;
import com.exam.twitter.services.MessageService;


@Controller
@RequestMapping(value = "/private/message")
public class MessageController {
	private MessageService messageService;
	
	public MessageController(MessageService messageService) {
		this.messageService = messageService;
	}
	
	@GetMapping("")
	public ModelAndView getMessages() {
		List<MessageDTO> messages = messageService.getMessages();
		ModelAndView mav = new ModelAndView("message");
		mav.addObject("message", messages);
		return mav;
	}
	
	
	@GetMapping("/add")
	public ModelAndView addMessage() {
		ModelAndView mav = new ModelAndView("addmessage");
		
		mav.addObject("message", new MessageDTO("", "", null));
		return mav;
	}
	
	@PostMapping("/add")
	public ModelAndView addPost( @ModelAttribute() MessageDTO message ) {
		messageService.addMessage(message);
		return new ModelAndView("redirect:/private/post");
	}
}
