package com.exam.twitter.models;

public class Message {

	private String content;
	private Category category;
	
	public Message() {
		
	}
	
	public Message(String content, Category category) {
		super();
		this.content = content;
		this.category = category;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Message [content=" + content + ", category=" + category + "]";
	}
	
}
