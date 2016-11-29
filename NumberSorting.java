import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberSorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("How many number you want to sort? Enter:");
		int listSize = scan.nextInt();

		ArrayList<Integer> numberList = new ArrayList<Integer>();
		System.out.println("Enter Numbers:");
		for (int i = 0; i < listSize; i++) {
			numberList.add(scan.nextInt());
		}
		Collections.sort(numberList);
		for (int number : numberList) {
			System.out.println(number);
		}
	}
}
