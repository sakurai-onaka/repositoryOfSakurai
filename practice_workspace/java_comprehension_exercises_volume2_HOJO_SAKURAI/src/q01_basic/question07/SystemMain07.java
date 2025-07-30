package q01_basic.question07;

import java.io.IOException;

public class SystemMain07 {

	public static void main(String[] args) {

		NumberList numberList = new NumberList();
		/**
		 * 6.1
		 */
		ConsoleReader cr = new ConsoleReader();

		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;
		//TODO ここから実装する
		/**
		 * 6.2
		 * 6.2.1
		 * 6.2.2
		 */
		try {
			limit = cr.inputNumber();
			numberList.addFromOneTo(limit);
			System.out.println(numberList.getNumbers());
			System.out.println("****************");
			System.out.println("Listの合計を計算します");
			int sum = 0;
			//TODO ここから実装する
			limit = numberList.getNumbers().size();
			sum = numberList.calcSumOfList();
			System.out.println("1から" + limit + "までの合計は" + sum + "です。");

			System.out.println("****************");
			System.out.println("Listの各要素を2倍します");
			//TODO ここから実装する
			numberList.doubleListEachValue();
			System.out.println(numberList.getNumbers());
			System.out.println("****************");
			System.out.println("Listの前半分のインデックスの要素を削除します");
			//TODO ここから実装する
			numberList.removeIndexOfFirstHalf();
			System.out.println(numberList.getNumbers());
		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
		}
		/*		*//**
					* 6.2
					* 6.2.1
					* 6.2.2
					*/
		/*
		try {
		int inputNumber = cr.inputNumber();
		} catch (IOException | NumberFormatException e) {
		e.printStackTrace();
		}
		*//**
			* 6.3
			*/
		/*
		System.out.println("任意の整数をList に代入します");
		System.out.print("input number>>");
		numberList.addFromOneTo(20);
		
		*//**
			* 6.4
			*/
		/*
		System.out.println(numberList.getNumbers());
		System.out.println("****************");
		*//**
			* 6.5
			*/
		/*
		System.out.println("List の合計を計算します");
		System.out.println("1から" + numberList.getNumbers().size() + "までの合計は" + numberList.calcSumOfList() + "です");
		System.out.println("****************");
		
		*//**
			* 6.6
			* 6.7
			*/
		/*
		System.out.println("List の各要素を2 倍します ");
		numberList.doubleListEachValue();
		System.out.println(numberList.getNumbers());
		System.out.println("****************");
		*//**
			* 6.8
			*//*
				numberList.removeIndexOfFirstHalf();
				System.out.println(numberList.getNumbers());
				System.out.println("****************");*/
	}

}
