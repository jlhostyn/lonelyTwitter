package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class NormalTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public NormalTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testEquals() {
		Date date = new Date();
		NormalTweetModel Tweet1 = new NormalTweetModel("Hi", date);
		NormalTweetModel Tweet2 = new NormalTweetModel("Hi", new Date(4654765));
		
		//assertTrue("Same tweets are same", Tweet1.equals(Tweet2));
	}
}
