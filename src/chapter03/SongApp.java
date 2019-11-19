package chapter03;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
		song.show();
		
		Song song2 = new Song("원더우먼", "브라운아이드걸스");
		song2.show();
	}

}
