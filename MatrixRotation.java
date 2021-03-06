import java.util.Scanner;


public class MatrixRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = 4;
	    int[][] matrix = new int[size][size];
	    System.out.println("Enter the elements of matrix:");
	    for (int i = 0; i < size ; i++) {
	        for (int j = 0; j < size; j++) {

	            matrix[i][j] = scan.nextInt();
	        }
	    }
	    trace(matrix, size);
	    rotate(matrix);
	    System.out.println("________________________");
	    trace(matrix, size);
	}
	
	public static void rotate(int[][] matrix){
	    int stop = matrix.length -1;

	    rotate(matrix, stop, 0);
	}

	public static void rotate(int[][] matrix, int stop, int start){

	    if(start - stop == 1) return;

	    int [] temp = new int[stop-start];

	    //save top row in an array
	    for (int i = 0; i < stop-start ; i++) {
	        temp[i] = matrix[start][start+i+1];
	    }
	    //System.out.println(Arrays.toString(temp));

	    //left goes to top
	    for (int i = start; i < stop ; i++) {
	        matrix[start][start+stop-i] = matrix[i][start];
	    }

	    //bottom goes to left
	    for (int i = start; i < stop ; i++) {
	        matrix[i][start] = matrix[stop][i];
	    }

	    //right goes to bottom
	    for (int i = start; i < stop ; i++) {
	        matrix[stop][i] = matrix[start+stop-i][stop];
	    }

	    //temp array goes to right
	    for (int i = 0; i < temp.length ; i++) {
	        matrix[start + i + 1][stop] = temp[i];
	    }

	    rotate(matrix, stop-1, start + 1);
	}



	public static void trace(int[][] matrix, int size){
	    for (int i = 0; i < size; i++) {
	        for (int j = 0; j < size ; j++) {
	            System.out.print(matrix[i][j]);

	        }
	        System.out.println();
	    }
	}

}
