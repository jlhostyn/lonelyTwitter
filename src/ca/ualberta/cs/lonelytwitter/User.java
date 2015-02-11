package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User extends Object implements UserLike {
	protected String name;

	public String getName() {
		return name;
	}

	// every subclass needs one of these methods with the abstract modifier
	public abstract void setName(String x) throws IOException;

	public User(String name) {
		super();
		this.name = name;
	}
	
	public User() {
		super();
		this.name = "anonymous";
	}
	
}
