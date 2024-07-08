package player;
/*
 * 篮球运动员
 */
public class BasketBallPlayer extends Player implements SpeakEnglish {

	@Override
	public void speak() {
		System.out.println("说英语");
		
	}

	@Override
	public void study() {
		System.out.println("学扣篮");
		
	}
	
}
