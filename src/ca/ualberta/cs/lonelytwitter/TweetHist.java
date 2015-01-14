package ca.ualberta.cs.lonelytwitter;

public abstract class TweetHist extends NormalTweetModel {
	private User tweeter = new Author();
	private User liker = new Reader();
	public TweetHist(User tweeter, User liker, String tweet) {
		super(tweet);
		this.liker = liker;
		this.tweeter = tweeter;
	}
	
	public User getTweeter() {
		return tweeter;
	}
	
	public User getLiker() {
		return liker;
	}
	
	public abstract void undo();
	
}
