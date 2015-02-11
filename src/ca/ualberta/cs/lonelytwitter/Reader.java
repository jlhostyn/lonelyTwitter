package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public class Reader extends User {
	private static final Boolean enabled = false;
	//only readers have restrictions of their names.
	public void setName(String x) throws IOException {
		if (x.length() > 8) {
			throw new IOException("Name Too Long!");
		}
		this.name = x;
	}

	
}
