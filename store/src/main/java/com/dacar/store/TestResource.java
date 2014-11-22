package com.dacar.store;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dacar.store.view.BlogView;

@Path("/test")
public class TestResource {

private final Blog blog;
	
	public TestResource (Blog blog) {
		this.blog = blog;
	}
	
	@GET
    @Produces(value = MediaType.TEXT_HTML)
	public BlogView getBlog() {
		return new BlogView (this.blog);
	}

}
