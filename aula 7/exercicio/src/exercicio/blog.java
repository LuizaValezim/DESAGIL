package exercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class blog {
	private String nome;
	private List<String> tags;
	private List<Post> posts;
	
	public blog(String nome, List<String> tags, List<Post> posts){
		this.nome = nome;
		this.tags = new ArrayList<>();
		this.posts = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getTags() {
		return tags;
	}

	public List<Post> getPosts() {
		return posts;
	}
	
	// Métodos
	public void addPost(String title, String content, List<String> tags) {
		Post post = new Post(title, content);
		
		for (String tag: this.tags) {
			post.addTag(tag);
			if (!this.tags.contains(tag)) {
				this.tags.add(tag);
			}
		}
		this.posts.add(post);
	}
	
	private List<Post> getPostWithTag(String tag) {
		List<Post> postsWith = new ArrayList<>();
		
		for (Post post: this.posts) {
			if (post.contains(tag)) {
				postsWith.add(post);
			}
		}
		return postsWith;
	}
	
	public  Map<String, List<Post>> getPostsPerTag() {
		Map<String, List<Post>> postsPerTag = new HashMap<>();
		for (String tag : this.tags) {
				postsPerTag.put(tag, getPostWithTag(tag));
		}
		return postsPerTag;
	}
}

