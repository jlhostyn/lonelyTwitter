package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TwitterListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TwitterListModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	TwitterListModel tweets;
	public TwitterListModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		tweets = new TwitterListModel();
	}
	
	public void testCount() {
		NormalTweetModel normalTweet = new NormalTweetModel("Hello");
		tweets.addTweet(normalTweet);
		assertEquals("Count should be zer0", tweets.getCount(),1);
	}
	
	public void testAddTweets() {
		NormalTweetModel normalTweet = new NormalTweetModel("HI");
		tweets.addTweet(normalTweet);
		assertEquals("There should be a tweet in teh list", 1, tweets.getTweets().size());
		assertNotNull("The tweets list is not initialized", tweets.getTweets());
	}
	
	public void testContains() {
		NormalTweetModel normalTweet = new NormalTweetModel("HI");
		NormalTweetModel normalTweet2 = new NormalTweetModel("Hey");
		tweets.addTweet(normalTweet);
		tweets.addTweet(normalTweet2);
		
		//should fail here (line 41)
		tweets.addTweet(normalTweet);
	}

}
