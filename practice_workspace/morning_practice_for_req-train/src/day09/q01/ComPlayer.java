package day09.q01;

import java.io.IOException;

public class ComPlayer implements Playable{
	public int doJanken() throws IOException{
			int result = (int) Math.random() * 2;
			System.out.println("コンピュータは" + result + "を選んだ");
			return result;
	}
}
