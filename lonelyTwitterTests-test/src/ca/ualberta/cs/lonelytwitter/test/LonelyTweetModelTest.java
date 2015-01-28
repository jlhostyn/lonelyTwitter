package ca.ualberta.cs.lonelytwitter.test;
import java.util.Date;
import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class LonelyTweetModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LonelyTweetModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testSampleCode(){
		//This test passes since 7 is >= 6
		//assertTrue("This is not true", isGreaterEqual(7,6));
		
		//assertEquals("5 should equal 5",5,5);
		
		//assertFalse("This is not true", isGreaterEqual(7,6));
		
		//this would fail
		//assertTrue("This is not true", isGreaterEqual(7,6));
		
		//fail("This is a failing test!!!!!!!!!!!!!");
	}

	private boolean isGreaterEqual(int i, int j) {
		if(i>=j)
			return true;
		return false;
	}
	
	public void testEqual() {
		NormalTweetModel tweet1 = new NormalTweetModel("Hi", new Date());
		ImportantTweetModel tweet2 = new ImportantTweetModel("Hi");
		NormalTweetModel tweet3 = new NormalTweetModel("Hi", new Date());
		
		assertFalse(tweet2.equals(tweet1));
	}

}
