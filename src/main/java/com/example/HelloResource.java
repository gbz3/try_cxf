package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path( "/hello" )
public class HelloResource {
	
	@GET
	@Produces( "text/html" )
	public String getString() {
		return "<html>Hello World!</html>";
	}

}
