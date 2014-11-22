package com.dacar.store.view;

import com.dacar.store.Blog;
import com.yammer.dropwizard.views.View;

public class BlogView extends View{
	
	private final Blog blog;

	public BlogView(Blog templateName) {
		super("blog.ftl");
		this.blog = templateName;
	}
	


	public Blog getBlog() {
		return blog;
	}

}
