package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;

public class IntentReaderActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTest() {
		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSendText() {
		String text = "Ello World!";
		int code = IntentReaderActivity.NORMAL;
		IntentReaderActivity activity = startWithText(text, code);
		assertEquals("Is this text correct?", text, activity.getText());
		
	}
	
	public void testDoubleText() {
		String text = "Hello";
		IntentReaderActivity activity = startWithText(text,
				IntentReaderActivity.DOUBLE); 
		assertEquals("Double transform working?", text+text, 
				activity.getText());
	}
	
	public void testReverseText() {
		String text = "Ello";
		IntentReaderActivity activity = startWithText(text,
				IntentReaderActivity.REVERSE); 
		assertEquals("Reverse transform working?", "ollE", 
				activity.getText());
	}
	
	public void testDisplayText() {
		String text = "Ello world";
		IntentReaderActivity activity = startWithText(text,
				IntentReaderActivity.NORMAL);
		assertEquals("correct text?", text, activity.getText());
		
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("display correct text?", text, view.getText().toString());
	}
	
	public void testDefaultText() {
		IntentReaderActivity activity = startWithText(null,
				IntentReaderActivity.NORMAL);
		assertEquals("default text not werking?", "No Text Sent", 
				activity.getText());
	}
	
	public void testVisible() {
		String text = "Ello world";
		IntentReaderActivity activity = startWithText(text,
				IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.getWindow().getDecorView().findViewById(R.id.intentText);
		ViewAsserts.assertOnScreen(activity.getWindow().getDecorView(), view);
	}
	
	private IntentReaderActivity startWithText(String text, int code) {
		if (text == null) {
			text = "No Text Sent";
		}
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, code);
		setActivityIntent(intent);
		return (IntentReaderActivity)getActivity();
	}

}