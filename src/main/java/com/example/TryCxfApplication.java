package com.example;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class TryCxfApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		HashSet<Class<?>> set = new HashSet<Class<?>>();
		//set.add( CustomerResource.class );
		return set;
	}
	
	@Override
	public Set<Object> getSingletons() {
		HashSet<Object> set = new HashSet<Object>();
		set.add( new CustomerResource() );
		set.add( new HelloResource() );
		return set;
	}

}
