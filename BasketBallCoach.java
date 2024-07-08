package player;
/*
 * 篮球教练
 */
public class BasketBallCoach extends Coach implements SpeakEnglish{

	@Override
	public void speak() {
		System.out.println("说英语");
		
	}

	@Override
	public void teach() {
		System.out.println("教篮球");
		
	}
	
}
