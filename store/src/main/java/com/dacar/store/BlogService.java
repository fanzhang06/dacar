package com.dacar.store;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.views.ViewBundle;

public class BlogService extends Service<BlogConfiguration>{
	public static void main(String[] args) throws Exception {
		new BlogService().run(new String[] {"server"});
	}

	@Override
	public void initialize(Bootstrap<BlogConfiguration> arg0) {
		// TODO Auto-generated method stub
		arg0.setName("blog");
		arg0.addBundle(new ViewBundle());
		
	}

	@Override
	public void run(BlogConfiguration arg0, Environment arg1) throws Exception {
		arg1.addResource(new IndexResource());
		
		arg1.addResource(new TestResource(new Blog("Day 12: OpenCV--Face Detection for Java Developers",
                "https://www.openshift.com/blogs/day-12-opencv-face-detection-for-java-developers")));
	}
}
