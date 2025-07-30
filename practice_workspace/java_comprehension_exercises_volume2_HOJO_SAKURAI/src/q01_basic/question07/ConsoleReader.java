package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	/**
	 * 5
	 */
	public int inputNumber()throws IOException,NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		int inputNumber = Integer.parseInt(inputString);
		return inputNumber;
	}
}
