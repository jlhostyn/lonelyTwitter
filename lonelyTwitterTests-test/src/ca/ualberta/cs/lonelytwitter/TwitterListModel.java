package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TwitterListModel {
private int count;
private ArrayList<LonelyTweetModel> tweetList;
	
	public TwitterListModel() {
		count=0;
		tweetList = new ArrayList<LonelyTweetModel>();
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	//returns array 
	public LonelyTweetModel[] getTweets() {
		// TODO Auto-generated method stub
		LonelyTweetModel[] tweetArray = new LonelyTweetModel[tweetList.size()];
		for(int i=0; i<tweetArray.length; i++) {
			tweetArray[i] = tweetList.get(i);
		}
		return tweetArray;
	}

	public void addTweet(LonelyTweetModel addTweet) {
		// TODO Auto-generated method stub
		//check if one of the tweets is already in the list
		if (tweetList.contains(addTweet)){
			throw  new IllegalArgumentException();
		}
		tweetList.add(addTweet);
		count++;
		
	}

}
