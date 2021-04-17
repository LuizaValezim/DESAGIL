package exercicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date date;
	private String title;
	private String content;
	private List<String> tags;
	private List<Comment> comments;
	
	public Post(String title, String content) {
		this.date = new Date();
		this.title = title;
		this.content = content;
		this.tags = new ArrayList<>();
		this.comments = new ArrayList<>();
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public boolean contains(String tag) {
		boolean contem = false;
		if (!tag.isBlank()) {
			contem = true;
		}
		return contem;
	}
	
	
	// Métodos
	public void addTag(String tag) {
		this.tags.add(tag);
	}
	
	public void addComment(String author, String content) {
		Comment comment = new Comment(author, content);
		this.comments.add(comment);	
	}
}
