package com.exam.twitter.models;

public class Message {

	private Integer id;
	private String content;
	private Category category;
	private String authorName;
	
	public Message() {
		
	}
	
	public Message(Integer id,String content, Category category, String authorName) {
		this.id =id;
		this.content = content;
		this.category = category;
		this.authorName = authorName;
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

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
