import java.util.Scanner;


public class YearMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Six Digit Date:");
		String userDateString = scanner.next();
		String[] userDateArray = new String[userDateString.length()];
		
		if(userDateString.length() == 6){
			for(int i = 0; i < userDateString.length(); i++){
				userDateArray[i] = String.valueOf(userDateString.charAt(i));
			}
			
			//System.out.println(String.valueOf(userDateString).substring(4));
			
			String date = String.valueOf(userDateString).substring(4);
			
			if (
					date.equals("01") || 
					date.equals("02") || 
					date.equals("03") || 
					date.equals("04") || 
					date.equals("05") || 
					date.equals("06") || 
					date.equals("07") || 
					date.equals("08") || 
					date.equals("09") || 
					date.equals("10") || 
					date.equals("11") || 
					date.equals("12")
					) {
				int dateInInt = Integer.parseInt(date);
				
				switch (dateInInt) {
				case 1:
					System.out.println("JAN"+userDateArray[2]+userDateArray[3]);
					break;
				case 2:
					System.out.println("FAB"+userDateArray[2]+userDateArray[3]);
					break;
				case 3:
					System.out.println("MAR"+userDateArray[2]+userDateArray[3]);
					break;
				case 4:
					System.out.println("APR"+userDateArray[2]+userDateArray[3]);
					break;
				case 5:
					System.out.println("MAY"+userDateArray[2]+userDateArray[3]);
					break;
				case 6:
					System.out.println("JUN"+userDateArray[2]+userDateArray[3]);
					break;
				case 7:
					System.out.println("JUL"+userDateArray[2]+userDateArray[3]);
					break;
				case 8:
					System.out.println("AUG"+userDateArray[2]+userDateArray[3]);
					break;
				case 9:
					System.out.println("SEP"+userDateArray[2]+userDateArray[3]);
					break;
				case 10:
					System.out.println("OCT"+userDateArray[2]+userDateArray[3]);
					break;
				case 11:
					System.out.println("NOV"+userDateArray[2]+userDateArray[3]);
					break;
				case 12:
					System.out.println("DEC"+userDateArray[2]+userDateArray[3]);
					break;
				
				default:
					break;
				}
			} else {
				System.out.println("Last to Digit Shuold between 01 to 12");
			}
			
		} else {
			System.out.println("Six Digit Limitation");
		}
	}

}
