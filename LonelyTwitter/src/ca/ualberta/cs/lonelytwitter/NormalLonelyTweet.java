package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}
	
		return true;
	}
	@Override
	public String toString() {
		return getTweetDate() + " | " + getTweetBody();
	}
}