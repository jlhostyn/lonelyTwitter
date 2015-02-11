package ca.ualberta.cs.lonelytwitter;

public class Author extends User {

	// name will be this default if no argument is given when a new Author is made
	// else, if argument name is given, an exception will be raised since constructors 
	//aren't inherited
	public Author() {
		super();
		name = "anonymous_author";
	}

	public Author(String name) {
		super(name);
	}

	public void setName(String x) {
		name = x;
	}

}
