package exercicio;

import java.util.Date;

public class Comment {
	private Date date;
	private String author;
	private String content;
	
	public Comment(String author, String content) {
		this.date = new Date();
		this.author = author;
		this.content = content;
	}

	public Date getDate() {
		return this.date;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getContent() {
		return this.content;
	}
}