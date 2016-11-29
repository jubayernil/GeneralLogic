import java.util.Scanner;

public class SquareText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter text:");
		String text = scanner.nextLine();
		String[] textArray = new String[text.length()]; 
		
		for(int i = 0; i < text.length(); i++){
			textArray[i] = String.valueOf(text.charAt(i));
		}
		
		int size = (int) Math.sqrt(textArray.length);
		int count = 0;
		for(int i = 0; i < textArray.length; i++){
			count++;
			System.out.print(textArray[i]);
			if(count % size == 0){
				System.out.println();
			}
		}
	}

}
